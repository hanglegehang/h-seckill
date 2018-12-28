package cn.hang.front.provider;

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
    private UserPOMapper userPOMapper;

    @Autowired
    private AddressPOMapper addressPOMapper;

    @Autowired
    private UserService userService;

    @RequestMapping("/getUserByUserName")
    public Response<UserPO> getUserByUserName(@RequestParam String username) {
        UserPOExample userPOExample = new UserPOExample();
        UserPOExample.Criteria criteria = userPOExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<UserPO> userPOList = userPOMapper.selectByExample(userPOExample);
        if (CollectionUtils.isEmpty(userPOList)) {
            return Response.error();
        }
        return Response.success(userPOList.get(0));
    }

    @PostMapping("/insertUser")
    int insertUser(@RequestBody LoginRegisterInfoDTO loginRegisterInfoDTO) {
        UserPO userPO = new UserPO();
        userPO.setUsername(loginRegisterInfoDTO.getUsername());
        String md5Password = DigestUtils.md5DigestAsHex(loginRegisterInfoDTO.getPassword().getBytes());
        userPO.setPassword(md5Password);
        userPO.setGmtUpdate(new Date());
        userPO.setGmtCreate(new Date());
        return userPOMapper.insertSelective(userPO);
    }

    @GetMapping("/addressList/{userId}")
    Response<List<AddressPO>> addressList(@PathVariable("userId") Long userId) {
        AddressPOExample addressPOExample = new AddressPOExample();
        AddressPOExample.Criteria criteria = addressPOExample.createCriteria();
        criteria.andIsDeleteEqualTo(CodeBaseInterface.DeleteEnum.NOT_DELETE.getCode()).andUserIdEqualTo(userId);
        List<AddressPO> list = addressPOMapper.selectByExample(addressPOExample);
        return Response.success(list);
    }

    @PostMapping("/address/add")
    Response addAddress(@RequestBody AddressPO addressPO) {
        return userService.addAddress(addressPO);
    }


    @PostMapping("/address/del")
    Response deleteAddress(@RequestParam Long addressId, @RequestParam Long userId) {
        return userService.deleteAddress(addressId, userId);
    }

    @PostMapping("/address/update")
    Response updateAddress(@RequestBody AddressPO addressVO) {
        return userService.updateAddress(addressVO);

    }
}
