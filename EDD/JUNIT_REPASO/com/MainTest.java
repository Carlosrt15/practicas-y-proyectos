package com;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MainTest {

    @BeforeEach
    void setUp() throws Exception {
    }

    @Test
    void testsumar() {
        assertEquals(10, Main.sumar(4, 6));
        assertEquals(100, Main.sumar(60, 40));
    }
    
    @Test
    void testsumarNegativo() {
        assertEquals(-10, Main.sumar(-4, -6));
        assertEquals(-100, Main.sumar(-60, -40));
    }


    @Test
    void testMensajeSuma() {
        assertEquals("El resultado de la suma es mas de 40 : 50", Main.mensajeSuma(50));
        assertEquals("El resultado de la suma es menor de 40 : 20", Main.mensajeSuma(20));
    }
    
    @Test
    void testMensajeSumaNegativo() {
        assertEquals("El resultado de la suma es mas de 40 : 50", Main.mensajeSuma(50));
        assertEquals("El resultado de la suma es menor de 40 : 20", Main.mensajeSuma(20));
    }

    @Test
    void testObtenerNumerosPares() {
        ArrayList<Integer> esperado = new ArrayList<>(Arrays.asList(0, 2, 4, 6));
        assertEquals(esperado, Main.obtenerNumerosPares(6));
    }
    
    @Test
    void testDividir() {
    	assertEquals(2, Main.divir(4, 2));
    }
    
    @Test
    void testMensajeDividir() {
        assertEquals("El resultado de la division es: ", Main.mensajeDividir(2));
        
    }
    
    @Test
    void testPositivoMultiplicar() {
    	assertEquals(10, Main.multiplicar(1, 2, 5));
    	assertEquals(5, Main.multiplicar(1, 1, 5));
    	
    	
    	
    }
    
    @Test
    void testNegativoMultiplicar() {
    	assertEquals(-10, Main.multiplicar(-1, -2, -5));
    	assertEquals(-1, Main.multiplicar(-1, -1, -1));
    	
    	    	
    }
    
    @Test
    void testTruePeso() {
    	assertTrue( Main.peso(100));
    	assertTrue(Main.peso(101));
    	    	
    	    	
    }
    
    @Test
    void testFalsePeso() {
    	assertFalse( Main.peso(99));
    	assertFalse(Main.peso(50));
    	    	
    	    	
    }
    
}
