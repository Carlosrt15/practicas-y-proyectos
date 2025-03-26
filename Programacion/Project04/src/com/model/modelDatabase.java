package com.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class modelDatabase {

    private static final String USERNAME = "root";
    private static final String PASSWORD = "PracticaRoot";
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/p04_gym?ssl=false";

    private Connection connection;

    public modelDatabase() {
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Conexión establecida con éxito.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Obtener todos los registros de 'personal'
    public List<String> getAllPersonal() {
        List<String> personalList = new ArrayList<>();
        String query = "SELECT id_personal, name, occupation, id_room FROM personal";

        try (PreparedStatement stmt = connection.prepareStatement(query);
             ResultSet resultSet = stmt.executeQuery()) {
            while (resultSet.next()) {
                personalList.add("ID: " + resultSet.getInt("id_personal") +
                        " | Nombre: " + resultSet.getString("name") +
                        " | Ocupación: " + resultSet.getString("occupation") +
                        " | Sala ID: " + resultSet.getInt("id_room"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return personalList;
    }

    // Agregar un nuevo Personal
    public void addPersonal(String name, String occupation, int idRoom) {
        String query = "INSERT INTO personal (name, occupation, id_room) VALUES (?, ?, ?)";

        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, name);
            stmt.setString(2, occupation);
            stmt.setInt(3, idRoom);
            stmt.executeUpdate();
            System.out.println("Personal agregado correctamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Eliminar Personal
    public void deletePersonal(int id) {
        String query = "DELETE FROM personal WHERE id_personal = ?";

        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Personal eliminado correctamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Obtener todas las salas
    public List<String> getAllRooms() {
        List<String> roomList = new ArrayList<>();
        String query = "SELECT id_room, name, capacity, type FROM room";

        try (PreparedStatement stmt = connection.prepareStatement(query);
             ResultSet resultSet = stmt.executeQuery()) {
            while (resultSet.next()) {
                roomList.add("ID: " + resultSet.getInt("id_room") +
                        " | Nombre: " + resultSet.getString("name") +
                        " | Capacidad: " + resultSet.getInt("capacity") +
                        " | Tipo: " + resultSet.getString("type"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return roomList;
    }

    // Agregar Sala
    public void addRoom(String name, int capacity, String type) {
        String query = "INSERT INTO room (name, capacity, type) VALUES (?, ?, ?)";

        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, name);
            stmt.setInt(2, capacity);
            stmt.setString(3, type);
            stmt.executeUpdate();
            System.out.println("Sala agregada correctamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Eliminar Sala
    public void deleteRoom(int id) {
        String query = "DELETE FROM room WHERE id_room = ?";

        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Sala eliminada correctamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


