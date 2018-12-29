package cn.hang.front.service.impl;

import cn.hang.front.consumer.UserClient;
import cn.hang.front.service.LoginService;
import cn.hang.hseckill.common.constant.CodeBaseInterface;
import cn.hang.hseckill.common.constant.Global;
import cn.hang.hseckill.common.constant.ResponseMessageEnum;
import cn.hang.hseckill.common.exception.SessionException;
import cn.hang.hseckill.common.pojo.Response;
import cn.hang.hseckill.common.utils.GeetestLib;
import cn.hang.hseckill.common.utils.SessionUtils;
import cn.hang.hseckill.common.utils.UserHome;
import cn.hang.hseckill.pojo.dto.GeetInitDTO;
import cn.hang.hseckill.pojo.dto.LoginRegisterInfoDTO;
import cn.hang.hseckill.pojo.po.UserPO;
import cn.hang.hseckill.pojo.vo.front.UserVO;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;

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
    public Response<UserVO> loginCheck(LoginRegisterInfoDTO loginRegisterInfoDTO) {
        log.info("user login check username:{}", loginRegisterInfoDTO.getUsername());
        int gtResult = 0;
        //极验验证
        gtResult = getGtResult(loginRegisterInfoDTO);
        if (gtResult != 1) {
            return Response.error("验证码校验失败");
        }
        Response<UserVO> response = userClient.loginCheck(loginRegisterInfoDTO);
        if (response.getCode() == ResponseMessageEnum.SUCCESS.getCode()) {
            log.info("user login success username:[{}]", loginRegisterInfoDTO.getUsername());
            SessionUtils.put(Global.SESSION_USER_INFO, response.getData());
        }
        return response;
    }

    @Override
    public Response<UserVO> register(LoginRegisterInfoDTO loginRegisterInfoDTO) {
        log.info("new user register param:{}", loginRegisterInfoDTO);
        int gtResult = 0;
        //极验验证
        gtResult = getGtResult(loginRegisterInfoDTO);
        if (gtResult != 1) {
            return Response.error("验证码校验失败");
        }
        return userClient.registerUser(loginRegisterInfoDTO);
    }

    @Override
    public Response<UserVO> checkLoginStatus() {
        UserVO userVO;
        try {
            userVO = UserHome.currentUser();
        } catch (SessionException e) {
            log.warn("checkLoginStatus not login success", e.getMsg());
            return Response.error(ResponseMessageEnum.NO_COMPETENCE);
        }
        log.info("checkLoginStatus login success,username:[{}]", userVO.getUsername());
        return Response.success(userVO);
    }

    @Override
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

    private int getGtResult(LoginRegisterInfoDTO loginRegisterInfoDTO) {
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
