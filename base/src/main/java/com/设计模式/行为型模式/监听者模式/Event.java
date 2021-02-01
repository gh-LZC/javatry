package com.设计模式.行为型模式.监听者模式;

/**
 * @class EventTest
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/1/7 22:32
 * @Version 1.0
 */
public class Event {
    EventSource eventSource;

    public Event(EventSource eventSource) {
        this.eventSource = eventSource;
    }

    public EventSource getEventSource() {
        return eventSource;
    }

    public void setEventSource(EventSource eventSource) {
        this.eventSource = eventSource;
    }
}
