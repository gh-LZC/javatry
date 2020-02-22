package com.designmode.观察者模式.scene1;

import java.util.Observable;

/**
 * @class MyObservable
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/1/7 23:53
 * @Version 1.0
 */
public class MyObservable extends Observable {
    private String content;

    public void setContent(String content) {
        this.content = content;
        this.setChanged();
        this.notifyObservers(content);
    }
}
