package cn.hang.front.consumer;

import cn.hang.front.consumer.fallback.UserFallbackFactory;
import cn.hang.hseckill.pojo.dto.LoginRegisterInfoDTO;
import cn.hang.hseckill.pojo.po.UserPO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author lihang15
 */
@Component
@FeignClient(value = "${service.h-seckill-front.name}", path = "${service.h-seckill-front.path}/user", fallbackFactory = UserFallbackFactory.class)
public interface UserClient {
    /**
     * 根据用户名获取用户
     *
     * @param username
     * @return
     */
    @GetMapping("/getUserByUserName")
    UserPO getUserByUserName(@RequestParam("username") String username);

    /**
     * 新增用户
     *
     * @param loginRegisterInfoDTO
     * @return
     */
    @PostMapping("/insertUser")
    int insertUser(@RequestBody LoginRegisterInfoDTO loginRegisterInfoDTO);
}

