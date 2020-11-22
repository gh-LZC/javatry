package com.designmode.行为型模式.观察者模式.scene1;

import java.util.Observable;
import java.util.Observer;

/**
 * @class MyOberver
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/1/7 23:51
 * @Version 1.0
 */
public class MyObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("通知来自" + o.getClass().getName() + ":" + arg);
    }
}
