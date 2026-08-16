package com.krakedev.artesanal.testJUNIT;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.Maquina;

public class TestRecargarJUNIT {
	@Test
	
	public void testRecargaExitosa() {
			
		Maquina rubia = new Maquina("Pilsener", "Cerveza", 0.02, 8000,"ABCSD");
		
		boolean resultado = rubia.recargarCerveza(3000);

		assertTrue(resultado);
		assertEquals(3000,rubia.getCantidadActual(),0.00001);
		
	}
	
	@Test
	
	public void testRecargaFallida() {
		
		Maquina negra = new Maquina ("Club","Cerveza fria", 0.03,8000, "ABCSD");
		
		negra.recargarCerveza(1000);
		
		boolean resultado = negra.recargarCerveza(7000);
		
		assertTrue(resultado);
		assertEquals(3000, negra.getCantidadActual(),0.0001);
			
	}
	
}
