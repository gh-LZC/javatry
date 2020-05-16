package com.frame.spring.configtest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @class ProfileConfig
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/31 1:14
 * @Version 1.0
 */
@Configuration
public class ProfileConfig {
    @Profile("dev")
    @Bean(value = "devDemoBean")
    public DemoBean devDemoBean(){
        return new DemoBean("from development profile");
    }

    @Profile("prod")
    @Bean
    public DemoBean prodDemoBean(){
        return new DemoBean("from production profile");
    }
}
