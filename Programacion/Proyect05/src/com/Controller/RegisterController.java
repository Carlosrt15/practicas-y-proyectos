package com.Controller;

import java.sql.SQLException;

import com.Model.registerModelDatabase;
import com.Model.entities.Users;

public class RegisterController {

    private registerModelDatabase model;

    public RegisterController() {
        try {
			this.model = new registerModelDatabase();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
    }

    
    public void registrarUsuario(String name, String password) {
        
        if (name != null && !name.trim().isEmpty() && password != null && !password.trim().isEmpty()) {
            Users newUser = new Users(0, name, password);  
            boolean success = model.registerUser(newUser);  

            if (success) {
                System.out.println("¡Registr exitoso!");
            } else {
                System.out.println("Error a registrar el usuario.");
            }
        } else {
            System.out.println("Los datos proporcionados son inválidos.");
        }
    }
}
