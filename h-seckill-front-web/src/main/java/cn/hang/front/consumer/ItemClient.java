package cn.hang.front.consumer;

import cn.hang.front.consumer.fallback.ItemFallbackFactory;
import cn.hang.hseckill.common.pojo.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

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

}

