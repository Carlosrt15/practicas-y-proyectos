package com.controller;

import com.model.ClienteModelDB;
import com.model.entities.Cliente;

import java.util.List;

public class ClienteController {
    private ClienteModelDB clienteModel;

    public ClienteController() {
        this.clienteModel = new ClienteModelDB();
    }

    public void crearCliente(String nombre, int telefono, Integer idMesa) {
        Cliente cliente = new Cliente(nombre, telefono, idMesa);
        clienteModel.insertar(cliente);
    }

    public List<Cliente> obtenerClientes() {
        return clienteModel.listar();
    }

    public void eliminarCliente(int id) {
        clienteModel.eliminar(id);
    }

    public void actualizarCliente(int id, String nombre, int telefono, Integer idMesa) {
        Cliente cliente = new Cliente(id, nombre, telefono, idMesa);
        clienteModel.actualizar(cliente);
    }
}
