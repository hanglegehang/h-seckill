package cn.hang.front.business;

import cn.hang.hseckill.common.pojo.Response;
import cn.hang.hseckill.pojo.dto.LoginRegisterInfoDTO;
import cn.hang.hseckill.pojo.po.AddressPO;
import cn.hang.hseckill.pojo.po.UserPO;
import cn.hang.hseckill.pojo.vo.front.UserVO;

import java.util.List;

/**
 * @author lihang15
 */
public interface UserBusiness {
    /**
     * @param loginRegisterInfoDTO
     * @return
     */
    Response<UserVO> loginCheck(LoginRegisterInfoDTO loginRegisterInfoDTO);

    Response<UserPO> getUserByUserName(String username);

    Response<UserVO> registerUser(LoginRegisterInfoDTO loginRegisterInfoDTO);

    Response<List<AddressPO>> addressList(Long userId);

    Response addAddress(AddressPO addressPO);

    Response deleteAddress(Long addressId, Long userId);

    Response updateAddress(AddressPO addressVO);
}
