package database;

import java.sql.*;

public class JDBCUtil {

    public static Connection getConnection() {
        Connection connection = null;
        try {

            DriverManager.registerDriver(new com.mysql.jdbc.Driver());

            String url = "jdbc:mySQL://localhost:3306/database";
            String username = "root";
            String password = "";

            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
        }
        return connection;
    }

    public static void closeConnection(Connection c) {
        try {
            if (c != null) {
                c.close();
            }
        } catch (SQLException e) {
        }
    }
}
