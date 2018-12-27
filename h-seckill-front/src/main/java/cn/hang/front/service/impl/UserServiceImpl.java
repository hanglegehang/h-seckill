package cn.hang.front.service.impl;

import cn.hang.front.mapper.AddressPOMapper;
import cn.hang.front.mapper.UserPOMapper;
import cn.hang.front.service.UserService;
import cn.hang.hseckill.common.constant.CodeBaseInterface;
import cn.hang.hseckill.common.pojo.Response;
import cn.hang.hseckill.pojo.po.AddressPO;
import cn.hang.hseckill.pojo.po.AddressPOExample;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author lihang15
 * @description
 * @create 2018-12-27 17:19
 **/
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserPOMapper userPOMapper;

    @Autowired
    private AddressPOMapper addressPOMapper;

    @Transactional
    @Override
    public Response addAddress(AddressPO addressPO) {
        if (addressPO.getIsDefault() == CodeBaseInterface.DefaultEnum.Default.getCode()) {
            List<Long> addressIdList = addressPOMapper.listIdByUserId(addressPO.getUserId());
            int delCount = addressPOMapper.batchUpdateDefaultByIdList(addressIdList);
        }
        int insertCount = addressPOMapper.insertSelective(addressPO);
        if (insertCount == 1) {
            return Response.success();
        } else {
            return Response.error();
        }
    }


    @Override
    public Response deleteAddress(Long addressId, Long userId) {
        AddressPO addressPO = new AddressPO();
        addressPO.setIsDelete(CodeBaseInterface.DeleteEnum.DELETE.getCode());
        AddressPOExample addressPOExample = new AddressPOExample();
        AddressPOExample.Criteria criteria = addressPOExample.createCriteria();
        criteria.andUserIdEqualTo(userId).andIdEqualTo(addressId);
        int deleteCount = addressPOMapper.updateByExampleSelective(addressPO, addressPOExample);
        if (deleteCount == 1) {
            return Response.success();
        } else {
            return Response.error("删除收货地址失败");
        }
    }

    @Override
    public Response updateAddress(AddressPO addressPO) {
        AddressPOExample addressPOExample = new AddressPOExample();
        AddressPOExample.Criteria criteria = addressPOExample.createCriteria();
        criteria.andUserIdEqualTo(addressPO.getUserId()).andIdEqualTo(addressPO.getId());
        int updateCount = addressPOMapper.updateByExampleSelective(addressPO, addressPOExample);
        if (updateCount == 1) {
            return Response.success();
        } else {
            return Response.error("更新收货地址失败");
        }
    }
}
