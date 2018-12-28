package cn.hang.front.service.impl;

import cn.hang.front.consumer.ItemClient;
import cn.hang.front.service.ItemService;
import cn.hang.hseckill.common.constant.Global;
import cn.hang.hseckill.common.constant.ResponseMessageEnum;
import cn.hang.hseckill.common.pojo.Response;
import cn.hang.hseckill.pojo.po.ItemPO;
import cn.hang.hseckill.pojo.vo.ItemVO;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @author lihang15
 * @description
 * @create 2018-12-24 16:53
 **/
@Service
@Slf4j
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemClient itemClient;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public Response getHomeInfo() {
        Response response = itemClient.getIndexInfo();
        if (response.getCode() == ResponseMessageEnum.SUCCESS.getCode()) {
            return response;
        } else {
            return Response.error();
        }
    }

    @Override
    public Response<ItemVO> getItemById(Long id) {
        return itemClient.getItemById(id);
    }
}
