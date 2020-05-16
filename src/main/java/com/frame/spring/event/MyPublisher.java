package com.frame.spring.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @class MyPublisher
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/30 23:52
 * @Version 1.0
 */
@Component
public class MyPublisher {
    @Autowired
    ApplicationContext applicationContext;
    public void publish(String msg){
        applicationContext.publishEvent(new MyEvent(this,msg));
    }
}
