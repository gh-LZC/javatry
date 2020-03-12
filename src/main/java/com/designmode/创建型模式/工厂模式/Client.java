package com.designmode.创建型模式.工厂模式;

import com.designmode.创建型模式.工厂模式.普通工厂.BusFactory;
import com.designmode.创建型模式.工厂模式.普通工厂.CarFactory;
import com.designmode.创建型模式.工厂模式.普通工厂.VehicleFactory;
import com.designmode.创建型模式.工厂模式.简单工厂.StaticVehicleFactory;

/**
 * @class Client
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/2/24 21:33
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //简单工厂
        StaticVehicleFactory.createVehicleByNew(VehicleType.Bus).run();
        StaticVehicleFactory.createVehicleByReflect().run();
        //普通工厂
        VehicleFactory factory = new CarFactory();
        Vehicle vehicle = factory.createVehicle();
        vehicle.run();
        factory = new BusFactory();
        vehicle = factory.createVehicle();
        vehicle.run();


    }
}
