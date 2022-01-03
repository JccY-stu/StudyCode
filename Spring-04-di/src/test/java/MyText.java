import com.yang.pojo.Student;
import com.yang.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyText {
    public static void main(String[] args) {
        /**
         * Set各种类型的注入示例;
         *
         *
         *
         *
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
    }



    @Test
    public void text2(){

        /**
         * P命名空间和C命名空间不能直接使用，必须要引入约束;
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        /**
         * 设置Bean的作用域，单例和原型;
         * scope="prototype"
         * scope="singleton"
         */
        User user1 = (User) context.getBean("user",User.class);
        User user3 = (User) context.getBean("user",User.class);
        System.out.println("单例Bean作用域下是否为同一个对象："+(user1==user3));
        User user = (User) context.getBean("user2",User.class);
        User user2 = (User) context.getBean("user2",User.class);
        System.out.println("原型Bean作用域下是否为同一个对象："+(user==user2));

    }

}
