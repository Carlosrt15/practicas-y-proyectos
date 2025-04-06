package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FestivosTest {
	
		private Festivos  festivos;
	
		
	
	
	private String[] motivos;
	
	@BeforeEach
	void setUp() {
		festivos = new Festivos();
	}

	@Test 
		void comprobarIncluirFestivo() {
		 String motivos = "" ;
		AssertTrue(festivos.incluirDiaFestivo(2, "Hola mundo"), "Estodaria falso" );
		AssertEquals(festivos.incluirDiaFestivo(60, motivos),"Daria falso");
		
	}
	
	
	@Test 
	void testContarDiasFestivoPositivo() {
	 AssertTrue(festivos.contarDiasFestivos());
	
	
}

	
	
	

}
