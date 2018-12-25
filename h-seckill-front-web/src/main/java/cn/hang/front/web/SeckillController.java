package cn.hang.front.web;

import cn.hang.hseckill.common.pojo.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lihang15
 * @description
 * @create 2018-12-25 18:24
 **/
@Slf4j
@RestController
@RequestMapping("/seckill")
public class SeckillController {

    @GetMapping("/now")
    public Response index() {
        return Response.success(System.currentTimeMillis());
    }


}
