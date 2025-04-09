package com.model;

import com.model.entities.Mesa;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MesaModelDB {
    private static final String URL = "jdbc:mysql://localhost:3306/project06";
    private static final String USER = "root";
    private static final String PASSWORD = "PracticaRoot";

    private Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public void insertar(Mesa mesa) {
        String sql = "INSERT INTO mesas (num_personas, id_menu) VALUES (?, ?)";

        try (Connection conn = conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, mesa.getNumPersonas());
            if (mesa.getIdMenu() != null) {
                stmt.setInt(2, mesa.getIdMenu());
            } else {
                stmt.setNull(2, Types.INTEGER);
            }

            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al insertar mesa: " + e.getMessage());
        }
    }

    public List<Mesa> listar() {
        List<Mesa> mesas = new ArrayList<>();

        try (Connection conn = conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM mesas")) {

            while (rs.next()) {
                mesas.add(new Mesa(
                    rs.getInt("id_mesa"),
                    rs.getInt("num_personas"),
                    rs.getObject("id_menu") != null ? rs.getInt("id_menu") : null
                ));
            }

        } catch (SQLException e) {
            System.out.println("Error al listar mesas: " + e.getMessage());
        }

        return mesas;
    }

    public void eliminar(int idMesa) {
        String sql = "DELETE FROM mesas WHERE id_mesa = ?";

        try (Connection conn = conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idMesa);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al eliminar mesa: " + e.getMessage());
        }
    }

    public void actualizar(Mesa mesa) {
        String sql = "UPDATE mesas SET num_personas = ?, id_menu = ? WHERE id_mesa = ?";

        try (Connection conn = conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, mesa.getNumPersonas());
            if (mesa.getIdMenu() != null) {
                stmt.setInt(2, mesa.getIdMenu());
            } else {
                stmt.setNull(2, Types.INTEGER);
            }
            stmt.setInt(3, mesa.getIdMesa());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al actualizar mesa: " + e.getMessage());
        }
    }
}
