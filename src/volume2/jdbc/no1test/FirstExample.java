package volume2.jdbc.test;

import java.sql.*;

/**
 * @author Yuan Zhibo
 * @ClassName FirstExample.java
 * @Description TODO
 * @createTime 2020年03月31日 17:26:00
 */
public class FirstExample {
    static final String DB_URL = "jdbc:mysql://localhost:3306/emp?serverTimezone=UTC";
    static final String USER = "root";
    static final String PASS = "11235813";

    public static void main(String[] args) throws ClassNotFoundException {
        Connection conn = null;
        Statement stmt = null;

        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            System.out.println("Creating statement...");
            stmt = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            String sql = "select id, first, last, age from Employees";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()){
                //Retrieve by column name
                int id  = rs.getInt("id");
                int age = rs.getInt("age");
                String first = rs.getString("first");
                String last = rs.getString("last");

                //Display values
                System.out.print("ID: " + id);
                System.out.print(", Age: " + age);
                System.out.print(", First: " + first);
                System.out.println(", Last: " + last);
            }
            rs.close();
        } catch ( SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if(stmt != null) stmt.close();
            }catch (SQLException se2){

            }
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }
        System.out.println("Finish");
    }
}
