package com.view;

import com.model.modelDatabase;
import utils.TerminalUtils;

import java.util.List;

public class RoomView {

    private modelDatabase database;

    public RoomView(modelDatabase database) {
        this.database = database;
    }

    public void menu() {
        TerminalUtils.output("Menú de Salas");
        TerminalUtils.output("0. Volver al menú principal");
        TerminalUtils.output("1. Listar Salas");
        TerminalUtils.output("2. Crear Sala");
        TerminalUtils.output("3. Eliminar Sala");

        int option;
        do {
            option = TerminalUtils.inputInt();
            switch (option) {
                case 0:
                    TerminalUtils.output("Volviendo al menú Principal...");
                    break;
                case 1:
                    this.listRooms();
                    break;
                case 2:
                    this.addRoom();
                    break;
                case 3:
                    this.deleteRoom();
                    break;
                default:
                    TerminalUtils.output("La opción no es válida");
                    break;
            }
        } while (option != 0);
    }

    private void listRooms() {
        List<String> roomList = database.getAllRooms();
        if (roomList.isEmpty()) {
            TerminalUtils.output("No hay salas registradas.");
        } else {
            roomList.forEach(TerminalUtils::output);
        }
    }

    private void addRoom() {
        TerminalUtils.output("Ingrese el nombre de la sala: ");
        String name = TerminalUtils.inputText();
        TerminalUtils.output("Ingrese la capacidad: ");
        int capacity = TerminalUtils.inputInt();
        TerminalUtils.output("Ingrese el tipo de sala: ");
        String type = TerminalUtils.inputText();

        database.addRoom(name, capacity, type);
    }

    private void deleteRoom() {
        TerminalUtils.output("Ingrese el ID de la sala a eliminar: ");
        int id = TerminalUtils.inputInt();
        database.deleteRoom(id);
    }
}

