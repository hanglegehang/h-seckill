package cn.hang.front.business.impl;

import cn.hang.front.business.UserBusiness;
import cn.hang.front.service.UserService;
import cn.hang.hseckill.common.constant.CodeBaseInterface;
import cn.hang.hseckill.common.pojo.Response;
import cn.hang.hseckill.pojo.dto.LoginRegisterInfoDTO;
import cn.hang.hseckill.pojo.po.AddressPO;
import cn.hang.hseckill.pojo.po.UserPO;
import cn.hang.hseckill.pojo.vo.front.UserVO;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;

import java.util.Date;
import java.util.List;

/**
 * @author lihang15
 * @description
 * @create 2018-12-29 23:34
 **/
@Component
public class UserBusinessImpl implements UserBusiness {

    @Autowired
    private UserService userService;

    @Override
    public Response<UserVO> loginCheck(LoginRegisterInfoDTO loginRegisterInfoDTO) {
        UserPO userPO = userService.getUserByUserName(loginRegisterInfoDTO.getUsername());
        if (userPO == null) {
            return Response.error("用户名或密码错误");
        }
        String inputPassword = DigestUtils.md5DigestAsHex(loginRegisterInfoDTO.getPassword().getBytes());
        if (StringUtils.isNotBlank(userPO.getPassword()) && inputPassword.equals(userPO.getPassword())) {
            if (userPO.getStatus() == CodeBaseInterface.StatusEnum.NOT_USED.getCode()) {
                return Response.error("账户已被封禁,请联系客服解封");
            }
            UserVO userVO = new UserVO();
            BeanUtils.copyProperties(userPO, userVO);
            return Response.success(userVO);
        }
        return Response.error("用户名或密码错误");

    }

    @Override
    public Response<UserPO> getUserByUserName(String username) {
        UserPO userPO = userService.getUserByUserName(username);
        return Response.success(userPO);
    }

    @Override
    public Response<UserVO> registerUser(LoginRegisterInfoDTO loginRegisterInfoDTO) {
        UserPO oldUser = userService.getUserByUserName(loginRegisterInfoDTO.getUsername());
        if (oldUser != null) {
            return Response.error("该用户名已被注册");
        }
        UserPO userPO = new UserPO();
        userPO.setUsername(loginRegisterInfoDTO.getUsername());
        String md5Password = DigestUtils.md5DigestAsHex(loginRegisterInfoDTO.getPassword().getBytes());
        userPO.setPassword(md5Password);
        userPO.setGmtUpdate(new Date());
        userPO.setGmtCreate(new Date());
        UserPO newUser = userService.insertUser(userPO);
        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(userVO, newUser);
        return Response.success(userVO);
    }

    @Override
    public Response<List<AddressPO>> addressList(Long userId) {
        List<AddressPO> list = userService.addressList(userId);
        return Response.success(list);
    }

    @Override
    public Response addAddress(AddressPO addressPO) {
        int count = userService.addAddress(addressPO);
        if (count == 1) {
            return Response.success();
        } else {
            return Response.error("新增收获地址失败");
        }
    }

    @Override
    public Response deleteAddress(Long addressId, Long userId) {
        int deleteCount = userService.deleteAddress(addressId, userId);
        if (deleteCount == 1) {
            return Response.success();
        } else {
            return Response.error("删除收货地址失败");
        }
    }

    @Override
    public Response updateAddress(AddressPO addressVO) {

        int updateCount = userService.updateAddress(addressVO);
        if (updateCount == 1) {
            return Response.success();
        } else {
            return Response.error("更新收货地址失败");
        }
    }
}
