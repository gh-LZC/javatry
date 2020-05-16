package com.frame.spring.configtest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @class Main
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/31 1:15
 * @Version 1.0
 */
@ComponentScan
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext c = new AnnotationConfigApplicationContext(ProfileConfig.class);
        c.getEnvironment().setActiveProfiles("dev");
        System.out.println(c.getBean(DemoBean.class).getContext());
    }
}
