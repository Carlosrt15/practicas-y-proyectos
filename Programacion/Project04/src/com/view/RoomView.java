package com.view;

import utils.TerminalUtils;

public class RoomView {

    public RoomView() {
        
    }

    public void menu() {
        TerminalUtils.output("Menú de Salas");
        TerminalUtils.output("----------------------");

        TerminalUtils.output("0. Volver al menú principal");
        TerminalUtils.output("1. Listar Salas");
        TerminalUtils.output("2. Crear Sala");
        TerminalUtils.output("3. Editar Sala");
        TerminalUtils.output("4. Eliminar Sala");

        int option;

        do {
            option = TerminalUtils.inputInt();

            switch (option) {
                case 0:
                    TerminalUtils.output("Volviendo al menú Principal...");
                    break;

                case 1:
                    TerminalUtils.output("Lista de Salas");
                    break;

                case 2:
                    TerminalUtils.output("Crear Sala");
                    break;

                case 3:
                    TerminalUtils.output("Editar Sala");
                    break;

                case 4:
                    TerminalUtils.output("Eliminar Sala");
                    break;

                default:
                    TerminalUtils.output("La opción no es válida");
            }

        } while (option != 0);
    }
}
