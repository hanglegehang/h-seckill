package cn.hang.front.web;

import cn.hang.front.service.LoginService;
import cn.hang.hseckill.common.constant.Global;
import cn.hang.hseckill.common.pojo.Response;
import cn.hang.hseckill.common.utils.SessionUtils;
import cn.hang.hseckill.pojo.dto.LoginRegisterInfoDTO;
import cn.hang.hseckill.pojo.vo.front.UserVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lihang15
 * @description
 * @create 2018-12-04 19:01
 **/
@Slf4j
@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @RequestMapping("/checkLoginStatus")
    public Response<UserVO> checkLoginStatus() {
        log.info("checkLoginStatus");
        return loginService.checkLoginStatus();

    }

    @RequestMapping("/geetestInit")
    public Response geetestInit() {
        return loginService.geetestInit();

    }

    @RequestMapping("/loginCheck")
    public Response loginCheck(@RequestBody LoginRegisterInfoDTO loginRegisterInfoDTO) {
        return loginService.loginCheck(loginRegisterInfoDTO);
    }

    @RequestMapping("/loginOut")
    public Response loginOut() {
        SessionUtils.remove(Global.SESSION_USER_INFO);
        return Response.success();
    }

    @RequestMapping("/register")
    public Response register(@RequestBody LoginRegisterInfoDTO loginRegisterInfoDTO) {
        return loginService.register(loginRegisterInfoDTO);
    }



}
