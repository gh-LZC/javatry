package com.设计模式.结构型模式.组合模式.instance1;

import java.util.Collection;

/**
 * @class Component
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/29 14:34
 * @Version 1.0
 */
public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public boolean addChild(Component component){
        throw new UnsupportedOperationException("addChild not supported");
    }

    public boolean removeChild(Component component){
        throw new UnsupportedOperationException("addChild not supported");
    }

    public Collection<Component> getChild(){
        throw new UnsupportedOperationException("getChild not supported");
    }

    abstract void operation();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
