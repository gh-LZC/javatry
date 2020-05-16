package com.frame.spring.mvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @class SpringMvcConfig
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/29 17:41
 * @Version 1.0
 */
@Configuration //相当bean.xml
@ComponentScan //开启扫包
@EnableWebMvc //相当开启注解版springmvc 相当web.xml
public class SpringMvcConfig implements WebMvcConfigurer {
    //如果使用继承 WebMvcConfigurationSupport 的方式则 @EnableWebMvc 需要关闭，因为@EnableWebMvc底层就是继承WebMvcConfigurationSupport

    /***配置视图解析器*/
    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
        // 前缀
        internalResourceViewResolver.setPrefix("/WEB-INF/view/");
        // 后缀
        internalResourceViewResolver.setSuffix(".jsp");
        return internalResourceViewResolver;
    }
    @Bean
    public MyHandler myHandler() {
        //自定义拦截器交给spring管理
        return new MyHandler();
    }
    /**重写WebMvcConfigurer的addInterceptors方法*/
    public void addInterceptors(InterceptorRegistry registry) {
        //添加拦截器
        registry.addInterceptor(myHandler()).addPathPatterns("/**");
    }
}
