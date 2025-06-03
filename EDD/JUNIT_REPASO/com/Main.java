package com;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static String mensajeSuma(int suma) {
        if (suma > 40) {
            return "El resultado de la suma es mas de 40 : " + suma;
        } else {
            return "El resultado de la suma es menor de 40 : " + suma;
        }
    }

    public static ArrayList<Integer> obtenerNumerosPares(int limite) {
        ArrayList<Integer> pares = new ArrayList<>();
        for (int i = 0; i <= limite; i++) {
            if (i % 2 == 0) {
                pares.add(i);
            }
        }
        return pares;
    }
    
    
    public static int divir(int c, int e) {
    	return c/e;
    	
    }
    
    
    public static int multiplicar(int a, int b, int c) {
    	  
    	  	
    	    	
    	int result = a*b*c;
    	
    	return result;
    	    	    	
    }
    
    
    public static boolean peso(int a) {
     return	a >= 100;
    }
    
    public static String mensajeDividir(int divir) {
    	return "El resultado de la division es: "+divir;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el 1 numero");
        int numero1 = sc.nextInt();

        System.out.println("Introduce el 2 numero");
        int numero2 = sc.nextInt();

        int suma = sumar(numero1, numero2);

        System.out.println(mensajeSuma(suma));
        System.out.println(obtenerNumerosPares(suma));
    }
}
