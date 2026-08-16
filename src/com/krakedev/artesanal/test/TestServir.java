package com.krakedev.artesanal.test;

import com.krakedev.artesanal.*;

public class TestServir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maquina rubia = new Maquina("Pilsener", "Cerveza fria", 0.02, 8000, "ABCSD");

		System.out.println("-----------ESTADO INICIAL--------");
		rubia.imprimir();

		System.out.println("----------LLENAR MAQUINA---------");
		rubia.llenarMaquina();
		rubia.imprimir();
		System.out.println("---------SERVIR 2000 ML---------");

		double valor = rubia.servirCerveza(2000);
		System.out.println("VALOR A PAGAR:" + valor);
		rubia.imprimir();
	
		System.out.println("--------SERVIR 6000 ML------");
		valor = rubia.servirCerveza(6000);
		System.out.println("VALOR A PAGAR: "+valor);
		rubia.imprimir();
	}
	

}
