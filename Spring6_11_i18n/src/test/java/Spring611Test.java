import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @ Author：Wikey Cao
 * @ Date：04-11-2024
 * @ Description：
 */
@SpringJUnitConfig(locations = "classpath:bean.xml")
public class Spring611Test {

    @Test
    public void getI18nByJavaTest() {
        ResourceBundle bundle1 = ResourceBundle.getBundle("messages", new Locale("zh", "CN"));
        String value1 = bundle1.getString("test");
        System.out.println(value1);

        ResourceBundle bundle2 = ResourceBundle.getBundle("messages", new Locale("en", "GB"));
        String value2 = bundle2.getString("test");
        System.out.println(value2);
    }

    @Test
    public void getI18nBySpringTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Object[] objs1 = new Object[]{"Wikey", new Date().toString()};
        String value1 = context.getMessage("www.wikeyspring6.com", objs1, Locale.CHINA);
        System.out.println(value1);
    }
}