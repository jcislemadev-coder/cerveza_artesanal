package com.krakedev.artesanal.test;

import com.krakedev.artesanal.*;

public class TestLlenar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maquina rubia = new Maquina("Porter", "Cero alchool", 0.20, 500, "ABCSD");
		rubia.imprimir();
		rubia.llenarMaquina();
		rubia.imprimir();
		
		Maquina morena = new Maquina ("Golden", "Aromatizada", 0.20, "ABCSD");
		morena.imprimir();
		morena.llenarMaquina();
		morena.imprimir();
		
	}

}
  