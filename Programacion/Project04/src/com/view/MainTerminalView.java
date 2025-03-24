package com.view;

import utils.TerminalUtils;
import com.controller.MainController; // Asegurar que esta importación exista

public class MainTerminalView {
    
    private MainController mainController;

    public MainTerminalView() {
        this.mainController = new MainController();
    }

    public void show() {
        TerminalUtils.output("Bienvenido al GYM !!!");
        TerminalUtils.output("----------------------");

        TerminalUtils.output("1. Menú de Salas");
        TerminalUtils.output("2. Menú del Personal");
        TerminalUtils.output("0. Salir del Programa");

        int option;

        do {
            option = TerminalUtils.inputInt();

            switch (option) {
                case 0:
                    TerminalUtils.output("Saliendo...");
                    break;

                case 1:
                    this.roomView.menu();
                    break;

                case 2:
                	this.personalView.menu();
                    break;

                default:
                    TerminalUtils.output("La opción no es válida");
            }

        } while (option != 0);
    }
}
