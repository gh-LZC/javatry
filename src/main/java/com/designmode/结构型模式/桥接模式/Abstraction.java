package com.designmode.结构型模式.桥接模式;

/**
 * @class Abstraction
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/5 12:39
 * @Version 1.0
 */
abstract  public class Abstraction {
    protected Implementor implementor;

    public Implementor getImplementor() {
        return implementor;
    }

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public Abstraction(Implementor implementor, String name) {
        this.implementor = implementor;
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void abstractMethod();
}
