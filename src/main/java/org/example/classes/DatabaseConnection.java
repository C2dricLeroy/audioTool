package org.example.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseConnection {
    private static final String DATABASE_URL = "";
    private Connection connection;

    public static DatabaseConnection getInstance() {
        return new DatabaseConnection();
    }

    private DatabaseConnection() {

    }

    public Connection getConnection() {
        return null;
    }

    public void closeConnection() {

    }

    public void executeUpdate(String sql) {

    }

    public ResultSet executeQuery(String sql) {
        return null;
    }

    public void closeStatement(Statement statement) {

    }

    public void closePreparedStatement(PreparedStatement preparedStatement) {

    }

    public void closeConnection(Connection connection) {

    }

}
