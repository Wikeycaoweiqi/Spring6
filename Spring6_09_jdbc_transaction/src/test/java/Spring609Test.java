import com.wikeystudy.spring6.bean.Employee;
import com.wikeystudy.spring6.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;

/**
 * @ Author：Wikey Cao
 * @ Date：01-11-2024
 * @ Description：
 */
@SpringJUnitConfig(locations = "classpath:bean.xml")
public class Spring609Test {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private BookController bookController;

    @Test
    public void queryEmpSqlTest() {
        Object[] params = {1};
        String sql = "SELECT T.* FROM T_EMP T WHERE ID = ?";
//        Employee employee = jdbcTemplate.queryForObject(sql, (rs, rowNum) -> {
//            Employee emp = new Employee();
//            emp.setId(rs.getInt("id"));
//            emp.setName(rs.getString("name"));
//            emp.setAge(rs.getInt("age"));
//            emp.setSex(rs.getString("sex"));
//            return emp;
//        }, params);
        Employee employee = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Employee.class), params);
        System.out.println(employee);
    }

    @Test
    public void queryEmpListSqlTest() {
        String sql = "SELECT T.* FROM T_EMP T";
        List<Employee> employeeList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Employee.class));
        System.out.println(employeeList);
    }

    @Test
    public void querySingleValueSqlTest() {
        String sql = "SELECT COUNT(*) FROM T_EMP T";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(count);
    }

    @Test
    public void insertSqlTest() {
        Object[] params = {"王五", 32, "男"};
        String sql = "INSERT INTO T_EMP (NAME, AGE, SEX) VALUES (?, ?, ?)";
        int rows = jdbcTemplate.update(sql, params);
        System.out.println(rows);
    }

    @Test
    public void updateSqlTest() {
        Object[] params = {80, 1};
        String sql = "UPDATE T_EMP SET AGE = ? WHERE ID = ?";
        int rows = jdbcTemplate.update(sql, params);
        System.out.println(rows);
    }

    @Test
    public void deleteSqlTest() {
        Object[] params = {3};
        String sql = "DELETE FROM T_EMP WHERE ID = ?";
        int rows = jdbcTemplate.update(sql, params);
        System.out.println(rows);
    }

    @Test
    public void buyBookTransactionTest() throws InterruptedException {
        bookController.buyBook(1, 3);
    }
}