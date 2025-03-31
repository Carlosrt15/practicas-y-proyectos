package p004.views;

import p004.utils.TerminalUtils;

public class MainView {
    private RoomView roomView;
    private PersonalView personalView;

    public MainView() {
        this.roomView = new RoomView();
        this.personalView = new PersonalView();
    }

    public void menu() {
        int option;
        do {
            TerminalUtils.output("Menú Principal");
            TerminalUtils.output("==================");
            TerminalUtils.output("1.- Menú de Salas");
            TerminalUtils.output("2.- Menú de Personal");
            TerminalUtils.output("0.- Salir");
            TerminalUtils.output("--------------");
            TerminalUtils.output("Introduce una opción");
            option = TerminalUtils.inputInt();

            switch (option) {
                case 0:
                    TerminalUtils.output("Salimos del programa");
                    break;
                case 1:
                    this.roomView.menu();
                    break;
                case 2:
                    this.personalView.menu();
                    break;
                default:
                    TerminalUtils.output("Opción no válida");
            }
        } while (option != 0);
    }
}

