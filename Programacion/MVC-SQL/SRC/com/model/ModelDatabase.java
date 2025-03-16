package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ModelDatabase {

    private Connection connection;
   
    // Constructor para la conexion
    public ModelDatabase() {
        connectToDatabase();
    }

    // Metodo para connectar
    private void connectToDatabase() {
        String url = "jdbc:mysql://localhost:3306/northwind";

        String user = "root";
        String password = "PracticaRoot";

        try {
                // Cargara el Driver para DB
            Class.forName("com.mysql.cj.jdbc.Driver");

             // Inicia la conexion
             connection = DriverManager.getConnection(url, user, password);
             System.out.println("Conexion APTA en la DB");

            } catch (ClassNotFoundException | SQLException e) {
                System.err.println("Error al conectar en la DB: " + e.getMessage());
            }   
        }

    }

