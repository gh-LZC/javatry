package com.designmode.创建型模式.工厂模式.普通工厂;

import com.designmode.创建型模式.工厂模式.Vehicle;
import com.designmode.创建型模式.工厂模式.Car;

/**
 * @class CarFactory
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/2/24 22:18
 * @Version 1.0
 */
public class CarFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
