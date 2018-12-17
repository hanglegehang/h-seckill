package cn.hang.front.service;

import cn.hang.front.consumer.UserClient;
import cn.hang.hseckill.common.pojo.Response;
import cn.hang.hseckill.common.utils.SessionUtils;
import cn.hang.hseckill.pojo.dto.LoginRegisterInfoDTO;
import cn.hang.hseckill.pojo.po.UserPO;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

/**
 * @author lihang15
 * @description
 * @create 2018-12-15 22:32
 **/
@Slf4j
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private UserClient userClient;

    @Override
    public Response<UserPO> loginCheck(LoginRegisterInfoDTO loginRegisterInfoDTO) {
        UserPO userPO = userClient.getUserByUserName(loginRegisterInfoDTO.getUsername());
        if (userPO != null) {
            String inputPassword = DigestUtils.md5DigestAsHex(loginRegisterInfoDTO.getPassword().getBytes());
            if (StringUtils.isNotBlank(userPO.getPassword()) && inputPassword.equals(userPO.getPassword())) {
                SessionUtils.put("userInfo", userPO);
                return Response.success(userPO);
            } else {
                return Response.error("用户名或密码错误");
            }
        }
        return Response.error("用户名或密码错误");
    }

    @Override
    public Response register(LoginRegisterInfoDTO loginRegisterInfoDTO) {
        UserPO userPO = userClient.getUserByUserName(loginRegisterInfoDTO.getUsername());
        if (userPO != null) {
            return Response.error("该用户名已注册");
        }
        int insertCount = userClient.insertUser(loginRegisterInfoDTO);
        if (insertCount == 1) {
            return Response.success();
        }
        return Response.error("注册失败");
    }
}
