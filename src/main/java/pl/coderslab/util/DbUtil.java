package pl.coderslab.util;

import com.mysql.jdbc.Driver;
import org.springframework.stereotype.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Component
public class DbUtil {
    private static String DB_URL =
            "jdbc:mysql://localhost:3306/bets?useSSL=false";

    private static String DB_USER = "root";
    private static String DB_PASS = "coderslab";

//    public static Connection getConnection() throws SQLException {
//        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
//    }
    public static Connection getConnection()
    {
        try {
            DriverManager.registerDriver(new Driver());
            return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);

        } catch (SQLException ex) {
            throw new RuntimeException("Error connecting to the database", ex);
        }
    }

}
