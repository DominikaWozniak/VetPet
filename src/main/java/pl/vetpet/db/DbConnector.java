package pl.vetpet.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnector {

    private static final String URL = "jdbc:mysql://localhost/vetpet";
    private static final String USER = "root";
    private static final String PASSWORD = "root";


    public static Connection connect() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
