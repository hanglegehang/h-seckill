package cn.hang.front.provider;

import cn.hang.front.mapper.UserPOMapper;
import cn.hang.hseckill.pojo.po.UserPO;
import cn.hang.hseckill.pojo.po.UserPOExample;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping("/getUserByUserName")
    public UserPO getUserByUserName(@RequestParam String username) {
        UserPOExample userPOExample = new UserPOExample();
        UserPOExample.Criteria criteria = userPOExample.createCriteria();
        criteria.andUsernameEqualTo(username);

        List<UserPO> userPOList = userPOMapper.selectByExample(userPOExample);
        if (CollectionUtils.isEmpty(userPOList)) {
            return null;
        }
        return userPOList.get(0);
    }
}
