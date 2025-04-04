package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	
	private Calculadora calculadora;
	
	
	@BeforeEach
	void setUp() {
	calculadora = new Calculadora();
		
	}
	
	

	@Test
	void testSumarPositivoAmbos() {
		 assertEquals(8, calculadora.sumar(5, 3), "La suma de 5 y 3 debe ser 8");
		 assertEquals(5, calculadora.sumar(3, 2), "La suma de 3 y 2 debe ser 5");
		
		
	}
	
	@Test
	void testSumarPositivo1Negativo1() {
		 assertEquals(3, calculadora.sumar(-6, 9), "La suma de 5 y 3 debe ser 8");
				
		
	}
	
	@Test
	void testSumarPositivo2Negativo2() {
		 assertEquals(3, calculadora.sumar(9, -6), "La suma de 5 y 3 debe ser 8");
				
		
	}
	
	@Test
	void testSumarAmbosNegativo() {
		 assertEquals(-7, calculadora.sumar(-6, -1), "La suma de 5 y 3 debe ser 8");
		 
				
	}
	
	
	@Test 
	void testRestarPositivoAmbos() {
		
		assertEquals(2, calculadora.restar(4, 2), "La resta daria 2 ");
	}
	
	@Test 
	void testDividirPositivoTodos() {
		
		assertEquals(5, calculadora.dividir(5, 1,1), "La Division deberia de dar 5 ");
	}
	
	
	 @Test
	 void testComprobarIf() {
		 assertEquals("Es impar" , calculadora.Comprobar(5), "El valor del if es 5");
		 
		 
		 assertEquals("Es par" , calculadora.Comprobar(4), "El valor del if es 4");
		 
		 
	 }
	 
	 @Test 
	 void testComprobarIfPositivo(){
		 assertTrue(calculadora.Comprobar(5).isEmpty(), "El resultado no esta vacio");
		 
		 
	 }
	 
	 @Test
	 void testComprobarException() {
		 assertThrows(IllegalAccessException.class, () -> calculadora.Lanzador(0));
		 
		 
		 
	 }
	

}
