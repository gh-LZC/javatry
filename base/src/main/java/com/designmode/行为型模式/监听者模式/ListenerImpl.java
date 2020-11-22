package com.designmode.行为型模式.监听者模式;

/**
 * @class ListenerImpl
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/1/7 22:42
 * @Version 1.0
 */
public class ListenerImpl implements Listeners {
    @Override
    public void eatEvent(Event event) {
        EventSource eventSource = event.getEventSource();
        System.out.println("我是监听器，你可以开始吃了！");
    }

    @Override
    public void studyEvent(Event event) {
        EventSource eventSource = event.getEventSource();
        System.out.println("我是监听器，你可以开始学习了！");
    }
}
