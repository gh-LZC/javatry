package com.frame.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @class Main
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/12 17:36
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        context.getBean(DemoMethodService.class).add();
        context.getBean(DemoAnnotationService.class).add();
    }
}
