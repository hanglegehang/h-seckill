package cn.hang.front.web;

import cn.hang.front.service.LoginService;
import cn.hang.hseckill.common.constant.Global;
import cn.hang.hseckill.common.constant.ResponseMessageEnum;
import cn.hang.hseckill.common.pojo.Response;
import cn.hang.hseckill.common.utils.GeetestLib;
import cn.hang.hseckill.common.utils.SessionUtils;
import cn.hang.hseckill.pojo.dto.GeetInitDTO;
import cn.hang.hseckill.pojo.dto.LoginRegisterInfoDTO;
import cn.hang.hseckill.pojo.po.UserPO;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

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
    public Response checkLoginStatus() {
        log.info("checkLoginStatus");
        UserPO userPO = (UserPO) SessionUtils.get(Global.SESSION_USER_INFO);
        if (userPO == null) {
            log.info("checkLoginStatus not login success");
            return Response.error(ResponseMessageEnum.NO_COMPETENCE);
        }
        log.info("checkLoginStatus login success,username:[{}]", userPO.getUsername());
        return Response.success(userPO);
    }

    @RequestMapping("/geetestInit")
    public Response geetestInit() {
        GeetestLib gtSdk = new GeetestLib(GeetestLib.id, GeetestLib.key, GeetestLib.newfailback);
        String resStr = "{}";
        //自定义参数,可选择添加
        HashMap<String, String> param = new HashMap<String, String>();
        //进行验证预处理
        int gtServerStatus = gtSdk.preProcess(param);
        SessionUtils.put(gtSdk.gtServerStatusSessionKey, gtServerStatus);
        //将服务器状态设置到redis中
        resStr = gtSdk.getResponseStr();
        GeetInitDTO geetInitDTO = JSON.parseObject(resStr, GeetInitDTO.class);
        return Response.success(geetInitDTO);
    }

    @RequestMapping("/loginCheck")
    public Response loginCheck(@RequestBody LoginRegisterInfoDTO loginRegisterInfoDTO) {
        log.info("user login check username:{}", loginRegisterInfoDTO.getUsername());
        int gtResult = 0;
        //极验验证
        gtResult = getGtResult(loginRegisterInfoDTO);
        if (gtResult == 1) {
            log.info("user login success username:[{}]", loginRegisterInfoDTO.getUsername());
            return loginService.loginCheck(loginRegisterInfoDTO);
        } else {
            return Response.error("验证码校验失败");
        }
    }

    @RequestMapping("/loginOut")
    public Response loginOut() {
        SessionUtils.remove(Global.SESSION_USER_INFO);
        return Response.success();
    }

    @RequestMapping("/register")
    public Response register(@RequestBody LoginRegisterInfoDTO loginRegisterInfoDTO) {
        log.info("new user register param:{}", loginRegisterInfoDTO);
        int gtResult = 0;
        //极验验证
        gtResult = getGtResult(loginRegisterInfoDTO);
        if (gtResult == 1) {
            log.info("new user register success");
            return loginService.register(loginRegisterInfoDTO);
        } else {
            return Response.error("验证码校验失败");
        }
    }

    private int getGtResult(@RequestBody LoginRegisterInfoDTO loginRegisterInfoDTO) {
        int gtResult;
        GeetestLib gtSdk = new GeetestLib(GeetestLib.id, GeetestLib.key, GeetestLib.newfailback);
        String challenge = loginRegisterInfoDTO.getChallenge();
        String validate = loginRegisterInfoDTO.getValidate();
        String seccode = loginRegisterInfoDTO.getSeccode();
        int gtServerStatusCode = (int) SessionUtils.get(gtSdk.gtServerStatusSessionKey);
        //自定义参数,可选择添加
        HashMap<String, String> param = new HashMap<String, String>();
        if (gtServerStatusCode == 1) {
            gtResult = gtSdk.enhencedValidateRequest(challenge, validate, seccode, param);
        } else {
            log.info("failback:use your own server captcha validate");
            gtResult = gtSdk.failbackValidateRequest(challenge, validate, seccode);
        }
        return gtResult;
    }


}
