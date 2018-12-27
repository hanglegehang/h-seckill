package cn.hang.hseckill.common.utils;

import cn.hang.hseckill.common.constant.Global;
import cn.hang.hseckill.pojo.po.UserPO;

import java.util.Objects;

/**
 * @author lihang15
 * @description
 * @create 2018-12-27 16:25
 **/
public class UserHome {

    public static UserPO currentUser() {
        UserPO userPO = (UserPO) SessionUtils.get(Global.SESSION_USER_INFO);
        Objects.requireNonNull(userPO, "session用户信息为空");
        return userPO;
    }

    public static Long currentUserId() {
        UserPO userPO = (UserPO) SessionUtils.get(Global.SESSION_USER_INFO);
        Objects.requireNonNull(userPO, "session用户信息为空");
        return userPO.getId();
    }
}
