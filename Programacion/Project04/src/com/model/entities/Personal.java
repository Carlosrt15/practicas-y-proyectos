package com.model.entities;

import java.util.Objects;

public class Personal {
    private int id;
    private String name;
    private String occupation;
    private int idRoom; 

    // Constructor
    public Personal(int id, String name, String occupation, int idRoom) {
        this.id = id;
        this.name = name;
        this.occupation = occupation;
        this.idRoom = idRoom;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(int idRoom) {
        this.idRoom = idRoom;
    }

    // Método toString() 
    @Override
    public String toString() {
        return "Personal{id=" + id + ", name='" + name + "', occupation='" + occupation + "', idRoom=" + idRoom + "}";
    }

    
}
