package cn.hang.front.consumer.fallback;

import cn.hang.front.consumer.UserClient;
import cn.hang.hseckill.pojo.dto.LoginRegisterInfoDTO;
import cn.hang.hseckill.pojo.po.UserPO;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class UserFallbackFactory implements FallbackFactory<UserClient> {
    @Override
    public UserClient create(Throwable cause) {
        return new UserClient() {
            @Override
            public UserPO getUserByUserName(String username) {
                log.error("UserClient.getUserByUserName failBack,username={}", username, cause);
                return null;
            }

            @Override
            public int insertUser(LoginRegisterInfoDTO loginRegisterInfoDTO) {
                log.error("UserClient.insertUser failBack,loginRegisterInfoDTO={}", loginRegisterInfoDTO, cause);
                return 0;
            }
        };
    }
}

