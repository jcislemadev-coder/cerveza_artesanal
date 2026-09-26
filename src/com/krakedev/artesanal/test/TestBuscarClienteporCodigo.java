package com.krakedev.artesanal.test;
import com.krakedev.artesanal.NegocioMejorado;

public class TestBuscarClienteporCodigo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NegocioMejorado bardeMoe = new NegocioMejorado();

		bardeMoe.registrarCliente("Paola", "1713809");

		bardeMoe.registrarCliente("Jessica", "478");
		
		bardeMoe.buscarClienteporCodigo(100);
	}
}