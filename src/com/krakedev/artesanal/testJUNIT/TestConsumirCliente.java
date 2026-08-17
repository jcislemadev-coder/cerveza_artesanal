package com.krakedev.artesanal.testJUNIT;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.*;

public class TestConsumirCliente {

	@Test
	public void probarConsumo() {
		Maquina maquinaA = new Maquina("Pilsener","Artesanal",0.02,"AAA");
		Negocio bardeMoe = new Negocio("BAR DE MOE",maquinaA);
		Cliente mario = new Cliente("Mario","17852692");
		
		bardeMoe.cargarMaquinaA();
		assertEquals(9800,maquinaA.getCantidadActual(),0);
		
		bardeMoe.consumirCervezaMaquinaA(mario, 425);
		
		assertEquals(8.5,mario.getTotalConsumido(),0.001);
		assertEquals(9375, maquinaA.getCantidadActual(),0.001);
		
		bardeMoe.consumirCervezaMaquinaA(mario, 200);
		assertEquals(9175, maquinaA.getCantidadActual(),0.001);
		assertEquals(12.50, mario.getTotalConsumido(),0.001);
	}
}
