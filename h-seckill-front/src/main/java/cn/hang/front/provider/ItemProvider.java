package cn.hang.front.provider;

import cn.hang.front.mapper.*;
import cn.hang.hseckill.common.constant.CodeBaseInterface;
import cn.hang.hseckill.common.constant.Global;
import cn.hang.hseckill.common.pojo.Response;
import cn.hang.hseckill.pojo.po.*;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author lihang15
 * @description
 * @create 2018-12-04 19:01
 **/
@Slf4j
@RestController
@RequestMapping("/item")
public class ItemProvider {

    @Autowired
    private PanelPOMapper panelPOMapper;

    @Autowired
    private PanelContentPOMapper panelContentPOMapper;

    @Autowired
    private ItemPOMapper itemPOMapper;

    @Autowired
    private SeckillItemPOMapper seckillItemPOMapper;


    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping("/home")
    public Response home() {
        Response response;
        String homeInfo = stringRedisTemplate.opsForValue().get(Global.CACHE_SECKILL_HOME_INFO);
        if (StringUtils.isNotBlank(homeInfo)) {
            response = JSON.parseObject(homeInfo, Response.class);
            return response;
        }

        PanelPOExample panelPOExample = new PanelPOExample();
        panelPOExample.setOrderByClause("sort_order");
        panelPOExample.createCriteria().andIsDeleteEqualTo(CodeBaseInterface.DeleteEnum.NOT_DELETE.getCode())
                .andStatusEqualTo(CodeBaseInterface.StatusEnum.USED.getCode())
                .andPositionEqualTo(CodeBaseInterface.PanelPositionEnum.INDEX.getCode());
        List<PanelPO> list = panelPOMapper.selectByExample(panelPOExample);
        for (PanelPO panelPO : list) {
            PanelContentPOExample panelContentPOExample = new PanelContentPOExample();
            PanelContentPOExample.Criteria criteria = panelContentPOExample.createCriteria();
            panelContentPOExample.setOrderByClause("sort_order");
            criteria.andPanelIdEqualTo(Integer.valueOf(String.valueOf(panelPO.getId())));
            List<PanelContentPO> panelContentPOList = panelContentPOMapper.selectByExample(panelContentPOExample);
            for (PanelContentPO panelContentPO : panelContentPOList) {
                if (panelContentPO.getItemId() != null) {
                    ItemPO itemPO = itemPOMapper.selectByPrimaryKey(panelContentPO.getItemId());
                    panelContentPO.setIsSeckillItem(itemPO.getIsSeckill());
                    if (itemPO.getIsSeckill() == CodeBaseInterface.ItemIsSeckillEnum.IN_SECKILL.getCode()) {
                        SeckillItemPO seckillItemPO = seckillItemPOMapper.selectByPrimaryKey(itemPO.getSeckillItemId());
                        panelContentPO.setSeckillItemPO(seckillItemPO);
                    } else {
                        panelContentPO.setItemPO(itemPO);
                    }
                }
            }
            panelPO.setPanelContents(panelContentPOList);
        }
        response = Response.success(list);
        stringRedisTemplate.opsForValue().set(Global.CACHE_SECKILL_HOME_INFO, JSON.toJSONString(response));
        stringRedisTemplate.expire(Global.CACHE_SECKILL_HOME_INFO, 12, TimeUnit.HOURS);
        return response;
    }

    /**
     * 获取商品id
     *
     * @return
     */
    @GetMapping("/{id}")
    Response<ItemPO> getItemById(@PathVariable("id") Long id) {
        String itemJsonString = stringRedisTemplate.opsForValue().get(Global.CACHE_SECKILL_ITEM_INFO + id);
        if (StringUtils.isNotBlank(itemJsonString)) {
            log.info("缓存读取数据");
            ItemPO itemPO = JSON.parseObject(itemJsonString, ItemPO.class);
            return Response.success(itemPO);
        } else {
            ItemPO itemPO = itemPOMapper.selectByPrimaryKey(id);
            if (itemPO.getIsSeckill() == CodeBaseInterface.ItemIsSeckillEnum.IN_SECKILL.getCode()) {
                SeckillItemPO seckillItemPO = seckillItemPOMapper.selectByPrimaryKey(itemPO.getSeckillItemId());
                if (seckillItemPO == null) {
                    return Response.error();
                }
                itemPO.setSeckillItemPO(seckillItemPO);
            }

            stringRedisTemplate.opsForValue().set(Global.CACHE_SECKILL_ITEM_INFO + id, JSON.toJSONString(itemPO));
            stringRedisTemplate.expire(Global.CACHE_SECKILL_ITEM_INFO + id, 12, TimeUnit.HOURS);
            return Response.success(itemPO);
        }
    }


}
