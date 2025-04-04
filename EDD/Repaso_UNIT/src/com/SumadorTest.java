package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumadorTest {
	
	private Sumador sumador;

	@BeforeEach
	void setUp() {
		sumador = new Sumador();
	}

	@Test
	void testNumerosPositivos() {
		assertEquals(5,sumador.sumar(3, 2), "El valor deberia ser 5");
		
	}
	
	@Test
	void testNumerosNegativos() {
		assertEquals(-2,sumador.sumar(-1, -1), "El valor deberia ser -2");
		
	}
	
	@Test
	void testNumerosPositivoNegativo() {
		assertEquals(2,sumador.sumar(-1, 3), "El valor deberia ser 2");
		
	}

	
	@Test
	void numeroTrue() {
		assertTrue(sumador.esPositivo(1),"Al ser mayor que 0 deberia dar true");
	}
	
	@Test
	void numeroFalse() {
		assertFalse(sumador.esPositivo(-1),"Al ser menor que 0 deberia dar false");
	}
}
