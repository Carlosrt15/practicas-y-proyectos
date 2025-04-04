package com;

public class ValidadorContraseña {
    
    public boolean validar(String contraseña) {
        if (contraseña == null) {
            throw new IllegalArgumentException("La contraseña no puede ser nula");
        }
        
        if (contraseña.length() < 8) {
            return false;
        }
        
        return contraseña.matches(".*[A-Z].*") && 
               contraseña.matches(".*[a-z].*") && 
               contraseña.matches(".*\\d.*");
    }
}