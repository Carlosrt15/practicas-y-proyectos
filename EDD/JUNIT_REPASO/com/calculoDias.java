package com;



public class calculoDias {
    public static int contador(int b) {
        int a = 100;
        int dias = 0;

        while (b < a) {
            b++;       
            dias++;    
        }

        return dias;
    }
}
