package com.designmode.行为型模式.监听者模式;

/**
 * @class Main
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/1/7 22:45
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        EventSource eventSource = new EventSource(new ListenerImpl());
        eventSource.eatEvent();
        eventSource.studyEvent();
    }
}
