package volume2.jdbc.no5DAO.test;

import org.junit.Test;
import volume2.jdbc.bean.Customer;
import volume2.jdbc.no5DAO.CustomerDAOImpl;
import volume2.jdbc.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;


/**
 * @author Yuan Zhibo
 * @ClassName CustomerDAOImplTest.java
 * @Description TODO
 * @createTime 2020年04月03日 23:24:00
 */
public class CustomerDAOImplTest {

    private CustomerDAOImpl dao = new CustomerDAOImpl();

    @Test
    public void insert() {
        try (Connection conn = JDBCUtils.getConnection()) {
            Customer customer = new Customer(1, "我的测试", "test@163.com", new Date(1231231231312L));
            dao.insert(conn, customer);
            System.out.println("添加成功");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void deleteById() {
        try (Connection conn = JDBCUtils.getConnection()) {
            dao.deleteById(conn, 20);
            System.out.println("删除成功");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void update() {
        try (Connection conn = JDBCUtils.getConnection()) {
            Customer customer = new Customer(19, "德玛西亚", "demacia@163.com", new Date(12312339999L));
            dao.update(conn, customer);
            System.out.println("修改成功");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void getCustomerById() {
        try (Connection conn = JDBCUtils.getConnection()) {
            Customer customer = dao.getCustomerById(conn, 10);
            System.out.println(customer);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getAll() {
        try (Connection conn = JDBCUtils.getConnection()) {
            List<Customer> list = dao.getAll(conn);
            list.forEach(System.out::println);


        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getCount() {
        try (Connection conn = JDBCUtils.getConnection()) {
            Long count = dao.getCount(conn);
            System.out.println(count);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getMaxBirth() {
        try (Connection conn = JDBCUtils.getConnection()) {
            Date maxBirth = dao.getMaxBirth(conn);
            System.out.println(maxBirth);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}