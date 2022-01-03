package pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//等价于 <bean id="user" class="pojo.User"/>
//@Component  组件
@Component
public class User {
    @Value("静婷")/* 相当于<property name="name" value="123"></property>*/
    public String name ;
}
