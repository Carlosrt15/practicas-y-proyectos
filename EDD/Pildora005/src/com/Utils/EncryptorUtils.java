package com.Utils;

import org.jasypt.util.password.StrongPasswordEncryptor;

public class EncryptorUtils {
    
    private StrongPasswordEncryptor encryptor;
    
   
    public EncryptorUtils() {
        this.encryptor = new StrongPasswordEncryptor();
    }
    
    // Método para encriptar la contraseña
    public String encrypt(String password) {
        return encryptor.encryptPassword(password);
    }

    // Método para verificar si la contraseña en texto claro coincide con la encriptada
    public boolean verify(String encryptedPassword, String passwordToVerify) {
        return encryptor.checkPassword(passwordToVerify, encryptedPassword);
    }
}
