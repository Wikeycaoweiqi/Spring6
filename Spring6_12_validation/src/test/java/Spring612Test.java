import com.wikey.spring6.Person;
import com.wikey.spring6.PersonValidator;
import org.junit.jupiter.api.Test;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;

/**
 * @ Author：Wikey Cao
 * @ Date：04-11-2024
 * @ Description：
 */
public class Spring612Test {

    @Test
    public void personValidatorByInterfaceTest() {
        Person person1 = new Person();
        DataBinder dataBinder1 = new DataBinder(person1);
        dataBinder1.setValidator(new PersonValidator());
        dataBinder1.validate();
        BindingResult result1 = dataBinder1.getBindingResult();
        System.out.println(result1);

        Person person2 = new Person();
        person2.setName("wikey");
        person2.setAge(130);
        DataBinder dataBinder2 = new DataBinder(person2);
        dataBinder2.setValidator(new PersonValidator());
        dataBinder2.validate();
        BindingResult result2 = dataBinder2.getBindingResult();
        System.out.println(result2);

        Person person3 = new Person();
        person3.setName("wikey");
        person3.setAge(28);
        DataBinder dataBinder3 = new DataBinder(person3);
        dataBinder3.setValidator(new PersonValidator());
        dataBinder3.validate();
        BindingResult result3 = dataBinder3.getBindingResult();
        System.out.println(result3);
    }
}