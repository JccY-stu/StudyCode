
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserServiceImpl;

public class MyText {
    public static void main(String[] args) {
        /*用户实际调用业务层，无需接触dao层;
        UserService userService = new UserServiceImpl();
        /**
         * 环境：UserDao接口，UserDao实现类，UserService接口，UserService实现类;
         *
         *
         * 在之前的业务中，需要根据用户需求去修改代码;
         * 而使用Set接口实现， 已经发生了革命性变化;
         * 使用Set注入后程序不再有主动性，而是被动接受对象;
         * 这种思想从本质上解决问题，程序员不用再管理对象的创建，系统耦合性大大降低，可以更加专注在业务的是线上，这就是IOC的原型！
         */
        /*userService.setUserDao(new UserDaoOrcaleImple());
        userService.getUser();*/
        //获取ApplicationContext;拿到Spring容器;
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //需要什么 Get什么;
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("userServiceImpl");
        userServiceImpl.getUser();
    }
}

