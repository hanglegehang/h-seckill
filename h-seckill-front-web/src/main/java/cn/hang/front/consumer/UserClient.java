package cn.hang.front.consumer;

import cn.hang.front.consumer.fallback.UserFallbackFactory;
import cn.hang.hseckill.pojo.po.UserPO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author lihang15
 */
@Component
@FeignClient(value = "${service.h-seckill-front.name}", path = "${service.h-seckill-front.path}/user", fallbackFactory = UserFallbackFactory.class)
public interface UserClient {
    @GetMapping("/hi")
    String getHotelAccountantRecord();

    @GetMapping("/getUserByUserName")
    UserPO getUserByUserName(@RequestParam("username") String username);
}

