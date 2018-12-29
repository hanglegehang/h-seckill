package cn.hang.front.service;

import cn.hang.hseckill.pojo.po.AddressPO;
import cn.hang.hseckill.pojo.po.UserPO;

import java.util.List;

/**
 * @author lihang15
 */
public interface UserService {
    /**
     * 新增收货地址
     *
     * @param addressPO
     * @return
     */
    int addAddress(AddressPO addressPO);

    /**
     * 删除收货地址
     *
     * @param addressId
     * @param userId
     * @return
     */
    int deleteAddress(Long addressId, Long userId);

    /**
     * 更新收货地址
     *
     * @param addressVO
     * @return
     */
    int updateAddress(AddressPO addressVO);

    /**
     * 根据用户名获取用户
     *
     * @param username
     * @return
     */
    UserPO getUserByUserName(String username);

    /**
     * 新增用户
     *
     * @param userPO
     * @return
     */
    UserPO insertUser(UserPO userPO);

    /**
     * 根据用户id获取地址列表
     *
     * @param userId
     * @return
     */
    List<AddressPO> addressList(Long userId);
}
