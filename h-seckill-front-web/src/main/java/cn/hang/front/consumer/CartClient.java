package cn.hang.front.consumer;

import cn.hang.front.consumer.fallback.CartFallbackFactory;
import cn.hang.hseckill.common.pojo.Response;
import cn.hang.hseckill.pojo.vo.CartVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author lihang15
 */
@Component
@FeignClient(value = "${service.h-seckill-front.name}", path = "${service.h-seckill-front.path}/cart", fallbackFactory = CartFallbackFactory.class)
public interface CartClient {

    /**
     * 添加购物车
     *
     * @param cartVOList
     * @return
     */
    @PostMapping("/add")
    Response addCart(@RequestBody List<CartVO> cartVOList, @RequestParam("userId") Long userId);

    @GetMapping("/list")
    Response<List<CartVO>> list(@RequestParam("userId") Long userId);

    @PostMapping("/delete")
    Response delete(@RequestParam("userId") Long useId, @RequestBody Long[] itemIds);
}

