package cn.hang.front.service;

import cn.hang.hseckill.common.pojo.Response;
import cn.hang.hseckill.pojo.dto.LoginInfoDTO;
import cn.hang.hseckill.pojo.po.UserPO;

/**
 * @author lihang15
 * @description 登陆相关
 * @create 2018-12-15 22:30
 **/
public interface LoginService {

    /** 登录验证
     * @param userPO
     * @return
     */
    public Response<UserPO> loginCheck(LoginInfoDTO userPO);
}
