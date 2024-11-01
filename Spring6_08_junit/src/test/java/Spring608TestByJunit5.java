import com.wikeystudy.spring6.junit5.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @ Author：Wikey Cao
 * @ Date：01-11-2024
 * @ Description：
 */
@SpringJUnitConfig(locations = "classpath:bean.xml")
public class Spring608TestByJunit5 {

    @Autowired
    private User user;

    @Test
    public void testUser() {
        user.run();
    }
}