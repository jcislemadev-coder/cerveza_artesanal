package com.krakedev.artesanal.testJUNIT;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.NegocioMejorado;

public class TestGenerarCodigo {
		
		@Test
		public void probarCodigo(){
		NegocioMejorado bardeMoe = new NegocioMejorado();
		
		String codigoG = bardeMoe.generarCodigo();
		System.out.println("Codigo generado: "+codigoG);
		
		assertNotNull(codigoG);
		assertTrue(codigoG.startsWith("M-"));
		
		
		}
	
	}

