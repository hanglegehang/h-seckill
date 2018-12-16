package cn.hang.front.service;

import cn.hang.front.consumer.UserClient;
import cn.hang.hseckill.common.pojo.Response;
import cn.hang.hseckill.common.utils.SessionUtils;
import cn.hang.hseckill.pojo.dto.LoginInfoDTO;
import cn.hang.hseckill.pojo.po.UserPO;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lihang15
 * @description
 * @create 2018-12-15 22:32
 **/
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private UserClient userClient;

    @Override
    public Response<UserPO> loginCheck(LoginInfoDTO loginInfoDTO) {
        UserPO userPO = userClient.getUserByUserName(loginInfoDTO.getUsername());
        if (userPO != null) {
            if (StringUtils.isNotBlank(userPO.getPassword()) && userPO.getPassword().equals(loginInfoDTO.getPassword())) {
                SessionUtils.put("userInfo",userPO);
                return Response.success(userPO);
            } else {
                return Response.error("用户名或密码错误");
            }
        }
        return Response.error("用户名或密码错误");
    }
}
