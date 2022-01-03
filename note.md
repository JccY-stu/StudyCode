## 注解说明
/**总结：
 *@Autowired和@Resource的区别
 * 1.都是用来自动装配的，都可以放在属性字段上；
 * 2.@Autowired通过byType的方式实现，如果找不到名字就通过byname实现，而且必须要求对象存在；
 * 3.@Resource通过byname的方式实现，如果找不到名字则通过byType实现，如果两个都找不到的情况下就报错；
 * 4.执行顺序不同，@Autowired先用byType，@Resource先用byname；
 * 5.使用@Nullable；允许为空不报错
 
 ## 使用注解开发
    在Spring4之后，要使用注解开发，必须要保证aop包的导入，使用注解需要导入context约束，增加注解的支持；
    <!--    注解驱动-->
    <context:annotation-config/>
    <!--    指定要扫描的包，这个包下的注解就会生效-->
    <context:component-scan base-package="pojo"></context:component-scan>
        
        1.bean注入    
           //@Component          等价于 <bean id="user" class="pojo.User"/>
           public class user
        2.属性注入
            @Value("静婷")        等价于 <property name="name" value="123"/>
            public String name ;
        3.衍生注解
            @Component有以下的衍生注解，我们在web开发中，会按照mvc三层架构分层
                dao [@Repository]
                service [@Service]
                controller [@Controller]
                这四个注解的功能一样，都是代表将某个类注册到Spring中，装配Bean
        4.作用域
            @Scope("prototype")   等价于 <property name="name" scope="prototype"/>
        5.小结：
            xml更加万能，适用于任何场合，灵活；
            注解简单，不是自己类用不了，维护相对复杂；
          最佳实践：
            xml管理bean
            注解只负责属性的注入
            我们在使用过程中，只需要注意一个问题，必须让注解生效就需要开启注解的支持（扫描指令，开启支持）；
                    
    
##使用Srping实现Aop    
    方式一：使用SpringAPI接口


    
       
    
 