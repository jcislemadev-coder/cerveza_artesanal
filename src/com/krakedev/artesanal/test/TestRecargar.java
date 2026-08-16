package com.krakedev.artesanal.test;
import com.krakedev.artesanal.*;

public class TestRecargar {

	public static void main(String[] args) {
		
		
		boolean resultado;
		
		Maquina rubia = new Maquina("Pilsener" , "Cerveza fria", 0.02, 8000, "ABCSD");
		
		System.out.println("-----------ESTADO INICIAL--------");
		rubia.imprimir();
		System.out.println("-----------RECARGA 1 --------------");
		
		resultado = rubia.recargarCerveza(30000);
		
		System.out.println("----------¿SE RECARGO CORRECTAMENTE?-----"+resultado);
		resultado = rubia.recargarCerveza(2000);
		System.out.println("----------¿Se recargo correctamente?-----"+resultado);
		rubia.imprimir();
		
		resultado = rubia.recargarCerveza(5000);
		System.out.println("---------¿Se recargo correctamente?-------"+resultado);
		rubia.imprimir();
		
	}

}
