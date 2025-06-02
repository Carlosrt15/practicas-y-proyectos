package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class calculoDiasTest {

	@BeforeEach
	void setUp() {
		
	}

	@AfterEach
	void tearDwon() {
		
	}
	
	@Test
	public void testContador() {
		int resultado = calculoDias.contador(90);
		assertEquals(10,resultado);
		
		assertEquals(0,calculoDias.contador(100));
		
	}

}
