package cn.hang.hseckill.common.utils;

import cn.hang.hseckill.common.constant.Global;
import cn.hang.hseckill.common.exception.SessionException;
import cn.hang.hseckill.pojo.po.UserPO;
import cn.hang.hseckill.pojo.vo.front.UserVO;

import java.util.Objects;

/**
 * @author lihang15
 * @description
 * @create 2018-12-27 16:25
 **/
public class UserHome {

    public static UserVO currentUser() {
        UserVO userVO = (UserVO) SessionUtils.get(Global.SESSION_USER_INFO);
        if (userVO == null) {
            throw new SessionException("session过期");
        }
        return userVO;
    }

    public static Long currentUserId() {
        UserVO userVO = (UserVO) SessionUtils.get(Global.SESSION_USER_INFO);
        if (userVO == null) {
            throw new SessionException("session用户信息为空");
        }
        return userVO.getId();
    }
}
