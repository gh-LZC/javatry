package com.设计模式.行为型模式.监听者模式;

/**
 * @class EventSource
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/1/7 22:32
 * @Version 1.0
 */
public class EventSource {
    Listeners listenerTest;

    public EventSource(Listeners listenerTest) {
        this.listenerTest = listenerTest;
    }

    public void eatEvent() {
        Event eventS = new Event(this);
        listenerTest.eatEvent(eventS);
        System.out.println("开始吃东西");
    }

    public void studyEvent() {
        Event eventS = new Event(this);
        listenerTest.eatEvent(eventS);
        System.out.println("开始学习");
    }
}
