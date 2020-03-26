package com.designmode.结构型模式.享元模式;

/**
 * @class FlyweightParent
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/21 22:12
 * @Version 1.0
 */
public abstract class Flyweight {
    //内部状态
    public String intrinsic;
    //外部状态
    protected final String extrinsic;

    //要求享元角色必须接受外部状态
    public Flyweight(String extrinsic) {
        this.extrinsic = extrinsic;
    }

    //定义业务操作
    public abstract void operate(int extrinsic);

    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }
}
