package com.Controller;

import java.sql.SQLException;

import com.Model.ILoginModel;
import com.Model.loginModelDatabase;

public class loginController implements ILoginController {
    
    private ILoginModel model;
    
    public loginController() {
        try {
            this.model = new loginModelDatabase(); 
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

   
    public boolean checkLogin(String name, String password) {
        return model.checkLogin(name, password); 
    }

   
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
