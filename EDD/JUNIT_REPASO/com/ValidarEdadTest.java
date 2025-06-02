package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ValidarEdadTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	
	
	@Test
	public void validarMayorEdad(){
		assertTrue(ValidarEdad.esMayorDeEdad(18));
		assertTrue(ValidarEdad.esMayorDeEdad(30));
		
		assertFalse(ValidarEdad.esMayorDeEdad(17)); 
		assertFalse(ValidarEdad.esMayorDeEdad(0));  
		
	}

}
