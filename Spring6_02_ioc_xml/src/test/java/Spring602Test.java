import com.wikeystudy.spring6.bean.*;
import com.wikeystudy.spring6.dao.*;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ Author：Wikey Cao
 * @ Date：24-10-2024
 * @ Description：
 */
public class Spring602Test {

    @Test
    public void getBeanByIdTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User user = (User) context.getBean("user");
        System.out.println("Get bean by id: " + user);
    }

    @Test
    public void getBeanByTypeTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User user = context.getBean(User.class);
        System.out.println("Get bean by type: " + user);
    }

    @Test
    public void getBeanByIdAndTypeTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User user = (User) context.getBean("user", User.class);
        System.out.println("Get bean by type: " + user);
    }

    @Test
    public void getUserDaoImplBeanTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserDao userDao = context.getBean(UserDao.class);
        System.out.println("Get userDao bean: " + userDao);
        userDao.run();
    }

    @Test
    public void bookBeanSetterDiTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Book book = (Book) context.getBean("book");
        System.out.println("Get setter di book bean: " + book);
    }

    @Test
    public void bookBeanConstructorDiTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Book book = (Book) context.getBean("bookCon");
        System.out.println("Get constructor di book bean: " + book);
    }

    @Test
    public void specialTypeDiOutterBeanTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Employee employee = (Employee) context.getBean("employee1");
        System.out.println(employee);
    }

    @Test
    public void specialTypeDiInnerBeanTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Employee employee = (Employee) context.getBean("employee2");
        System.out.println(employee);
    }

    @Test
    public void specialTypeDiArrayTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Employee employee = (Employee) context.getBean("employee4");
        System.out.println(employee);
    }

    @Test
    public void specialTypeDiListTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Department department = (Department) context.getBean("department4");
        System.out.println(department);
    }

    @Test
    public void specialTypeDiMapTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Student student1 = (Student) context.getBean("student1");
        Student student2 = (Student) context.getBean("student2");
        Student student3 = (Student) context.getBean("student3");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
}