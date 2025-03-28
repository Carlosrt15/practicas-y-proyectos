package com.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonalModel extends modelDatabase {
    
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

    public boolean addPersonal(String name, String occupation, int idRoom) {
        String query = "INSERT INTO personal (name, occupation, id_room) VALUES (?, ?, ?)";

        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, name);
            stmt.setString(2, occupation);
            stmt.setInt(3, idRoom);
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean deletePersonal(int id) {
        String query = "DELETE FROM personal WHERE id_personal = ?";

        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, id);
            int affectedRows = stmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}