package com.Model.entities;

public class Users {
    
    private int id;
    private String name;
    private String password;
    
    // Constructor 
    public Users(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

   
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

   
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Método toString
    @Override
    public String toString() {
        return "Users{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", password='" + password + '\'' +
               '}';
    }
}
