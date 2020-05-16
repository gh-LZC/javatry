package com.frame.spring.event;

import lombok.Data;
import org.springframework.context.ApplicationEvent;

/**
 * @class MyEvent
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/30 23:44
 * @Version 1.0
 */
public class MyEvent extends ApplicationEvent {
    private String msg;

    public MyEvent(Object source,String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


}
