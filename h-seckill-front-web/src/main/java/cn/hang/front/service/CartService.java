package cn.hang.front.service;

import cn.hang.hseckill.common.pojo.Response;
import cn.hang.hseckill.pojo.vo.front.CartVO;

import java.util.List;

public interface CartService {

    /**
     * 添加购物车
     *
     * @param cartVOList
     * @return
     */
    Response add(List<CartVO> cartVOList,Long useId);

    Response<List<CartVO>> list(Long useId);

    Response delete(Long useId, Long[] itemIds);
}
