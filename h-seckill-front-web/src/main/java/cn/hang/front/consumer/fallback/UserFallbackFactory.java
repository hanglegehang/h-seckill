package cn.hang.front.consumer.fallback;

import cn.hang.front.consumer.UserClient;
import cn.hang.hseckill.common.constant.ResponseMessageEnum;
import cn.hang.hseckill.common.pojo.Response;
import cn.hang.hseckill.pojo.dto.LoginRegisterInfoDTO;
import cn.hang.hseckill.pojo.po.AddressPO;
import cn.hang.hseckill.pojo.po.UserPO;
import cn.hang.hseckill.pojo.vo.front.UserVO;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author lihang15
 */
@Slf4j
@Component
public class UserFallbackFactory implements FallbackFactory<UserClient> {
    @Override
    public UserClient create(Throwable cause) {
        return new UserClient() {
            @Override
            public Response<UserPO> getUserByUserName(String username) {
                log.error("UserClient.getUserByUserName failBack,username={}", username, cause);
                return Response.error(ResponseMessageEnum.NETWORK_ERROR);
            }

            @Override
            public Response<UserVO> registerUser(LoginRegisterInfoDTO loginRegisterInfoDTO) {
                log.error("UserClient.insertUser failBack,loginRegisterInfoDTO={}", loginRegisterInfoDTO, cause);
                return Response.error(ResponseMessageEnum.NETWORK_ERROR);
            }

            @Override
            public Response<List<AddressPO>> addressList(Long userId) {
                log.error("UserClient.addressList failBack,userId={}", userId, cause);
                return Response.error(ResponseMessageEnum.NETWORK_ERROR);
            }

            @Override
            public Response addAddress(AddressPO addressPO) {
                log.error("UserClient.addAddress failBack,addressPO={}", addressPO, cause);
                return Response.error(ResponseMessageEnum.NETWORK_ERROR);
            }


            @Override
            public Response deleteAddress(Long addressId, Long userId) {
                log.error("UserClient.deleteAddress failBack,addressId={},userId={}", addressId, userId, cause);
                return Response.error(ResponseMessageEnum.NETWORK_ERROR);
            }

            @Override
            public Response updateAddress(AddressPO addressPO) {
                log.error("UserClient.updateAddress failBack,addressVO={}", addressPO, cause);
                return Response.error(ResponseMessageEnum.NETWORK_ERROR);
            }

            @Override
            public Response<UserVO> loginCheck(LoginRegisterInfoDTO loginRegisterInfoDTO) {
                log.error("UserClient.loginCheck failBack,loginRegisterInfoDTO={}", loginRegisterInfoDTO, cause);
                return Response.error(ResponseMessageEnum.NETWORK_ERROR);
            }
        };
    }
}

