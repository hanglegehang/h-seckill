package cn.hang.front.business.impl;

import cn.hang.front.business.ItemBusiness;
import cn.hang.front.service.ItemService;
import cn.hang.hseckill.common.constant.CodeBaseInterface;
import cn.hang.hseckill.common.constant.Global;
import cn.hang.hseckill.pojo.po.*;
import cn.hang.hseckill.pojo.vo.front.ItemVO;
import cn.hang.hseckill.pojo.vo.front.PanelContentVO;
import cn.hang.hseckill.pojo.vo.front.PanelVO;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author lihang15
 * @description
 * @create 2018-12-28 13:48
 **/
@Slf4j
@Component
public class ItemBusinessImpl implements ItemBusiness {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private ItemService itemService;

    @Override
    public ItemVO getItemVOById(Long id) {
        String itemJsonString = stringRedisTemplate.opsForValue().get(Global.CACHE_SECKILL_ITEM_INFO + id);
        if (StringUtils.isNotBlank(itemJsonString)) {
            log.info("缓存读取商品数据，itemId={}", id);
            return JSON.parseObject(itemJsonString, ItemVO.class);
        } else {
            ItemPO itemPO = itemService.getItemById(id);
            ItemVO itemVO = getItemVO(itemPO);
            stringRedisTemplate.opsForValue().set(Global.CACHE_SECKILL_ITEM_INFO + id, JSON.toJSONString(itemVO));
            stringRedisTemplate.expire(Global.CACHE_SECKILL_ITEM_INFO + id, 12, TimeUnit.HOURS);
            return itemVO;
        }
    }


    @Override
    public List<PanelVO> getHomeInfo() {
        String homeInfo = stringRedisTemplate.opsForValue().get(Global.CACHE_SECKILL_HOME_INFO);
        if (StringUtils.isNotBlank(homeInfo)) {
            log.info("缓存读取商城首页信息");
            return JSON.parseArray(homeInfo, PanelVO.class);
        } else {
            List<PanelPO> list = itemService.listPanel();
            List<PanelVO> panelVOList = new ArrayList<>();
            for (PanelPO panelPO : list) {
                PanelVO panelVO = new PanelVO();
                BeanUtils.copyProperties(panelPO, panelVO);
                List<PanelContentPO> panelContentPOList = itemService.listPanelContent(panelPO.getId());
                List<PanelContentVO> panelContentVOList = new ArrayList<>();
                for (PanelContentPO panelContentPO : panelContentPOList) {
                    PanelContentVO panelContentVO = new PanelContentVO();
                    BeanUtils.copyProperties(panelContentPO, panelContentVO);
                    if (panelContentPO.getItemId() != null) {
                        ItemPO itemPO = itemService.getItemById(panelContentPO.getItemId());
                        ItemVO itemVO = getItemVO(itemPO);
                        panelContentVO.setItemVO(itemVO);
                    }
                    panelContentVOList.add(panelContentVO);
                }
                panelVO.setPanelContents(panelContentVOList);
                panelVOList.add(panelVO);
            }
            stringRedisTemplate.opsForValue().set(Global.CACHE_SECKILL_HOME_INFO, JSON.toJSONString(panelVOList));
            stringRedisTemplate.expire(Global.CACHE_SECKILL_HOME_INFO, 12, TimeUnit.HOURS);
            return panelVOList;
        }
    }

    private ItemVO getItemVO(ItemPO itemPO) {
        ItemVO itemVO = new ItemVO();
        BeanUtils.copyProperties(itemPO, itemVO);
        if (itemPO.getIsSeckill() == CodeBaseInterface.ItemIsSeckillEnum.IN_SECKILL.getCode()) {
            SeckillItemPO seckillItemPO = itemService.getSeckillItemById(itemPO.getSeckillItemId());
            if (seckillItemPO == null) {
                return null;
            }
            itemVO.setDiscount(seckillItemPO.getDiscount());
            itemVO.setPrice(seckillItemPO.getItemPrice());
            itemVO.setSellPoint(seckillItemPO.getItemSellPoint());
            itemVO.setTitle(seckillItemPO.getItemTitle());
            itemVO.setItemSellLimit(seckillItemPO.getItemSellLimit());
            itemVO.setStartTime(seckillItemPO.getStartTime());
            itemVO.setEndTime(seckillItemPO.getEndTime());
        }
        return itemVO;
    }
}
