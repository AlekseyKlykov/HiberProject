package hw09_HiberProject;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
    private static final String URL = "jdbc:mysql://localhost:3306/Vetdb";
    private static final String USER = "root";
    private static final String PASSWORD = "123";

    public static Connection getConnection() throws SQLException {
        return (Connection) DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
