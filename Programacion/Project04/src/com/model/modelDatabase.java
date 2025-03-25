package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class modelDatabase {

    private static final String USERNAME = "root";
    private static final String PASSWORD = "PracticaRoot";
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/p04_gym?ssl=false";  // Asegúrate de que esta URL es correcta

    private Connection connection;

    public modelDatabase() {
        try {
            // Conexión a la base de datos
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Conexión establecida con éxito.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para obtener todos los registros de 'personal'
    public ResultSet getAllPersonal() {
        try {
            String query = "SELECT * FROM personal";  // Asegúrate de que 'personal' es el nombre correcto de la tabla
            PreparedStatement stmt = connection.prepareStatement(query);
            return stmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Método para agregar un registro de Personal
    public void addPersonal(String name, String occupation, int idRoom) {
        try {
            // No necesitamos pasar 'id_personal' ya que es AUTO_INCREMENT
            String query = "INSERT INTO personal (name, occupation, id_personal) VALUES (?, ?, ?)";  // Usa 'id_room' y no 'idRoom'
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, name);
            stmt.setString(2, occupation);
            stmt.setInt(3, idRoom);  // Asegúrate de que 'id_room' es correcto y existe
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para eliminar un registro de Personal
    public void deletePersonal(int id) {
        try {
            // Eliminar utilizando 'id_personal'
            String query = "DELETE FROM personal WHERE id_personal = ?";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para obtener todos los registros de 'room'
    public ResultSet getAllRooms() {
        try {
            String query = "SELECT * FROM room";  // 'room' es el nombre correcto de la tabla
            PreparedStatement stmt = connection.prepareStatement(query);
            return stmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Método para agregar un registro de Room
    public void addRoom(String name, int capacity, String type) {
        try {
            // No es necesario pasar 'id_room' ya que es AUTO_INCREMENT
            String query = "INSERT INTO room (name, capacity, type) VALUES (?, ?, ?)";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, name);
            stmt.setInt(2, capacity);
            stmt.setString(3, type);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para eliminar un registro de Room
    public void deleteRoom(int id) {
        try {
            String query = "DELETE FROM room WHERE id_room = ?";  // 'id_room' es el nombre correcto de la columna
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


