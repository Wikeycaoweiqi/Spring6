import com.wikeystudy.spring6.ClassPathResourceDemo;
import com.wikeystudy.spring6.UrlResourceDemo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @ Author：Wikey Cao
 * @ Date：02-11-2024
 * @ Description：
 */
@SpringJUnitConfig(locations = "classpath:bean.xml")
public class Spring610Test {

    @Test
    public void urlResourceTest() {
        UrlResourceDemo.loadUrlResource("http://www.baidu.com");
        UrlResourceDemo.loadUrlResource("file:pom.xml");
    }

    @Test
    public void classPathResourceTest() {
        ClassPathResourceDemo.loadClassPathResource("file:bean.xml");
    }
}