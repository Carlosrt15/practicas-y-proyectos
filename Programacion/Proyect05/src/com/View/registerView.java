package com.View;

import com.Controller.RegisterController;
import com.Utils.TerminalUtils;

public class registerView {

    private RegisterController controller;

    public registerView() {
        this.controller = new RegisterController(); 
    }

    public void mostrar() {
        TerminalUtils.output("Formulario de Registro");
        TerminalUtils.output("====================================");

        // Pedir nombre
        TerminalUtils.output("Introduce tu nombre:");
        String name = TerminalUtils.inputText();

       
        TerminalUtils.output("Introduce tu contraseña:");
        String password = TerminalUtils.inputText();

        
        controller.registrarUsuario(name, password);
    }
}
