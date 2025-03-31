package pruebaUnitaria.com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculoTest {

	@Test
	public void testConcatenar() {
		System.out.println("concatenar");
		String a = "Hola";
		String b = "Mundo";
		Calculo calculo = new Calculo();
		String expResult = "HolaMundo";
		
		String result = calculo.concatenar(a, b);
		 assertEquals(expResult, result);
		
	}
	
	@Test
	public void testSumar() {
		System.out.println("concatenar");
		int a = 15;
		int b = 5;
		Calculo calculo = new Calculo();
		int expResult = 20;
		
		int result = calculo.sumar(a, b);
		 assertEquals(expResult, result);
		
	}
	
	@Test
	void testRestar() {
	int a = 10;	
	int b = 5;
	int c = 3;
	Calculo calculo = new Calculo();
	int expResult = 2;
	
	int result = calculo.restar(a, b, c);
	assertEquals(expResult, result);
		
	}

}
