package com.Model;

import com.Model.entities.Users;
import java.sql.*;

public class registerModelDatabase {

    private static final String URL = "jdbc:mysql://localhost:3306/user_role";
    private static final String USER = "root";
    private static final String PASSWORD = "PracticaRoot";
    private Connection connection;
    
    // Constructor para establecer la conexión a la base de datos
    public registerModelDatabase() throws SQLException {
        this.connection = DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // Método para registrar un usuario en la base de datos
    public boolean registerUser(Users user) {
        boolean success = false;

        // Sentencia SQL para insertar el usuario en la base de datos
        String sql = "INSERT INTO user_role.user (name, password, role_id) VALUES (?, ?, ?)";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, user.getName());
            stmt.setString(2, user.getPassword());
            stmt.setNull(3, java.sql.Types.INTEGER); // Utilizamos NULL para role_id si no se asigna un rol

           
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                success = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return success;
    }

  
    public void close() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }
}
