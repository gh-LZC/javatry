package com.frame.spring.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @class MyListener
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/30 23:42
 * @Version 1.0
 */
@Component
public class MyListener implements ApplicationListener<MyEvent> {
    @Override
    public void onApplicationEvent(MyEvent myEvent) {
        System.out.println("我(bean-demoListener)接收到了bean-demoPublisher发布的消息:" +myEvent.getMsg());
    }
}
