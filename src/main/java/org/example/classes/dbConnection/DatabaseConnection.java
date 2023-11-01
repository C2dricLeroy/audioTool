package org.example.classes.dbConnection;

import java.sql.*;

public class DatabaseConnection {
    private static final String DATABASE_URL = "jdbc:sqlite:/home/cedric/Bureau/programmation/Java/audioTool/database.audioTool.db";
    private DatabaseConnection connection;
    private static DatabaseConnection instance;

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    private DatabaseConnection() {
        try {
            DatabaseConnection db = (DatabaseConnection) DriverManager.getConnection(DATABASE_URL);
            this.connection = db;
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /*public void closeConnection() {
        try {
            if (connection != null) {
               *//* connection.close();*//*
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }*/

    public void executeUpdate(String sql) {

    }

    public ResultSet executeQuery(String sql) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Obtenez une connexion à votre base de données
            /*connection = this.getConnection();*/

            // Créez un objet Statement
            statement = connection.createStatement();

            resultSet = statement.executeQuery(sql);

        } catch (Exception e) {
            e.printStackTrace();
            // Gérez les exceptions ici
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        return resultSet;
    }

    public void closeStatement(Statement statement) {

    }

    public void closePreparedStatement(PreparedStatement preparedStatement) {

    }

    public void closeConnection(Connection connection) {

    }

}
