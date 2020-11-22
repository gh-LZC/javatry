package com.designmode.结构型模式.组合模式.instance1;

/**
 * @class Client
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/29 14:59
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args){
        Composite root = new Composite("root");
        // 来一个树枝节点
        Composite branchA = new Composite("---branchA");
        Composite branchB = new Composite("------branchB");
        // 来一个叶子节点
        Component leafA = new Leaf("------leafA");
        Component leafB = new Leaf("---------leafB");
        Component leafC = new Leaf("---leafC");
        root.addChild(branchA);
        root.addChild(leafC);
        branchA.addChild(leafA);
        branchA.addChild(branchB);
        branchB.addChild(leafB);
        root.operation();
    }
}
