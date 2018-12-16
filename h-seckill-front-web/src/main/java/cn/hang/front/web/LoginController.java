package cn.hang.front.web;

import cn.hang.front.service.LoginService;
import cn.hang.hseckill.common.pojo.Response;
import cn.hang.hseckill.common.utils.GeetestLib;
import cn.hang.hseckill.common.utils.SessionUtils;
import cn.hang.hseckill.pojo.dto.GeetInitDTO;
import cn.hang.hseckill.pojo.dto.LoginInfoDTO;
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

    @RequestMapping("/index")
    public Response login() {
        UserPO userPO = new UserPO();
        userPO.setAvatar("1111");
        SessionUtils.put("userInfo", userPO);
        return Response.success();
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

    @RequestMapping("/check")
    public Response loginCheck(@RequestBody LoginInfoDTO loginInfoDTO) {
        //极验验证
        GeetestLib gtSdk = new GeetestLib(GeetestLib.id, GeetestLib.key, GeetestLib.newfailback);

        String challenge = loginInfoDTO.getChallenge();
        String validate = loginInfoDTO.getValidate();
        String seccode = loginInfoDTO.getSeccode();
        int gtServerStatusCode = (int) SessionUtils.get(gtSdk.gtServerStatusSessionKey);
        //自定义参数,可选择添加
        HashMap<String, String> param = new HashMap<String, String>();
        int gtResult = 0;
        if (gtServerStatusCode == 1) {
            gtResult = gtSdk.enhencedValidateRequest(challenge, validate, seccode, param);
        } else {
            log.info("failback:use your own server captcha validate");
            gtResult = gtSdk.failbackValidateRequest(challenge, validate, seccode);
        }
        log.info("gtResult:{}", gtResult);
        if (gtResult == 1) {
            return loginService.loginCheck(loginInfoDTO);

        } else {
            return Response.error("验证码失败");
        }

    }


}
