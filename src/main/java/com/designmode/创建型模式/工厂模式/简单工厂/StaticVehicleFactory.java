package com.designmode.创建型模式.工厂模式.简单工厂;

import com.designmode.创建型模式.工厂模式.Bus;
import com.designmode.创建型模式.工厂模式.Car;
import com.designmode.创建型模式.工厂模式.Vehicle;
import com.designmode.创建型模式.工厂模式.VehicleType;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * @class SimpleFactory
 * @Author Administrator
 * @Description 全能工厂
 * @Date 2020/2/24 20:02
 * @Version 1.0
 */
public class StaticVehicleFactory {
    public static Vehicle createVehicleByNew(VehicleType vehicleType) {
        switch (vehicleType) {
            case Car:
                return new Car();
            case Bus:
                return new Bus();
            default:
                throw new RuntimeException("not this Vehicle");
        }
    }

    public static Vehicle createVehicleByReflect(){
        Vehicle vehicle = null;
        try {
            Properties p = new Properties();
            InputStream in = new FileInputStream("D:\\project\\javatry\\src\\main\\java\\com\\designmode\\工厂模式\\vehicle.properties");
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            p.load(br);
            vehicle = (Car)Class.forName(p.getProperty("car")).newInstance();
        } catch (IOException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

        return vehicle;
    }
}
