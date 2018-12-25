package cn.hang.front.web;

import cn.hang.front.consumer.ItemClient;
import cn.hang.front.service.ItemService;
import cn.hang.hseckill.common.pojo.Response;
import cn.hang.hseckill.pojo.po.ItemPO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @Autowired
    private ItemService itemService;

    @GetMapping("/home")
    public Response index() {
        Response response = itemService.getHomeInfo();
        return response;
    }

    @GetMapping("/{id}")
    public Response<ItemPO> getItemById(@PathVariable("id") Long id) {
        log.info("ItemController getItemById,id{}", id);
        return itemService.getItemById(id);
    }





}
