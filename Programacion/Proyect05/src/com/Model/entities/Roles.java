package com.Model.entities;

public class Roles {
    
    private int id;
    private String name;
    
    // Constructor con todos los atributos
    public Roles(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter y Setter para id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter y Setter para name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Método toString para representar el objeto como cadena
    @Override
    public String toString() {
        return "Roles{" +
               "id=" + id +
               ", name='" + name + '\'' +
               '}';
    }
}
