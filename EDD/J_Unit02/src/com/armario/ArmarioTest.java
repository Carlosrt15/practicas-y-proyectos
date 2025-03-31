package com.armario;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArmarioTest {

	private Armario armario;
	
	@BeforeEach
	void setUp() {
		armario = new Armario();
	}
	
	@Test
    void testAnadirPrenda() {
        // Añadir una prenda al armario
        assertTrue(armario.anadir("Camiseta"));
        // Comprobar que la prenda se ha añadido
        assertTrue(armario.comprobar("Camiseta"));
    }
	
	@Test
	void testComprobarFalso() { 
		assertFalse(armario.comprobar("Camiseta"));
		
		assertFalse(armario.anadir("Camiseta"));
		
	}
	
	@Test
	void testTake() {
		armario.anadir("Camiseta");
		assertTrue(armario.comprobar("Camiseta"));
		
	}
	
	@Test
	void testEliminarPrenda() throws Exception {
		armario.anadir("Camiseta");
		assertTrue(armario.comprobar("Camiseta"));
		
		armario.eliminar("Camiseta");
		assertFalse(armario.comprobar("Camiseta"));
	}
	
	 
	
	
	
	
}
