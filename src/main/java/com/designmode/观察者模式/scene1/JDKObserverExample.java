package com.designmode.观察者模式.scene1;

/**
 * @class JDKObserverExample
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/1/8 0:02
 * @Version 1.0
 */
public class JDKObserverExample {
    public static void main(String[] args){
        MyObservable observer = new MyObservable();
        observer.addObserver(new MyObserver());
        observer.addObserver(new YouObserver());
        observer.setContent("被观察者发生了变化！");
    }
}
