package org.example.classes;

import java.sql.*;

public class DatabaseConnection {
    private static final String DATABASE_URL = "jdbc:sqlite:/home/cedric/Bureau/programmation/Java/audioTool/database.audioTool.db";
    private Connection connection;
    private static DatabaseConnection instance;

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    private DatabaseConnection() {
        try {
            connection = DriverManager.getConnection(DATABASE_URL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
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
