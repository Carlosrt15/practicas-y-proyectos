package com.model.entities;

public class Rooms {
    private int idRoom;
    private String name;
    private int capacity;
    private String type;

    // Constructor
    public Rooms(int idRoom, String name, int capacity, String type) {
        this.idRoom = idRoom;
        this.name = name;
        this.capacity = capacity;
        this.type = type;
    }

    // Getters
    public int getIdRoom() {
        return idRoom;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

    // Setters
    public void setIdRoom(int idRoom) {
        this.idRoom = idRoom;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Método toString()
    @Override
    public String toString() {
        return "Rooms{" +
                "idRoom=" + idRoom +
                ", name='" + name + '\'' +
                ", capacity=" + capacity +
                ", type='" + type + '\'' +
                '}';
    }
}

