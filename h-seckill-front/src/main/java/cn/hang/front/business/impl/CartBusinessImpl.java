package cn.hang.front.business.impl;

import cn.hang.front.business.CartBusiness;
import cn.hang.front.service.ItemService;
import cn.hang.hseckill.common.constant.CodeBaseInterface;
import cn.hang.hseckill.common.constant.Global;
import cn.hang.hseckill.common.pojo.Response;
import cn.hang.hseckill.pojo.po.ItemPO;
import cn.hang.hseckill.pojo.po.SeckillItemPO;
import cn.hang.hseckill.pojo.vo.AddressVO;
import cn.hang.hseckill.pojo.vo.CartVO;
import cn.hang.hseckill.pojo.vo.ItemVO;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author lihang15
 * @description
 * @create 2018-12-28 16:41
 **/
@Component
public class CartBusinessImpl implements CartBusiness {
    @Autowired
    private StringRedisTemplate redisTemplate;
    @Autowired
    private ItemService itemService;

    @Override
    public Response add(List<CartVO> cartVOList, Long useId) {
        for (CartVO cartVO : cartVOList) {
            boolean cartItemExist = redisTemplate.opsForHash().hasKey(Global.CACHE_SECKILL_CART_INFO + useId, String.valueOf(cartVO.getItemId()));
            ItemPO itemPO = itemService.getItemById(cartVO.getItemId());
            if (itemPO.getIsSeckill() == CodeBaseInterface.ItemIsSeckillEnum.IN_SECKILL.getCode()) {
                SeckillItemPO seckillItemPO = itemService.getSeckillItemById(itemPO.getSeckillItemId());
                if (seckillItemPO != null) {
                    cartVO.setPrice(String.valueOf((seckillItemPO.getItemPrice() * seckillItemPO.getDiscount() / 1000)));
                }
            } else {
                cartVO.setPrice(String.valueOf((itemPO.getPrice() * itemPO.getDiscount()) / 1000));
            }
            JSONArray jsonArray = JSON.parseArray(itemPO.getImageUrl());
            if (jsonArray.size() > 0) {
                cartVO.setItemImg((String) jsonArray.get(0));
            }
            cartVO.setItemName(itemPO.getTitle());
            if (cartItemExist) {
                String cartItemInfo = (String) redisTemplate.opsForHash().get(Global.CACHE_SECKILL_CART_INFO + useId, String.valueOf(cartVO.getItemId()));
                CartVO cacheCartVO = JSON.parseObject(cartItemInfo, CartVO.class);
                Objects.requireNonNull(cacheCartVO);
                cartVO.setBuyNum(cartVO.getBuyNum() + cacheCartVO.getBuyNum());
            }
            redisTemplate.opsForHash().put(Global.CACHE_SECKILL_CART_INFO + useId, String.valueOf(cartVO.getItemId()), JSON.toJSONString(cartVO));
        }
        return Response.success();
    }

    @Override
    public Response<List<CartVO>> list(Long useId) {
        List<Object> cartList = redisTemplate.opsForHash().values(Global.CACHE_SECKILL_CART_INFO + useId);
        List<CartVO> resList = new ArrayList<>();
        for (Object cart : cartList) {
            CartVO cartVO = JSON.parseObject((String) cart, CartVO.class);
            resList.add(cartVO);
        }
        return Response.success(resList);
    }

    @Override
    public Response delete(Long useId, Long[] itemIds) {
        long deleteCount = 0;
        for (Long itemId : itemIds) {
            deleteCount += redisTemplate.opsForHash().delete(Global.CACHE_SECKILL_CART_INFO + useId, String.valueOf(itemId));

        }
        if (deleteCount == itemIds.length) {
            return Response.success();
        } else {
            return Response.error("删除购物车失败");
        }
    }
}
