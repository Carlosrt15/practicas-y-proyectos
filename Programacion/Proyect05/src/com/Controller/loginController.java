package com.Controller;

import java.sql.SQLException;

import com.Model.ILoginModel;
import com.Model.loginModelDatabase;

public class loginController implements ILoginController {
    
    private ILoginModel model;
    
    public loginController() {
        try {
            this.model = new loginModelDatabase(); // Crear el modelo de la base de datos
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para verificar el login
    public boolean checkLogin(String name, String password) {
        return model.checkLogin(name, password); // Verifica en la base de datos
    }

    // Método para listar usuarios
    public void listarUsuarios() {
        model.listarUsuarios();
    }

    // Cerrar conexión al finalizar
    public void cerrarConexion() {
        try {
            ((loginModelDatabase) model).close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
