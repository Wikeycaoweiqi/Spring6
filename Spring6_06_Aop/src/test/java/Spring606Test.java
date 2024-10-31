import com.wikeystudy.spring6.aop.Calculator;
import com.wikeystudy.spring6.aop.CalculatorImpl;
import com.wikeystudy.spring6.aop.ProxyFactory;
import org.junit.jupiter.api.Test;

/**
 * @ Author：Wikey Cao
 * @ Date：30-10-2024
 * @ Description：
 */
public class Spring606Test {

    @Test
    public void dynamicProxyTest() {
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator calculator = (Calculator) proxyFactory.getProxy();
        calculator.add(1, 2);
        calculator.div(1, 2);
    }
}