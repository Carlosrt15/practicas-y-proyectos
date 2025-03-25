package com.view;

import com.model.modelDatabase;
import utils.TerminalUtils;

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
            }
        } while (option != 0);
    }

    private void listRooms() {
        try {
            var resultSet = database.getAllRooms();
            while (resultSet.next()) {
                TerminalUtils.output("ID: " + resultSet.getInt("idRoom") + " Nombre: " + resultSet.getString("name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
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
        TerminalUtils.output("Sala agregada correctamente.");
    }

    private void deleteRoom() {
        TerminalUtils.output("Ingrese el ID de la sala a eliminar: ");
        int id = TerminalUtils.inputInt();
        database.deleteRoom(id);
        TerminalUtils.output("Sala eliminada correctamente.");
    }
}
