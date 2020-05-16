package com.frame.spring.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @class Client
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/30 23:54
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        context.getBean(MyPublisher.class).publish("hello application event!");
        //context.publishEvent(new MyEvent(new Object(),"hello application event!"));
        context.close();
    }
}
