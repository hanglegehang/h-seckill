package cn.hang.front.web;

import cn.hang.front.service.UserService;
import cn.hang.hseckill.common.constant.Global;
import cn.hang.hseckill.common.constant.ResponseMessageEnum;
import cn.hang.hseckill.common.pojo.Response;
import cn.hang.hseckill.common.utils.SessionUtils;
import cn.hang.hseckill.common.utils.UserHome;
import cn.hang.hseckill.pojo.po.AddressPO;
import cn.hang.hseckill.pojo.po.UserPO;
import cn.hang.hseckill.pojo.vo.AddressVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

/**
 * @author lihang15
 */
@Slf4j
@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/addressList")
    public Response<List<AddressPO>> addressList() {
        Long useId = UserHome.currentUserId();
        return userService.addressList(useId);
    }

    @PostMapping("/address/add")
    public Response addAddress(@RequestBody AddressVO addressVO) {
        return userService.addAddress(addressVO);
    }


    @PostMapping("/address/del/{id}")
    public Response delAddress(@PathVariable("id") Long id) {
        return userService.deleteAddress(id);
    }

    @PostMapping("/address/update")
    public Response updateAddress(@RequestBody AddressVO addressVO) {
        return userService.updateAddress(addressVO);
    }
}
