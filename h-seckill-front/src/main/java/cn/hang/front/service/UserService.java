package cn.hang.front.service;

import cn.hang.hseckill.common.pojo.Response;
import cn.hang.hseckill.pojo.po.AddressPO;

public interface UserService {
    /**
     * @param addressPO
     * @return
     */
    Response addAddress(AddressPO addressPO);

    /**
     * 删除收货地址
     *
     * @param addressId
     * @param userId
     * @return
     */
    Response deleteAddress(Long addressId, Long userId);

    Response updateAddress(AddressPO addressVO);
}
