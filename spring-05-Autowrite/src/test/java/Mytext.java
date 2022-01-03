import com.yang.pojo.Dog;
import com.yang.pojo.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytext {
    @Test
    public void text1(){

        /**
         * 自动装配：
         *
         *  一、 ByName和ByType自动装配
         * 1.byname的时候，需要保证所有bean的id唯一，并且这个bean需要和自动注入的属性的set方法的值一致;
         * 2.bytype的时候，需要保证所有bean的类型唯一，并且这个bean需要和注入的属性类型一致;
         *
         *  二、使用注解装配（重要）
         *  前提：
         *  1.导入context约束；
         *  2.开启注解的支持；
         *
         *
         *
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Person person = context.getBean("person", Person.class);
        person.getCat().shout();
        person.getDog().shout();
    }
}
