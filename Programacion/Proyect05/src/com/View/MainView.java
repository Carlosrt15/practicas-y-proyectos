package com.View;

import com.Utils.TerminalUtils;

public class MainView {
    private loginView loginView;

    public MainView() {
        this.loginView = new loginView();
    }

    public void mostrar() {
        int option;
        
        do {
            TerminalUtils.output("Menú Principal");
            TerminalUtils.output("==================");
            TerminalUtils.output("1. Mostrar Login");
            TerminalUtils.output("0.- Salir");
            TerminalUtils.output("--------------");
            TerminalUtils.output("Introduce una opción");
            option = TerminalUtils.inputInt();
            
            switch (option) {
                case 0:
                    TerminalUtils.output("Salimos del programa");
                    break;
                case 1:
                    this.loginView.mostrar(); // Mostrar vista de login
                    break;
                default:
                    TerminalUtils.output("Opción no válida");
            }
        } while (option != 0);
    }
}
