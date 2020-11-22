package com.frame.spring.mvc;

import org.springframework.stereotype.Component;

/**
 * @class PayService
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/29 17:46
 * @Version 1.0
 */
@Component
public class PayService {
    public void pay() {
        try {
            System.out.println(">>>3.pay业务<<<<<<< ThradName:" + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println(">>>4.pay业务<<<<<<< ThradName:" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
