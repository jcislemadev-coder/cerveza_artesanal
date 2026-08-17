package com.krakedev.artesanal.testJUNIT;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.*;


public class TestAsignarCodigoCliente {
	@Test
	public void AsignarCodigoCliente() {
		Negocio bardeMoe = new Negocio ();
		
		Cliente mario = new Cliente("Mario","172053134");
		Cliente andres = new Cliente("Andres","098745666");
		
		bardeMoe.asignarCodigoCliente(mario);
		bardeMoe.asignarCodigoCliente(andres);
		
		assertEquals(100,mario.getCodigo(),0);
		assertEquals(101,andres.getCodigo(),0);
	}

}
