springaop应用说明:
一、通过注解实现：
0.导入切面支持依赖：
<dependency>
            <grou.......................................pId>org.springframework</groupId>
            <artifactId>spring-aop</artifactId>
            <version>${spring.version}</version>
        </dependency>
        <!--添加切面-->
        <dependency>
            <groupId>org.aspectj</groupId>
            <artifactId>aspectjrt</artifactId>
            <version>1.8.5</version>
        </dependency>
        <dependency>
            <groupId>org.aspectj</groupId>
            <artifactId>aspectjweaver</artifactId>
            <version>1.8.5</version>
        </dependency>
1.编写切面类LogAspect 并使用使用注解@Aspect 声明切面
1.1在切面类里面编写拦截规则方法：使用使用注解定义通知及切点
1.2每个通知编写拦截规则
2切面切点都声明为spring bean
3.编写配置类，开启组件扫描及切面自动代理
@ComponentScan
@EnableAspectJAutoProxy


二、AOP注解说明：
@Aspect 定义切面：切面由切点和增强（引介）组成(可以包含多个切点和多个增强)，它既包括了横切逻辑的定义，也包括了连接点的定义，SpringAOP就是负责实施切面的框架，它将切面所定义的横切逻辑织入到切面所指定的链接点中。
@Pointcut 定义切点：切点是一组连接点的集合。AOP通过“切点”定位特定的连接点。通过数据库查询的概念来理解切点和连接点的关系再适合不过了：连接点相当于数据库中的记录，而切点相当于查询条件。
@Before ：在目标方法被调用之前做增强处理,@Before只需要指定切入点表达式即可。
@AfterReturning ： 在目标方法正常完成后做增强,@AfterReturning除了指定切入点表达式后，还可以指定一个返回值形参名returning,代表目标方法的返回值。
@Afterthrowing： 主要用来处理程序中未处理的异常,@AfterThrowing除了指定切入点表达式后，还可以指定一个throwing的返回值形参名,可以通过该形参名来访问目标方法中所抛出的异常对象。
@After： 在目标方法完成之后做增强，无论目标方法时候成功完成。@After可以指定一个切入点表达式。
@Around： 环绕通知,在目标方法完成前后做增强处理,环绕通知是最重要的通知类型,像事务,日志等都是环绕通知,注意编程中核心是一个ProceedingJoinPoint。


三、主要使用场景:
日志记录，性能统计，安全控制，事务处理，异常处理等等。
Authentication 权限
Caching缓存
Context passing内容传递
Error handling 错误处理
Lazy loading 延时加载
Debugging 调试
logging, tracing, profiling and monitoring 记录跟踪 优化 校准
Performance optimization性能优化
Persistence 持久化
Resource pooling资源池
Synchronization 同步
Transactions事务
