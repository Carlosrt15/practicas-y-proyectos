package com.model;

import com.model.entities.Cliente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteModelDB {

    private final String URL = "jdbc:mysql://localhost:3306/project06";
    private final String USER = "root";
    private final String PASSWORD = "PracticaRoot";

    private Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public void insertar(Cliente cliente) {
        try (Connection conn = conectar();
             PreparedStatement stmt = conn.prepareStatement(
                 "INSERT INTO cliente (name, telefono, id_mesa) VALUES (?, ?, ?)")) {

            stmt.setString(1, cliente.getName());
            stmt.setInt(2, cliente.getTelefono());
            if (cliente.getIdMesa() != null) {
                stmt.setInt(3, cliente.getIdMesa());
            } else {
                stmt.setNull(3, Types.INTEGER);
            }

            stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error al insertar cliente: " + e.getMessage());
        }
    }

    public List<Cliente> listar() {
        List<Cliente> clientes = new ArrayList<>();

        try (Connection conn = conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM cliente")) {

            while (rs.next()) {
                clientes.add(new Cliente(
                    rs.getInt("id_cliente"),
                    rs.getString("name"),
                    rs.getInt("telefono"),
                    rs.getObject("id_mesa") != null ? rs.getInt("id_mesa") : null
                ));
            }

        } catch (SQLException e) {
            System.out.println("Error al listar clientes: " + e.getMessage());
        }

        return clientes;
    }

    public void eliminar(int id) {
        try (Connection conn = conectar();
             PreparedStatement stmt = conn.prepareStatement("DELETE FROM cliente WHERE id_cliente = ?")) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error al eliminar cliente: " + e.getMessage());
        }
    }

    public void actualizar(Cliente cliente) {
        try (Connection conn = conectar();
             PreparedStatement stmt = conn.prepareStatement(
                 "UPDATE cliente SET name = ?, telefono = ?, id_mesa = ? WHERE id_cliente = ?")) {

            stmt.setString(1, cliente.getName());
            stmt.setInt(2, cliente.getTelefono());
            if (cliente.getIdMesa() != null) {
                stmt.setInt(3, cliente.getIdMesa());
            } else {
                stmt.setNull(3, Types.INTEGER);
            }
            stmt.setInt(4, cliente.getIdCliente());

            stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error al actualizar cliente: " + e.getMessage());
        }
    }
}

