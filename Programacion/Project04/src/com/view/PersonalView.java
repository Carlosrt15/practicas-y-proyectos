package com.view;

import com.model.modelDatabase;
import utils.TerminalUtils;

import java.util.List;

public class PersonalView {

    private modelDatabase database;

    public PersonalView(modelDatabase database) {
        this.database = database;
    }

    public void menu() {
        TerminalUtils.output("Menú de Personal");
        TerminalUtils.output("0. Volver al menú principal");
        TerminalUtils.output("1. Listar Personal");
        TerminalUtils.output("2. Dar de alta Personal");
        TerminalUtils.output("3. Eliminar Personal");

        int option;
        do {
            option = TerminalUtils.inputInt();
            switch (option) {
                case 0:
                    TerminalUtils.output("Volviendo al menú Principal...");
                    break;
                case 1:
                    this.listPersonal();
                    break;
                case 2:
                    this.addPersonal();
                    break;
                case 3:
                    this.deletePersonal();
                    break;
                default:
                    TerminalUtils.output("La opción no es válida");
                    break;
            }
        } while (option != 0);
    }

    private void listPersonal() {
        List<String> personalList = database.getAllPersonal();
        if (personalList.isEmpty()) {
            TerminalUtils.output("No hay personal registrado.");
        } else {
            personalList.forEach(TerminalUtils::output);
        }
    }

    private void addPersonal() {
        TerminalUtils.output("Ingrese el nombre del personal: ");
        String name = TerminalUtils.inputText();
        TerminalUtils.output("Ingrese la ocupación: ");
        String occupation = TerminalUtils.inputText();
        TerminalUtils.output("Ingrese el id de la sala: ");
        int idRoom = TerminalUtils.inputInt();

        database.addPersonal(name, occupation, idRoom);
    }

    private void deletePersonal() {
        TerminalUtils.output("Ingrese el ID del personal a eliminar: ");
        int id = TerminalUtils.inputInt();
        database.deletePersonal(id);
    }
}
