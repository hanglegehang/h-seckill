package cn.hang.front.config;

import cn.hang.front.interceptor.SessionInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author lihang15
 * @description
 * @create 2018-12-14 13:55
 **/
@Configuration
public class MyWebAppConfigurer extends WebMvcConfigurationSupport {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 多个拦截器组成一个拦截器链
        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用户排除拦截
        registry.addInterceptor(new SessionInterceptor())
                .addPathPatterns("/user/checkLogin")
                .addPathPatterns("/**")
                .excludePathPatterns("/item/**")
                .excludePathPatterns("/login/**")
                .excludePathPatterns("/user/**");
        super.addInterceptors(registry);
    }

}
