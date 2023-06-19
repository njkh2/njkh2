package TransportManagement.DBConnection;
import java.util.*;
import java.sql.*;
public class DBconnection {
    public static Connection getConnection() throws SQLException{
        Connection connection;
        String url = "jdbc:mysql://localhost:3306/Transport";
        String user= "root";
        String password = "@12Abhishek";
        connection = DriverManager.getConnection(url,user,password);
        return connection;
    }
}