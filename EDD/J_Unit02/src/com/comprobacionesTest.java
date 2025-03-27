package com;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class comprobacionesTest {
	
	// Declarar array si no no funciona para el objeto
	
	private Integer[] enteros = {1, 2, 3, 4, 5,}; 
	
	private Comprobaciones comprobaciones = new Comprobaciones(enteros);
	
	
	@Test
	public void testSumaEnteros() {
		assertEquals(15, comprobaciones.sumaEnteros(),"La suma de enteros deberia ser 15");
		
	}
	
	@Test
	public void testConstructorArrayNulo() {
	    assertThrows(IllegalArgumentException.class, () -> new Comprobaciones(null),"Debería lanzar una excepción si el array es null");
	            
	}
	
	@Test
	public void testMayorValor() {
		assertEquals(5,comprobaciones.mayorValor(),"El mayor valor deberia ser 5");
	}

	
}


