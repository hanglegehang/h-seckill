package cn.hang.hseckill.manage.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author lihang
 * @create 2018-12-08 上午12:48
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HItemPOMapperTest {

    @Autowired
    private HItemPOMapper hItemPOMapper;
    @Test
    public void selectByPrimaryKey() {
        System.out.println(hItemPOMapper.selectByPrimaryKey("11836864410"));
    }
}