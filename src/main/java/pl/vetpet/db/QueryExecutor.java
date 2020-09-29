package pl.vetpet.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QueryExecutor {

    public ResultSet executeSelect(String selectQuery){
        try{
            Connection connection = DbConnector.connect();
            Statement statement = connection.createStatement();
            return statement.executeQuery(selectQuery);
        } catch (SQLException e){
            throw new RuntimeException(e.getMessage());
        }
    }

    public void executeQuery(String query) {
        try{
            Connection connection = DbConnector.connect();
            Statement statement = connection.createStatement();
            statement.execute(query);
        } catch (SQLException e){
            throw new RuntimeException(e.getMessage());
        }
    }
}
