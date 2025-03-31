package p004.views;

import java.util.List;
import p004.controllers.IRoomController;
import p004.controllers.RoomController;
import p004.models.entities.Room;
import p004.utils.TerminalUtils;

public class RoomView {
    private IRoomController roomController;

    public RoomView() {
        this.roomController = new RoomController();
    }

    public void menu() {
        int option;
        do {
            TerminalUtils.output("Menú Salas");
            TerminalUtils.output("==================");
            TerminalUtils.output("1.- Listar Salas");
            TerminalUtils.output("2.- Crear Sala");
            TerminalUtils.output("3.- Editar Sala");
            TerminalUtils.output("4.- Eliminar Sala");
            TerminalUtils.output("0.- Volver al Menú Principal");
            TerminalUtils.output("--------------");
            TerminalUtils.output("Introduce una opción");
            option = TerminalUtils.inputInt();

            switch (option) {
                case 0:
                    TerminalUtils.output("Volvemos al Menú Principal");
                    break;
                case 1:
                    list();
                    break;
                case 2:
                    create();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    delete();
                    break;
                default:
                    TerminalUtils.output("Opción no válida");
            }
        } while (option != 0);
    }

    private void list() {
        List<Room> list = this.roomController.list();
        for (Room item : list) {
            TerminalUtils.output(item.toString());
        }
    }

    private void create() {
        TerminalUtils.output("Ingrese nombre:");
        String name = TerminalUtils.inputText();
        TerminalUtils.output("Ingrese capacidad:");
        int capacity = TerminalUtils.inputInt();
        TerminalUtils.output("Ingrese tipo:");
        String type = TerminalUtils.inputText();

        Room room = new Room(0, name, capacity, type);
        roomController.create(room);
        TerminalUtils.output("Sala creada con éxito.");
    }

    private void update() {
        TerminalUtils.output("Ingrese ID de la sala a modificar:");
        int id = TerminalUtils.inputInt();
        TerminalUtils.output("Ingrese nuevo nombre:");
        String name = TerminalUtils.inputText();
        TerminalUtils.output("Ingrese nueva capacidad:");
        int capacity = TerminalUtils.inputInt();
        TerminalUtils.output("Ingrese nuevo tipo:");
        String type = TerminalUtils.inputText();

        Room room = new Room(id, name, capacity, type);
        roomController.update(room);
        TerminalUtils.output("Sala actualizada con éxito.");
    }

    private void delete() {
        TerminalUtils.output("Ingrese ID de la sala a eliminar:");
        int id = TerminalUtils.inputInt();
        roomController.delete(id);
        TerminalUtils.output("Sala eliminada con éxito.");
    }
}

