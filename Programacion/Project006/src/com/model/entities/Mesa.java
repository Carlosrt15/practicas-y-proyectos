package com.model.entities;

public class Mesa {
    private int idMesa;
    private int numPersonas;
    private Integer idMenu; // puede ser null

    public Mesa(int idMesa, int numPersonas, Integer idMenu) {
        this.idMesa = idMesa;
        this.numPersonas = numPersonas;
        this.idMenu = idMenu;
    }

    public Mesa(int numPersonas, Integer idMenu) {
        this.numPersonas = numPersonas;
        this.idMenu = idMenu;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public int getNumPersonas() {
        return numPersonas;
    }

    public Integer getIdMenu() {
        return idMenu;
    }

    public void setNumPersonas(int numPersonas) {
        this.numPersonas = numPersonas;
    }

    public void setIdMenu(Integer idMenu) {
        this.idMenu = idMenu;
    }

    @Override
    public String toString() {
        return "Mesa [ID: " + idMesa + ", Personas: " + numPersonas + ", ID Menú: " + (idMenu != null ? idMenu : "N/A") + "]";
    }
}
