#java 元注解，修饰注解的注解
@Target//限制注解可以描述的对象
@Retention//限制注解在虚拟机的生效周期

@Inherite//子类可以拥有该注解
类继承关系中@Inherited的作用
类继承关系中，子类会继承父类使用的注解中被@Inherited修饰的注解
接口继承关系中@Inherited的作用
接口继承关系中，子接口不会继承父接口中的任何注解，不管父接口中使用的注解有没有被@Inherited修饰
类实现接口关系中@Inherited的作用
类实现接口时不会继承任何接口中定义的注解
@Documented//让注解出现在javadoc描述里面