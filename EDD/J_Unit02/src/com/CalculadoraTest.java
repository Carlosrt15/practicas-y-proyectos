package com;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
    
    private Calculadora calc = new Calculadora();

    @Test
    public void testSuma() {
        int resultado = calc.sumar(2, 3);
        assertEquals(5, resultado); // Nota: aquí no usamos Assert.assertEquals, sino directamente assertEquals
    }
    
    
    
    @Test
    public void testResta() {
        int resultado = calc.restar(2, 3);
        assertEquals(-1, resultado); 
    }
    
    
    @Test
    public void testmultiplicar() {
        int resultado = calc.multiplicar(2, 3);
        assertEquals(6, resultado); 
    
    }
}