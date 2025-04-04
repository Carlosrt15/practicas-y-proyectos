package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ValidadorContraseñaTest {
	
	private ValidadorContraseña  validadorContraseña;

	@BeforeEach
	void setUp()  {
		validadorContraseña = new ValidadorContraseña();
	}

	@Test
	void testException() {
		assertThrows(IllegalArgumentException.class, () -> validadorContraseña.validar(null),"Deberia lanzar IllegalArgumentException");
		
	}
	
	@Test
	void testContraseñaMayorDe8Caracteres() {
		String contraseñaValida = "Password1";
		
		boolean resultado = validadorContraseña.validar(contraseñaValida);
		
		assertTrue(resultado, "Una contraseña con >8 carateres , mayuscula, minuscula");
	}
	
	
	@Test
	void testContraseñaMenorDe8Caracteres() {
		String contraseñaInvalida = "123";
		
		boolean resultado2 = validadorContraseña.validar(contraseñaInvalida);
		
		assertFalse(resultado2, "Una contraseña con >8 carateres , mayuscula, minuscula");
	}

}
