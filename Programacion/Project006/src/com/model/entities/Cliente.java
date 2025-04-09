package com.model.entities;

public class Cliente {
    private int idCliente;
    private String name;
    private int telefono;
    private Integer idMesa; // puede ser NULL

    public Cliente() {}

    public Cliente(int idCliente, String name, int telefono, Integer idMesa) {
        this.idCliente = idCliente;
        this.name = name;
        this.telefono = telefono;
        this.idMesa = idMesa;
    }

    public Cliente(String name, int telefono, Integer idMesa) {
        this.name = name;
        this.telefono = telefono;
        this.idMesa = idMesa;
    }

    // Getters y Setters
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Integer getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(Integer idMesa) {
        this.idMesa = idMesa;
    }

    @Override
    public String toString() {
        return "ID: " + idCliente + " | Nombre: " + name + " | Teléfono: " + telefono + 
               (idMesa != null ? " | Mesa ID: " + idMesa : " | Sin mesa asignada");
    }
}
