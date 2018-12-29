package cn.hang.front.service;

import cn.hang.hseckill.common.pojo.Response;
import cn.hang.hseckill.pojo.po.AddressPO;
import cn.hang.hseckill.pojo.vo.front.AddressVO;

import java.util.List;

public interface UserService {
    /**
     * @param userId
     * @return
     */
    Response<List<AddressPO>> addressList(Long userId);

    /**
     * 新增收货地址
     *
     * @param addressVO
     * @return
     */
    Response addAddress(AddressVO addressVO);

    Response deleteAddress(Long id);

    Response updateAddress(AddressVO addressVO);
}
