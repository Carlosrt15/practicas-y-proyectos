package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class modelDatabase {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "PracticaRoot";
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/p04_gym?ssl=false";
    
    protected Connection connection;
    
    public modelDatabase () {
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Conexión establecida con éxito.");
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos:");
            e.printStackTrace();
        }
    }
    
    public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}