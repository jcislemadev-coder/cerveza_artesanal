package com.krakedev.alien.testNegocio;

import com.krakedev.artesanal.*;

public class TestNegocio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Maquina nueva = new Maquina("Pilsener","Cerveza industrial",0.02, "SSSDE");
		Negocio negocio1 = new Negocio ("SiNNers", nueva);
		
		System.out.println("Nombre: "+ negocio1.getNombre());
		System.out.println("Maquina: "+ negocio1.getMaquinaA());
		
		Maquina m1= negocio1.getMaquinaA();
		
		double capacidad = m1.getcapacidadMaxima();
		
	}

}
