package com.设计模式.创建型模式.单例模式;


import org.apache.commons.lang3.SerializationUtils;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @class SingletonLazyLoad
 * @Author Administrator
 * @Description 多线程会出现多个实例
 * @See SingletonHuangry
 * @Date 2020/2/21 22:00
 * @Version 1.0
 */
public class SingletonLazyLoad implements Serializable {
    private static SingletonLazyLoad singleton;
    private SingletonLazyLoad() {}
    public static SingletonLazyLoad getInstance() {
        if (singleton == null) {
            singleton = new SingletonLazyLoad();
        }
        return singleton;
    }

    //synchronized安全但是低性能，对象已经创建后，每次调用实例依然还需要获取锁
    public static synchronized SingletonLazyLoad getInstanceSyn() {
        if (singleton == null) {
            singleton = new SingletonLazyLoad();
        }
        return singleton;
    }

    //依然线性不安全，会创建多个实例
    public static SingletonLazyLoad getCheckInstance() {
        if (singleton == null) {
            synchronized (SingletonLazyLoad.class){
                singleton = new SingletonLazyLoad();
            }
        }
        return singleton;
    }

    /**
     * 安全高效的
     * Double-Checked Locking（DCL）
     * --问题
     * 针对延迟加载法的同步实现所产生的性能低的问题，可以采用DCL，即双重检查加锁（Double Check Lock）的方法来避免每次调用getInstance()方法时都同步。
     * <p>
     * Double-Checked Locking看起来是非常完美的。但是很遗憾，根据Java的语言规范，上面的代码是不可靠的。
     * 出现上述问题, 最重要的2个原因如下:
     * 1, 编译器优化了程序指令, 以加快cpu处理速度.
     * 2, 多核cpu动态调整指令顺序, 以加快并行运算能力.
     * <p>
     * 问题出现的顺序:
     * 1, 线程A, 发现对象未实例化, 准备开始实例化
     * 2, 由于编译器优化了程序指令, 允许对象在构造函数未调用完前, 将共享变量的引用指向部分构造的对象, 虽然对象未完全实例化, 但已经不为null了.
     * 3, 线程B, 发现部分构造的对象已不是null, 则直接返回了该对象.
     * <p>
     * 解决办法:
     * 可以将instance声明为volatile，即 private volatile static Singleton instance
     * 在线程B读一个volatile变量后，线程A在写这个volatile变量之前，所有可见的共享变量的值都将立即变得对线程B可见。
     * ----解决见@See
     */
    public static SingletonLazyLoad getDoubleCheckInstance() {
        if (singleton == null) {
            synchronized (SingletonLazyLoad.class) {
                if (singleton == null) {
                    singleton = new SingletonLazyLoad();
                }
            }
        }
        return singleton;
    }

    //volatite规避了，虚拟机规则导致的，不完整对象风险。能够得到正确的单例对象
    private static volatile SingletonLazyLoad singletonDcl;
    public static SingletonLazyLoad getDclInstanceSyn() {
        if (singletonDcl == null) {
            synchronized (SingletonLazyLoad.class) {
                if (singletonDcl == null) {
                    singletonDcl = new SingletonLazyLoad();
                }
            }
        }
        return singletonDcl;
    }

    //使用锁实现
    private static final ReentrantLock lock = new ReentrantLock();

    public static SingletonLazyLoad getSafeEfficientRightInstanceLock() {
        if (singletonDcl == null) {
            lock.lock();
            try {
                if (singletonDcl == null) {
                    singletonDcl = new SingletonLazyLoad();
                }
            } finally {
                lock.unlock();
            }
        }
        return singletonDcl;
    }

    //反射破坏单例
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        reflectDestroySin();
        serDestroySin();
    }

    private static void reflectDestroySin() throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        SingletonLazyLoad singletonLazyLoad = SingletonLazyLoad.getInstance();
        Constructor<SingletonLazyLoad> constructor = SingletonLazyLoad.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        SingletonLazyLoad singletonLazyLoad1 = constructor.newInstance();
        System.out.println(singletonLazyLoad == singletonLazyLoad1);
    }

    //序列化破坏单例
    public static void  serDestroySin(){
        SingletonLazyLoad singletonLazyLoad = SingletonLazyLoad.getInstance();
        byte[] serialize = SerializationUtils.serialize(singletonLazyLoad);
        SingletonLazyLoad singletonLazyLoad1 = SerializationUtils.deserialize(serialize);
        System.out.println(singletonLazyLoad == singletonLazyLoad1);
    }

    //单例简洁实现安全单例
    enum Singleton{
        INSTANCE("1","li");
        private String name;
        private String code;
        Singleton(String code,String name){
            this.name = name;
            this.code = code;
        }

        public void doSomething() {
            System.out.println("doSomething");
        }

        public static void main(String[] args) {
            Singleton.INSTANCE.doSomething();
            System.out.printf(Singleton.INSTANCE.code);;
        }
    }
}
