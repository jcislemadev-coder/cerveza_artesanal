package com.krakedev.artesanal.testJUNIT;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.Maquina;

public class TestServirCervezaAI {

	// Valida que, usando el constructor que recibe capacidad máxima,
	// la máquina pueda servir cerveza cuando tiene suficiente cantidad.
	// También valida que se descuente la cantidad servida.
	@Test
	public void testServirCervezaConSuficienteCantidad() {

		Maquina maquina = new Maquina("Pilsener", "Cerveza", 0.02, 8000,"ABCSD");

		maquina.llenarMaquina();

		double valor = maquina.servirCerveza(100);

		// 7900 - 100 = 7800 ml disponibles
		assertEquals(7800, maquina.getCantidadActual(), 0.0001);

		// 100 ml * 0.02 = 2 dólares
		assertEquals(2, valor, 0.0001);
	}


	// Valida que cuando se solicita exactamente la cantidad disponible,
	// la máquina pueda servir toda la cerveza y quede en 0 ml.
	@Test
	public void testServirTodaLaCantidadDisponible() {

		Maquina maquina = new Maquina("Pilsener", "Cerveza", 0.02, 8000,"ABCSD");

		maquina.llenarMaquina();

		double valor = maquina.servirCerveza(7900);

		// Se sirvió toda la cerveza disponible.
		assertEquals(0, maquina.getCantidadActual(), 0.0001);

		// 7900 ml * 0.02 = 158 dólares
		assertEquals(158, valor, 0.0001);
	}


	// Valida que cuando no hay suficiente cerveza,
	// no se sirva nada, no se modifique la cantidad actual
	// y el valor retornado sea 0.
	@Test
	public void testServirCervezaSinSuficienteCantidad() {

		Maquina maquina = new Maquina("Pilsener", "Cerveza", 0.02, 8000,"ABCSD");

		maquina.llenarMaquina();

		double cantidadAntes = maquina.getCantidadActual();

		double valor = maquina.servirCerveza(8000);

		// No debe modificarse la cantidad disponible.
		assertEquals(cantidadAntes, maquina.getCantidadActual(), 0.0001);

		// Como no pudo servir, debe retornar 0.
		assertEquals(0, valor, 0.0001);
	}


	// Valida que cuando la máquina está vacía,
	// no pueda servir cerveza y permanezca en 0.
	@Test
	public void testServirCervezaMaquinaVacia() {

		// Aquí usamos el constructor que NO recibe capacidad máxima.
		Maquina maquina = new Maquina("Pilsener", "Cerveza", 0.02,"ABCSD");

		double valor = maquina.servirCerveza(100);

		// La máquina comienza vacía y no debe cambiar su cantidad.
		assertEquals(0, maquina.getCantidadActual(), 0.0001);

		// Al no poder servir cerveza, retorna 0.
		assertEquals(0, valor, 0.0001);
	}


	// Valida que usando el segundo constructor,
	// la máquina pueda servir correctamente después de llenarla.
	@Test
	public void testServirCervezaConSegundoConstructor() {

		Maquina maquina = new Maquina("Club", "Cerveza artesanal", 0.03,"ABCSD");

		maquina.llenarMaquina();

		double valor = maquina.servirCerveza(200);

		// El segundo constructor establece una capacidad máxima de 10000.
		// Al llenarla quedan 9900 ml.
		// Después de servir 200 quedan 9700 ml.
		assertEquals(9700, maquina.getCantidadActual(), 0.0001);

		// 200 ml * 0.03 = 6 dólares
		assertEquals(6, valor, 0.0001);
	}
}