package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcTest {

    public static void main(String[] args) {
        String jdbcUrl="jdbc:mysql://localhost:3306/hb-04-one-to-many-uni";
        String user="hbstudent";
        String pass="Wallclock@322";

        try{
            System.out.println("connecting to mysql database");
            Connection con= DriverManager.getConnection(jdbcUrl,user,pass);
            System.out.println("Connected successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
