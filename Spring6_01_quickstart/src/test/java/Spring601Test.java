import com.wikeystudy.spring6.bean.User;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ Author：Wikey Cao
 * @ Date：24-10-2024
 * @ Description：
 */
public class Spring601Test {

    private Logger logger = LoggerFactory.getLogger(Spring601Test.class);

    @Test
    public void testUserObject() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User user1 = (User) context.getBean("user");
        System.out.println(user1);
        user1.add();

        Class clazz = Class.forName("com.wikeystudy.spring6.bean.User");
        User user2 = (User) clazz.getDeclaredConstructor().newInstance();
        System.out.println(user2);

        logger.info("### running successfully ###");
    }
}