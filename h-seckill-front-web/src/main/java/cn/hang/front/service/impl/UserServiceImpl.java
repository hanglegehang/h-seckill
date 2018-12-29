package cn.hang.front.service.impl;

import cn.hang.front.consumer.UserClient;
import cn.hang.front.service.UserService;
import cn.hang.hseckill.common.pojo.Response;
import cn.hang.hseckill.common.utils.UserHome;
import cn.hang.hseckill.pojo.po.AddressPO;
import cn.hang.hseckill.pojo.vo.front.AddressVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author lihang15
 * @description
 * @create 2018-12-26 20:07
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserClient userClient;

    @Override
    public Response<List<AddressPO>> addressList(Long userId) {
        return userClient.addressList(userId);
    }

    @Override
    public Response addAddress(AddressVO addressVO) {
        Long useId = UserHome.currentUserId();
        AddressPO addressPO = new AddressPO();
        addressPO.setIsDefault(addressVO.getIsDefault());
        addressPO.setPhone(addressVO.getPhone());
        addressPO.setStreetName(addressVO.getStreetName());
        addressPO.setUserName(addressVO.getUserName());
        addressPO.setGmtCreate(new Date());
        addressPO.setUserId(useId);
        return userClient.addAddress(addressPO);
    }

    @Override
    public Response deleteAddress(Long addressId) {
        Long useId = UserHome.currentUserId();
        return userClient.deleteAddress(addressId, useId);
    }

    @Override
    public Response updateAddress(AddressVO addressVO) {
        Long useId = UserHome.currentUserId();
        AddressPO addressPO = new AddressPO();
        addressPO.setId(addressVO.getId());
        addressPO.setIsDefault(addressVO.getIsDefault());
        addressPO.setPhone(addressVO.getPhone());
        addressPO.setStreetName(addressVO.getStreetName());
        addressPO.setUserName(addressVO.getUserName());
        addressPO.setGmtCreate(new Date());
        addressPO.setUserId(useId);
        return userClient.updateAddress(addressPO);
    }
}
