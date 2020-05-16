package com.designmode.结构型模式.组合模式.instance1;

import java.util.Collection;
import java.util.LinkedList;

/**
 * @class Composite
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/29 14:49
 * @Version 1.0
 */
public class Composite extends Component {
    private Collection<Component> child;



    public void setChild(Collection<Component> child) {
        this.child = child;
    }

    public Composite(String name) {
        super(name);
        this.child = new LinkedList<Component>();
    }

    @Override
    public boolean addChild(Component component) {
        return getChild().add(component);
    }

    @Override
    public boolean removeChild(Component component) {
        return getChild().remove(component);
    }

    @Override
    public Collection<Component> getChild() {
        return this.child;
    }

    @Override
    void operation() {
        System.out.println(name + "Composite operation");
        for (Component component : getChild()) {
            component.operation();
        }
    }
}
