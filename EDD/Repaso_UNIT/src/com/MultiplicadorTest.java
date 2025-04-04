package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultiplicadorTest {
	
	private Multiplicador multiplicador;

	@BeforeEach
	void setUp()  {
		multiplicador = new Multiplicador();
	}

	@Test
	void DosNumerosPositivos() {
		assertEquals(2,multiplicador.multiplicar(2, 1),"El resultado deberia ser 2");
		
	}
	
	@Test
	void unPositivoUnNegativo() {
		assertEquals(-2,multiplicador.multiplicar(-2, 1),"El resultado deberia ser 2");
		
	}
	
	@Test
	void unPositivoUnCero() {
		assertEquals(0,multiplicador.multiplicar(0, 12),"El resultado deberia ser 0");
		
	}
	
	@Test
	void esPar() {
		assertTrue(multiplicador.esPar(2),"Deberia dar true ");
	}
	
	@Test
	void esImpar() {
		assertFalse(multiplicador.esPar(1),"Deberia dar false ");
	}

}
