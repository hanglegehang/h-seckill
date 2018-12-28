package cn.hang.front.consumer;

import cn.hang.front.consumer.fallback.UserFallbackFactory;
import cn.hang.hseckill.common.pojo.Response;
import cn.hang.hseckill.pojo.dto.LoginRegisterInfoDTO;
import cn.hang.hseckill.pojo.po.AddressPO;
import cn.hang.hseckill.pojo.po.UserPO;
import cn.hang.hseckill.pojo.vo.AddressVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author lihang15
 */
@Component
@FeignClient(value = "${service.h-seckill-front.name}", path = "${service.h-seckill-front.path}/user", fallbackFactory = UserFallbackFactory.class)
public interface UserClient {
    /**
     * 根据用户名获取用户
     *
     * @param username
     * @return
     */
    @GetMapping("/getUserByUserName")
    Response<UserPO> getUserByUserName(@RequestParam("username") String username);

    /**
     * 新增用户
     *
     * @param loginRegisterInfoDTO
     * @return
     */
    @PostMapping("/insertUser")
    int insertUser(@RequestBody LoginRegisterInfoDTO loginRegisterInfoDTO);

    /**
     * 根据用户id获取收货地址
     *
     * @param userId
     * @return
     */
    @GetMapping("/addressList/{userId}")
    Response<List<AddressPO>> addressList(@PathVariable("userId") Long userId);

    /**
     * 增加收货地址
     *
     * @param addressPO
     * @return
     */
    @PostMapping("/address/add")
    Response addAddress(@RequestBody AddressPO addressPO);

    /**
     * 删除收货地址
     *
     * @param addressId
     * @param userId
     * @return
     */
    @PostMapping("/address/del")
    Response deleteAddress(@RequestParam("addressId") Long addressId, @RequestParam("userId") Long userId);

    /**
     * 更新收货地址
     *
     * @param addressVO
     * @return
     */
    @PostMapping("/address/update")
    Response updateAddress(@RequestBody AddressPO addressVO);
}

