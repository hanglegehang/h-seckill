package cn.hang.front.web;

import cn.hang.front.consumer.ItemClient;
import cn.hang.hseckill.common.pojo.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lihang15
 * @description
 * @create 2018-12-04 19:01
 **/
@Slf4j
@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemClient itemClient;

    @RequestMapping("/home")
    public Response index() {
        log.debug("hi");
        return itemClient.getIndexInfo();
    }
}
