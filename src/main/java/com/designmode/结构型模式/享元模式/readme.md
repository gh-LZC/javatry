名字：享元模式(flyweight)
定义:主要用于减少创建对象的数量，以减少内存占用和提高性能。
角色:
Flyweight 享元抽象类
FlyweightConcrete 享元具体类
FlyweightUnsharedConcrete 不需要共享的Flyweight子类
FlyweightFatory 享元工厂
FlyweightClient 客户端
使用场景：1、系统有大量相似对象。 2、需要缓冲池的场景。
解决问题: