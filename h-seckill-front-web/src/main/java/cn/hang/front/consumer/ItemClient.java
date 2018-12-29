package cn.hang.front.consumer;

import cn.hang.front.consumer.fallback.ItemFallbackFactory;
import cn.hang.hseckill.common.pojo.Response;
import cn.hang.hseckill.pojo.vo.front.ItemVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author lihang15
 */
@Component
@FeignClient(value = "${service.h-seckill-front.name}", path = "${service.h-seckill-front.path}", fallbackFactory = ItemFallbackFactory.class)
public interface ItemClient {
    /**
     * 获取首页信息
     *
     * @return
     */
    @GetMapping("/item/home")
    Response getIndexInfo();

    /**
     * 获取商品by id
     *
     * @param id
     * @return
     */
    @GetMapping("/item/{id}")
    Response<ItemVO> getItemById(@PathVariable("id") Long id);
}

