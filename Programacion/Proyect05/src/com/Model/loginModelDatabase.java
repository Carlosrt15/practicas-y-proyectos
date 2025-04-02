package com.Model;

import java.sql.*;

public class loginModelDatabase implements ILoginModel {
    
    private static final String URL = "jdbc:mysql://localhost:3306/user_role";
    private static final String USER = "root";
    private static final String PASSWORD = "PracticaRoot";
    private Connection connection;
    
    // Constructor para establecer la conexión a la base de datos
    public loginModelDatabase() throws SQLException {
        this.connection = DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // Método para verificar las credenciales de login
    public boolean checkLogin(String name, String password) {
        String sql = "SELECT * FROM user WHERE name = ? AND password = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, name);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            return rs.next(); // Si hay al menos un resultado, las credenciales son correctas
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Método para listar todos los usuarios
    public void listarUsuarios() {
        String sql = "SELECT * FROM user";
        try (Statement stmt = connection.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Nombre: " + rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para cerrar la conexión a la base de datos
    public void close() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }
}
