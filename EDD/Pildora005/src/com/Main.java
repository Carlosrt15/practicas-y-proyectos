package com;

import java.util.Scanner;
import com.Utils.EncryptorUtils;  

public class Main {

    public static void main(String[] args) {
        // Crear el objeto EncryptorUtils que usa StrongPasswordEncryptor
        EncryptorUtils encryptorUtils = new EncryptorUtils();
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Pildora para la gestion de paquetes");
        System.out.println("-------------------------------------");
        System.out.println("Paquete de cifrado (JASYPT)");
        System.out.println("---------------------------");
        System.out.println("Introduza una contraseña");

        
        String password = sc.nextLine();

        // Encriptar la contraseña
        String passwordEncriptada = encryptorUtils.encrypt(password);
        System.out.println("La contraseña cifrada será esta: " + passwordEncriptada);
        
        //  verificar si la contraseña introducida es correcta
        System.out.println("Introduzca la contraseña para verificar:");
        String passwordToVerify = sc.nextLine();

        // Verificar la contraseña usando EncryptorUtils
        if (encryptorUtils.verify(passwordEncriptada, passwordToVerify)) {
            System.out.println("Contraseña correcta.");
        } else {
            System.out.println("Contraseña incorrecta.");
        }
    }
}

