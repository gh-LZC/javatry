package com.designmode.创建型模式.原型模式;

/**
 * @class Client
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/6/27 12:01
 * @Version 1.0
 */
public class Client implements Cloneable{
    public static void main(String[] args){
        DeepCloneBean deepCloneBean = new DeepCloneBean();
        deepCloneBean.setName("0");
        deepCloneBean.getList().add(new CloneBean(01,"01"));
        deepCloneBean.getList().add(new CloneBean(02,"02"));
        deepCloneBean.getMap().put("map0","map-0");

        DeepCloneBean deepCloneBeanClone = (DeepCloneBean)deepCloneBean.clone();
        deepCloneBeanClone.setName("1");
        deepCloneBeanClone.getList().add(new CloneBean(11,"11"));
        System.out.println(deepCloneBean);
        System.out.println(deepCloneBeanClone);
        System.out.println(deepCloneBean.getMap().toString() + deepCloneBeanClone.getMap());
        System.out.println(deepCloneBean.getList()==deepCloneBeanClone.getList());
    }

    private String name;
    private Client client;

    /**
     *  潜克隆
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
