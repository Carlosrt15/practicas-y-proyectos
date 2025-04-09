package com.view;

import com.Utils.TerminalUtils;
import com.View.loginView;
import com.View.registerView;

public class MainView {
	private ClienteView clienteView ;
    private MesaView mesaView;
    private MenuView menuView;
    
    public MainView() {
        this.clienteView = new ClienteView();
        this.mesaView = new MesaView();
        this.menuView = new MenuView();
    }
    
    
    public void mostrar() {
        int option;
        
        do {
            TerminalUtils.output("Menú Principal Restaurante");
            TerminalUtils.output("==================");
            TerminalUtils.output("1. Mostrar Menu Clientes");
            TerminalUtils.output("2. Mostrar las Mesas");
            TerminalUtils.output("3.Mostrar la carta");
            TerminalUtils.output("0.Salir del Programa");
            TerminalUtils.output("--------------");
            TerminalUtils.output("Introduce una opción");
            option = TerminalUtils.inputInt();
            
            switch (option) {
                case 0:
                    TerminalUtils.output("Salimos del programa");
                    break;
                case 1:
                    this.clienteView.mostrar(); 
                    break;
                case 2:
                    //this.mesaView.mostrar(); 
                    break;
                case 3:
                	//this.menuView.mostrar(); 
                break;
                default:
                    TerminalUtils.output("Opción no válida");
            }
        } while (option != 0);
    }
}


