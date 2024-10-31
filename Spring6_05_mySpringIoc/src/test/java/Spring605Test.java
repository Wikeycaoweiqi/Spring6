import com.wikeystudy.spring6.bean.AnnotationApplicationContext;
import com.wikeystudy.spring6.bean.ApplicationContext;
import com.wikeystudy.spring6.controller.OrderController;
import org.junit.jupiter.api.Test;

/**
 * @ Author：Wikey Cao
 * @ Date：30-10-2024
 * @ Description：
 */
public class Spring605Test {
    @Test
    public void mySringIocTest() throws Exception {
        ApplicationContext context = new AnnotationApplicationContext("com.wikeystudy.spring6");
        OrderController orderController = (OrderController) context.getBean(OrderController.class);
        orderController.add();
    }
}