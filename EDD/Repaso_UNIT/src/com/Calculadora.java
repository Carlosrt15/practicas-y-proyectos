package com;

public class Calculadora {
	
	public int sumar(int a , int b) {
		
		return a + b;
		
		
		
	}
	
	
	public int restar(int a , int b) {
		
		return  a-b;
		
		

	}
	
	public int dividir(int a , int b, int c) {
		
		return a/b/c;
	}
	
	
	public String Comprobar(int x) {
		
		if(x %2 == 0) {
			return "Es número PAR";
		} else {
			return "Es número IMPAR";
		}
		
		
	}
	
	public int Lanzador(int z) {
	    if (z == 0) {
	        throw new IllegalArgumentException("No se permite cero como parámetro");
	    }
	    return z;
	}
	
	
}
