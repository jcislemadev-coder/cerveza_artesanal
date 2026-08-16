package com.krakedev.artesanal.testJUNIT;

import com.krakedev.artesanal.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestLlenarJUnit {

	@Test
	public void testLlenarMaquina() {

		Maquina rubia = new Maquina("Pilsener", "Cerveza", 0.02, 8000,"ABCSD");
		rubia.llenarMaquina();

		assertEquals(7800, rubia.getCantidadActual(), 0.00001);
	}
}
