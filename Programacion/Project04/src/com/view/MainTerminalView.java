package com.view;

import utils.TerminalUtils;
import com.controller.MainController;

public class MainTerminalView {
    
    private MainController mainController;  // Referencia al controlador
    private PersonalView personalView;      // Vista para el personal
    private RoomView roomView;              // Vista para las salas

    // Constructor que recibe el controlador
    public MainTerminalView(MainController mainController) {
        this.mainController = mainController;
        this.personalView = new PersonalView(mainController.getDatabase());  // Pasamos la base de datos al personalView
        this.roomView = new RoomView(mainController.getDatabase());          // Pasamos la base de datos al roomView
    }

    // Método para mostrar el menú principal
    public int mainMenu() {
        TerminalUtils.output("Bienvenido al GYM !!!");
        TerminalUtils.output("----------------------");

        TerminalUtils.output("1. Menú de Salas");
        TerminalUtils.output("2. Menú del Personal");
        TerminalUtils.output("0. Salir del Programa");

        int option = TerminalUtils.inputInt();

        return option;
    }

    // Método para mostrar el menú y manejar las opciones
    public void show() {
        int option;

        do {
            option = mainMenu(); // Obtiene la opción seleccionada por el usuario
            switch (option) {
                case 0:
                    TerminalUtils.output("Saliendo...");
                    break;

                case 1:
                    roomView.menu(); // Llama al menú de Salas
                    break;

                case 2:
                    personalView.menu(); // Llama al menú de Personal
                    break;

                default:
                    TerminalUtils.output("La opción no es válida");
            }

        } while (option != 0);
    }
}
