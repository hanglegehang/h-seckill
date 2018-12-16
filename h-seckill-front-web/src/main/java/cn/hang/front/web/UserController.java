package cn.hang.front.web;

import cn.hang.hseckill.common.constant.ResponseMessageEnum;
import cn.hang.hseckill.common.pojo.Response;
import cn.hang.hseckill.common.utils.SessionUtils;
import cn.hang.hseckill.pojo.po.UserPO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lihang15
 */
@Slf4j
@RequestMapping("/user")
@RestController
public class UserController {

    @RequestMapping("/checkLogin")
    public Response index() {
        UserPO userPO = (UserPO) SessionUtils.get("userInfo");
        if (userPO == null) {
            return Response.error(ResponseMessageEnum.NO_COMPETENCE);
        }
        return Response.success(userPO);
    }
}
