import com.yang.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyText {
    public static void main(String[] args) {
        //获取Spring的上下文对象;
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //我们的对象限制都在Spring中管理，要使用直接取;
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());
    }
}
