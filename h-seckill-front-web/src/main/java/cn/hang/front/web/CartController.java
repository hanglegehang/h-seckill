package cn.hang.front.web;

import cn.hang.front.service.CartService;
import cn.hang.hseckill.common.pojo.Response;
import cn.hang.hseckill.common.utils.UserHome;
import cn.hang.hseckill.pojo.vo.front.CartVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author lihang15
 * @description 购物车
 * @create 2018-12-28 11:36
 **/
@Slf4j
@RequestMapping("/cart")
@RestController
public class CartController {

    @Autowired
    private CartService cartService;

    @PostMapping("/add")
    public Response add(@RequestBody List<CartVO> cartVOList) {
        Long useId = UserHome.currentUserId();
        Response response = cartService.add(cartVOList, useId);
        return response;
    }

    @PostMapping("/list")
    public Response<List<CartVO>> list() {
        Long useId = UserHome.currentUserId();
        Response<List<CartVO>> response = cartService.list(useId);
        return response;
    }

    @PostMapping("/delete")
    public Response delete(@RequestBody Long[] itemIds) {
        Long useId = UserHome.currentUserId();
        Response response = cartService.delete(useId, itemIds);
        return response;
    }


}
