package p004.views;

import java.util.List;

import p004.controllers.IPersonalController;
import p004.controllers.PersonalController;
import p004.models.entities.Personal;
import p004.utils.TerminalUtils;

public class PersonalView {
    private IPersonalController personalController;

    public PersonalView() {
        this.personalController = new PersonalController();
    }

    public void menu() {
        int option;
        do {
            TerminalUtils.output("Menú Personal");
            TerminalUtils.output("==============");
            TerminalUtils.output("1.- Lista de personal");
            TerminalUtils.output("2.- Crear personal");
            TerminalUtils.output("3.- Editar personal");
            TerminalUtils.output("4.- Eliminar personal");
            TerminalUtils.output("0.- Volver al menú principal");
            TerminalUtils.output("Introduce una opción");
            option = TerminalUtils.inputInt();

            switch (option) {
                case 0:
                    TerminalUtils.output("Volvemos al Menú principal");
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
        List<Personal> list = personalController.list();
        for (Personal item : list) {
            TerminalUtils.output(item.toString());
        }
    }

    private void create() {
        TerminalUtils.output("Ingrese el nombre:");
        String name = TerminalUtils.inputText();
        TerminalUtils.output("Ingrese la ocupación:");
        String occupation = TerminalUtils.inputText();
        TerminalUtils.output("Ingrese el ID de la sala (o 0 para ninguno):");
        int idRoom = TerminalUtils.inputInt();
        if (idRoom == 0) idRoom = -1;
        Personal personal = new Personal(0, name, occupation, idRoom);
        personalController.create(personal);
    }

    private void update() {
        TerminalUtils.output("Ingrese el ID del personal a modificar:");
        int idPersonal = TerminalUtils.inputInt();
        TerminalUtils.output("Ingrese el nuevo nombre:");
        String name = TerminalUtils.inputText();
        TerminalUtils.output("Ingrese la nueva ocupación:");
        String occupation = TerminalUtils.inputText();
        TerminalUtils.output("Ingrese el nuevo ID de la sala (o 0 para ninguno):");
        int idRoom = TerminalUtils.inputInt();
        if (idRoom == 0) idRoom = -1;
        Personal personal = new Personal(idPersonal, name, occupation, idRoom);
        personalController.update(personal);
    }

    private void delete() {
        TerminalUtils.output("Ingrese el ID del personal a eliminar:");
        int idPersonal = TerminalUtils.inputInt();
        personalController.delete(idPersonal);
    }
}
