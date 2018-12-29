package cn.hang.front.provider;

import cn.hang.front.business.CartBusiness;
import cn.hang.hseckill.common.pojo.Response;
import cn.hang.hseckill.pojo.vo.front.CartVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author lihang15
 * @description
 * @create 2018-12-28 11:55
 **/
@Slf4j
@RestController
@RequestMapping("/cart")
public class CartProvider {


    @Autowired
    private CartBusiness cartBusiness;

    @PostMapping("/add")
    Response addCart(@RequestBody List<CartVO> cartVOList, @RequestParam Long userId) {
        return cartBusiness.add(cartVOList, userId);
    }

    @GetMapping("/list")
    Response<List<CartVO>> list(@RequestParam Long userId) {
        return cartBusiness.list(userId);
    }

    @PostMapping("/delete")
    Response delete(@RequestParam("userId") Long useId, @RequestBody Long[] itemId) {
        return cartBusiness.delete(useId, itemId);

    }
}
