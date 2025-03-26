package com.controller;

import com.view.MainTerminalView;
import com.view.PersonalView;
import com.view.RoomView;
import com.model.modelDatabase;

public class MainController {

    private MainTerminalView mainView;   
    private modelDatabase database;      
    private PersonalView personalView;   
    private RoomView roomView;           

    public MainController() {
        this.database = new modelDatabase();  
        this.mainView = new MainTerminalView(this);  
        this.personalView = new PersonalView(database);  
        this.roomView = new RoomView(database);         
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
