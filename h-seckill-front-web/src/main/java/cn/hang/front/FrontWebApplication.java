package cn.hang.front;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author lihang15
 * @description front web application
 * @create 2018-12-04 18:01
 **/
@EnableEurekaClient
@SpringBootApplication
public class FrontWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(FrontWebApplication.class, args);
        System.out.println("Server start succ");
    }
}
