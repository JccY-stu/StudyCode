import com.yang.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyText {
    public static void main(String[] args) {
        /**
         * 说明getBean的时候
         *IOC创建对象的方式：
         *
         *       1.通过无参构造创建对象：<property name="name" value="杨某"/>
         *
         *       2.通过参数构造创建对象：<property name="name" value="杨某"/>
         *          2.1通过下标赋值创建对象<constructor-arg index="0" value="杨哥学Java"></constructor-arg>
         *          2.2通过类型创建对象（不推荐使用）<constructor-arg type="java.lang.String" value="OKK">
         *          2.3直接通过参数名来创建对象
         *
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("user3");
        user.show();
    }
}
