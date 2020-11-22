package com.designmode.结构型模式.组合模式.instance1;

/**
 * @class Leaf
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/29 14:58
 * @Version 1.0
 */
public class Leaf extends Component{
    public Leaf(String name) {
        super(name);
    }

    @Override
    void operation() {
        System.out.println(name + "Leaf operation");
    }
}
