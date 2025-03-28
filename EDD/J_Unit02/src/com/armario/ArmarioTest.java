package com.armario;

import static org.junit.jupiter.api.Assertions.*;

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

}
