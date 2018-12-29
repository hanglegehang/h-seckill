package cn.hang.front.service.impl;

import cn.hang.front.consumer.CartClient;
import cn.hang.front.service.CartService;
import cn.hang.hseckill.common.pojo.Response;
import cn.hang.hseckill.pojo.vo.front.CartVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lihang15
 * @description
 * @create 2018-12-28 11:37
 **/
@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartClient cartClient;

    @Override
    public Response add(List<CartVO> cartVOList, Long useId) {
        return cartClient.addCart(cartVOList, useId);
    }

    @Override
    public Response<List<CartVO>> list(Long useId) {
        return cartClient.list(useId);
    }

    @Override
    public Response delete(Long useId, Long[] itemIds) {
        return cartClient.delete(useId, itemIds);
    }
}
