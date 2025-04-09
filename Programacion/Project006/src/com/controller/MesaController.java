package com.controller;

import com.model.MesaModelDB;
import com.model.entities.Mesa;

import java.util.List;

public class MesaController {
    private MesaModelDB mesaModel;

    public MesaController() {
        this.mesaModel = new MesaModelDB();
    }

    public void crearMesa(int numPersonas, Integer idMenu) {
        Mesa nueva = new Mesa(numPersonas, idMenu);
        mesaModel.insertar(nueva);
    }

    public List<Mesa> obtenerMesa() {
        return mesaModel.listar();
    }

    public void eliminarMesa(int id) {
        mesaModel.eliminar(id);
    }

    public void actualizarMesa(int id, int numPersonas, Integer idMenu) {
        Mesa mesa = new Mesa(id, numPersonas, idMenu);
        mesaModel.actualizar(mesa);
    }
}
