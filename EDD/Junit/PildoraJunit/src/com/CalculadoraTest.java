package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void test() {
		Calculadora calculadora = new Calculadora();
		
		int resultadoPP = calculadora.sumar(2, 3);
		assertEquals(5,resultadoPP, "La suma de 2y 3 deberia ser 5");
		
		int resultadoPZ = calculadora.sumar(2, 0);
		assertEquals(2,resultadoPZ, "La suma de 2 y 0 deberia ser 2");
		
		int resultadoPN = calculadora.sumar(2, -1);
		assertEquals(1,resultadoPN, "La suma de 2 y -1 deberia ser 1");
		
		
	}

}
