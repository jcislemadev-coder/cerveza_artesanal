package com.krakedev.artesanal.test;

import com.krakedev.artesanal.Maquina;

public class TestAtributos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Maquina rubia = new Maquina("Porter", "cerveza rubia", 5.50, 500, "ABCSD");
		
		rubia.imprimir();
		rubia.setNombreCerveza("Golden");
		rubia.imprimir();
		rubia.setDescripcion("Mayor concentracion");
		
		Maquina morena = new Maquina ("Lashi", "Cero alcohol", 0.80, "ABCSD");
		morena.imprimir();
	}
}
