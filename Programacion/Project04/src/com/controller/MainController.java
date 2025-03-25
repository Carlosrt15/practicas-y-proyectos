package com.controller;

import com.view.MainTerminalView;
import com.view.PersonalView;
import com.view.RoomView;
import com.model.modelDatabase;

public class MainController {

    private MainTerminalView mainView;   // Vista principal
    private modelDatabase database;      // Base de datos
    private PersonalView personalView;   // Vista del personal
    private RoomView roomView;           // Vista de las salas

    public MainController() {
        this.database = new modelDatabase();  // Instancia de base de datos
        this.mainView = new MainTerminalView(this);  // Pasamos el controlador a MainTerminalView
        this.personalView = new PersonalView(database);  // Pasamos la base de datos a PersonalView
        this.roomView = new RoomView(database);          // Pasamos la base de datos a RoomView
    }

    // Método que devuelve la base de datos
    public modelDatabase getDatabase() {
        return this.database;
    }

    // Método para iniciar la aplicación
    public void run() {
        mainView.show();
    }
}
