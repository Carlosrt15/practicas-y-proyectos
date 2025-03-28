package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SuscripcionTest {
	
	static Suscripcion suscripcion;
	
	@BeforeEach
	 void inicializar() {
		suscripcion = new Suscripcion(0,0);
	}

	@Test
	void testSuscripcion() {
		Suscripcion suscripcionPrueba = new Suscripcion(5,8);
		assertEquals(5, suscripcionPrueba.getPrecio());
	}
	
	@Test
	void testCancel() {
		Suscripcion suscripcionCancel = new Suscripcion(100,4); // Crear suscripción con valores válidos
		suscripcionCancel.cancel(); // Llamar al método 
		assertEquals(0, suscripcionCancel.getPeriodo());  // Verificar que el período ahora es 0
	}
	
	@Test
	void testPrecioPorMesNegativo() {
		suscripcion.setPeriodo(-1);
		double resultado = suscripcion.precioPorMes();
		assertEquals(0, resultado);
	}
	
	
	@Test
	void testPrecioPorMesPositivo() {
		suscripcion.setPeriodo(5);
		double resultado = suscripcion.precioPorMes();
		assertEquals(0, resultado);
	}
	
	@Test
	void testPrecioPorMesPositivo1() {
		suscripcion.setPeriodo(5);
		suscripcion.setPrecio(50);
		double resultado = suscripcion.precioPorMes();
		assertEquals(0.0, resultado);
	}
	
	@Test
	void testPrecioPorMesNegativo1() {
		suscripcion.setPeriodo(5);
		suscripcion.setPrecio(-20);
		double resultado = suscripcion.precioPorMes();
		assertEquals(0.0, resultado);
	}
	
	@Test
	void testPrecioNegativoPeriodoPositivo() {
	    Suscripcion suscripcionPrueba = new Suscripcion(-50, 5);
	    assertEquals(0, suscripcionPrueba.precioPorMes());
	}
	
	@Test
	void testPrecioPorMesDespuesDeCancelar() {
	    Suscripcion suscripcionPrueba = new Suscripcion(100, 5);
	    suscripcionPrueba.cancel();
	    assertEquals(0, suscripcionPrueba.precioPorMes(), "Después de cancelar, el precio mensual debe ser 0.");
	}

	

	
	


}
