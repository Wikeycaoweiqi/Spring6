import com.wikeystudy.spring6.Calculator;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ Author：Wikey Cao
 * @ Date：01-11-2024
 * @ Description：
 */
public class Spring607Test {

    @Test
    public void firstNotificationTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Calculator calculator = context.getBean(Calculator.class);
        calculator.add(1, 2);
    }

    @Test
    public void secondNotificationTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Calculator calculator = context.getBean(Calculator.class);
        calculator.mul(1, 2);
    }

    @Test
    public void thirdNotificationTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Calculator calculator = context.getBean(Calculator.class);
        calculator.sub(1, 2);
    }

    @Test
    public void fourthNotificationTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Calculator calculator = context.getBean(Calculator.class);
        calculator.div(1, 0);
    }

    @Test
    public void fifthNotificationTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Calculator calculator = context.getBean(Calculator.class);
        calculator.add(1, 3);
    }
}