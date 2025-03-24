package com.view;

import utils.TerminalUtils;

public class PersonalView {
	
	public PersonalView() {
		
	}
	
	public void menu() {
        TerminalUtils.output("Menú de Personal");
        TerminalUtils.output("----------------------");

        TerminalUtils.output("0. Volver al menú principal");
        TerminalUtils.output("1. Listar Personal");
        TerminalUtils.output("2. Dar de alta Personal");
        TerminalUtils.output("3. Editar Personal");
        TerminalUtils.output("4. Eliminar Personal");

        int option;

        do {
            option = TerminalUtils.inputInt();

            switch (option) {
                case 0:
                    TerminalUtils.output("Volviendo al menú Principal...");
                    break;

                case 1:
                    TerminalUtils.output("Lista de Personal");
                    break;

                case 2:
                    TerminalUtils.output("Alta de personal");
                    break;

                case 3:
                    TerminalUtils.output("Editar Personal");
                    break;

                case 4:
                    TerminalUtils.output("Eliminar Personal");
                    break;

                default:
                    TerminalUtils.output("La opción no es válida");
            }

        } while (option != 0);
    }
}
}
