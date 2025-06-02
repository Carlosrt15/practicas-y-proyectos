package com;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ContadorTest {

    @Test
    void testContadorNormal() {
        assertEquals(74, Contador.contador(1, 74));
        assertEquals(10, Contador.contador(5, 14));
    }

    @Test
    void testContadorMismoNumero() {
        assertEquals(1, Contador.contador(10, 10));  // Solo un número
    }

    @Test
    void testContadorInverso() {
        assertEquals(0, Contador.contador(10, 5));  // Rango inválido
    }

    @Test
    void testContadorNegativos() {
        assertEquals(6, Contador.contador(-3, 2));  // -3, -2, -1, 0, 1, 2
    }
}
