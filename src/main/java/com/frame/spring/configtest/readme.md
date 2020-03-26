常用注解:
声明Bean的注解
@Component 组件没有明确角色
@Service 在业务逻辑层使用（service）使用
@Repository 在数据访问层(dao)使用
@Controller 在展示层(MVC->spring mvc)使用

注入Bean的注解
@Autowired spring提供的注解
@Inject JSR-330 提供的注解
@Resource JSR-250 提供的注解
@Bean