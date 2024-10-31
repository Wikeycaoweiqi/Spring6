import com.wikeystudy.spring6.bean.User;
import com.wikeystudy.spring6.bean.config.MySpringConfiguration;
import com.wikeystudy.spring6.bean.controller.OrderController;
import com.wikeystudy.spring6.bean.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ Author：Wikey Cao
 * @ Date：30-10-2024
 * @ Description：
 */
public class Spring603Test {

    @Test
    public void getUserByComponentAnnotationTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }

    @Test
    public void autowiredByAnnotationTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserController userController = context.getBean("userController", UserController.class);
        userController.add();
    }

    @Test
    public void resourceByAnnotationTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        OrderController orderController = context.getBean("orderController", OrderController.class);
        orderController.add();
    }

    @Test
    public void fullAnnotationDevTest() {
        ApplicationContext context = new AnnotationConfigApplicationContext(MySpringConfiguration.class);
        UserController userController = context.getBean("userController", UserController.class);
        userController.add();
    }
}