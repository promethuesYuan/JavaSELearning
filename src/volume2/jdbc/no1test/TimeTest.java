package volume2.jdbc.test;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author Yuan Zhibo
 * @ClassName TimeTest.java
 * @Description TODO
 * @createTime 2020年03月31日 21:23:00
 */
public class TimeTest {
    public static void main(String[] args) {
        java.util.Date javaDate = new java.util.Date();
        long javaTime = javaDate.getTime();
        System.out.println("The Java Date is:" +
                javaDate.toString());

        //Get and display SQL DATE
        java.sql.Date sqlDate = new java.sql.Date(javaTime);
        System.out.println("The SQL DATE is: " +
                sqlDate.toString());

        //Get and display SQL TIME
        java.sql.Time sqlTime = new java.sql.Time(javaTime);
        System.out.println("The SQL TIME is: " +
                sqlTime.toString());
        //Get and display SQL TIMESTAMP
        java.sql.Timestamp sqlTimestamp =
                new java.sql.Timestamp(javaTime);
        System.out.println("The SQL TIMESTAMP is: " +
                sqlTimestamp.toString());

        Properties properties = new Properties();
        properties.put("user", "root");
        properties.put("password", "11235813");
    }

    @Test
    public void testConnection() throws Exception{
        final String DB_URL = "jdbc:mysql://localhost:3306/emp?serverTimezone=UTC";
        final String USER = "root";
        final String PASS = "11235813";

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
        System.out.println(connection);
    }

    /**
     * 实现的优点
     * 1.实现了数据和代码分离，实现了解耦
     * 2.如果需要修改配置文件信息，可以避免程序重新打包
     */

    @Test
    public void testConnectionFinal() throws IOException, ClassNotFoundException, SQLException {
        // 1.读取配置信息
        InputStream inputStream = TimeTest.class.getClassLoader().getResourceAsStream("jdbc.properties");

        Properties properties = new Properties();
        properties.load(inputStream);

        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driverClass = properties.getProperty("driverClass");

        // 2.加载驱动
        Class.forName(driverClass);

        // 3.获取连接
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println(connection);
    }
}
