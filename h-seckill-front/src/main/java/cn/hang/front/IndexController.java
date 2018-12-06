package cn.hang.front;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lihang15
 * @description
 * @create 2018-12-04 19:01
 **/
@Slf4j
@RestController
public class IndexController {
    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        log.debug("hi");
        return "hi " + name + " ,i am from port:2222" + port;
    }
}
