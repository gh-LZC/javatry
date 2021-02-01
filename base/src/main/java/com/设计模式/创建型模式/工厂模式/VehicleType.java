package com.设计模式.创建型模式.工厂模式;

public enum VehicleType {
    Bus("bus"),
    Car("car");

    private String name;


    VehicleType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
