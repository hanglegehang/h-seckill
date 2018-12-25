package cn.hang.front;

import cn.hang.front.mapper.ItemPOMapper;
import cn.hang.hseckill.common.pojo.Response;
import cn.hang.hseckill.pojo.po.ItemPO;
import cn.hang.hseckill.pojo.po.UserPO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FrontApplicationTests {
    @Autowired
    private ItemPOMapper itemPOMapper;
    @Test
    public void contextLoads() {
        ItemPO itemPO = itemPOMapper.selectByPrimaryKey(3756329L);
        System.out.println(itemPO);
    }

}
