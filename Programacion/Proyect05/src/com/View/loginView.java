package com.View;

import com.Controller.loginController;
import com.Utils.TerminalUtils;

public class loginView {
    
    private loginController controller;
    
    public loginView() {
        this.controller = new loginController();
    }
    
    public void mostrar() {
        String name, password;
        TerminalUtils.output(" ingresa tus credenciales.");
        TerminalUtils.output("Nombre de usuario:");
        name = TerminalUtils.inputText();
        TerminalUtils.output("Contraseña:");
        password = TerminalUtils.inputText();
        
        
        if (controller.checkLogin(name, password)) {
            TerminalUtils.output("¡Login exitoso!");
            controller.listarUsuarios(); 
            TerminalUtils.output("Credenciales incorrectas, intenta nuevamente.");
        }
        
        
        controller.cerrarConexion();
    }
}

	





	