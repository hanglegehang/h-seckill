package cn.hang.front.service.impl;

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

    @Transactional(rollbackFor = RuntimeException.class)
    @Override
    public int addAddress(AddressPO addressPO) {
        if (addressPO.getIsDefault() == CodeBaseInterface.DefaultEnum.Default.getCode()) {
            List<Long> addressIdList = addressPOMapper.listIdByUserId(addressPO.getUserId());
            int delCount = addressPOMapper.batchUpdateDefaultByIdList(addressIdList);
        }
        return addressPOMapper.insertSelective(addressPO);

    }


    @Override
    public int deleteAddress(Long addressId, Long userId) {
        AddressPO addressPO = new AddressPO();
        addressPO.setIsDelete(CodeBaseInterface.DeleteEnum.DELETE.getCode());
        AddressPOExample addressPOExample = new AddressPOExample();
        AddressPOExample.Criteria criteria = addressPOExample.createCriteria();
        criteria.andUserIdEqualTo(userId).andIdEqualTo(addressId);
        return addressPOMapper.updateByExampleSelective(addressPO, addressPOExample);

    }

    @Override
    public int updateAddress(AddressPO addressPO) {
        if (addressPO.getIsDefault() == CodeBaseInterface.DefaultEnum.Default.getCode()) {
            List<Long> addressIdList = addressPOMapper.listIdByUserId(addressPO.getUserId());
            int delCount = addressPOMapper.batchUpdateDefaultByIdList(addressIdList);
        }
        AddressPOExample addressPOExample = new AddressPOExample();
        AddressPOExample.Criteria criteria = addressPOExample.createCriteria();
        criteria.andUserIdEqualTo(addressPO.getUserId()).andIdEqualTo(addressPO.getId());
        return addressPOMapper.updateByExampleSelective(addressPO, addressPOExample);
    }

    @Override
    public UserPO getUserByUserName(String username) {
        UserPOExample userPOExample = new UserPOExample();
        UserPOExample.Criteria criteria = userPOExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<UserPO> userPOList = userPOMapper.selectByExample(userPOExample);
        if (CollectionUtils.isEmpty(userPOList)) {
            return null;
        }
        return userPOList.get(0);
    }

    @Override
    public UserPO insertUser(UserPO userPO) {
        int insertCount = userPOMapper.insertSelective(userPO);
        if (insertCount == 1) {
            return userPO;
        }
        return null;
    }

    @Override
    public List<AddressPO> addressList(Long userId) {
        AddressPOExample addressPOExample = new AddressPOExample();
        AddressPOExample.Criteria criteria = addressPOExample.createCriteria();
        criteria.andIsDeleteEqualTo(CodeBaseInterface.DeleteEnum.NOT_DELETE.getCode()).andUserIdEqualTo(userId);
        return addressPOMapper.selectByExample(addressPOExample);
    }
}
