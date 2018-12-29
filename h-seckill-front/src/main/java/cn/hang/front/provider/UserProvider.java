package cn.hang.front.provider;

import cn.hang.front.business.UserBusiness;
import cn.hang.front.mapper.AddressPOMapper;
import cn.hang.front.mapper.UserPOMapper;
import cn.hang.front.service.UserService;
import cn.hang.hseckill.common.constant.CodeBaseInterface;
import cn.hang.hseckill.common.pojo.Response;
import cn.hang.hseckill.pojo.dto.LoginRegisterInfoDTO;
import cn.hang.hseckill.pojo.po.AddressPO;
import cn.hang.hseckill.pojo.po.AddressPOExample;
import cn.hang.hseckill.pojo.po.UserPO;
import cn.hang.hseckill.pojo.po.UserPOExample;
import cn.hang.hseckill.pojo.vo.front.UserVO;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @author lihang15
 * @description
 * @create 2018-12-04 19:01
 **/
@Slf4j
@RestController
@RequestMapping("/user")
public class UserProvider {
    @Autowired
    private UserService userService;

    @Autowired
    private UserBusiness userBusiness;


    @RequestMapping("/getUserByUserName")
    public Response<UserPO> getUserByUserName(@RequestParam String username) {
        return userBusiness.getUserByUserName(username);
    }

    @PostMapping("/registerUser")
    Response<UserVO> registerUser(@RequestBody LoginRegisterInfoDTO loginRegisterInfoDTO) {
        return userBusiness.registerUser(loginRegisterInfoDTO);
    }

    @GetMapping("/addressList/{userId}")
    Response<List<AddressPO>> addressList(@PathVariable("userId") Long userId) {
        return userBusiness.addressList(userId);
    }

    @PostMapping("/address/add")
    Response addAddress(@RequestBody AddressPO addressPO) {
        return userBusiness.addAddress(addressPO);
    }


    @PostMapping("/address/del")
    Response deleteAddress(@RequestParam Long addressId, @RequestParam Long userId) {
        return userBusiness.deleteAddress(addressId, userId);
    }

    @PostMapping("/address/update")
    Response updateAddress(@RequestBody AddressPO addressVO) {
        return userBusiness.updateAddress(addressVO);
    }

    @PostMapping("/loginCheck")
    Response<UserVO> loginCheck(@RequestBody LoginRegisterInfoDTO loginRegisterInfoDTO) {
        return userBusiness.loginCheck(loginRegisterInfoDTO);

    }
}
