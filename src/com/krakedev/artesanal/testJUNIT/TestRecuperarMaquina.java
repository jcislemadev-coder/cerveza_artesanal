package com.krakedev.artesanal.testJUNIT;

	import static org.junit.jupiter.api.Assertions.assertEquals;
	import static org.junit.jupiter.api.Assertions.assertNotNull;
	import static org.junit.jupiter.api.Assertions.assertNull;
	import static org.junit.jupiter.api.Assertions.assertTrue;

	import org.junit.jupiter.api.Test;

	import com.krakedev.artesanal.Maquina;
	import com.krakedev.artesanal.NegocioMejorado;

	public class TestRecuperarMaquina {

	    @Test
	    public void probarGenerarCodigo() {

	        NegocioMejorado negocio = new NegocioMejorado();

	        String codigo = negocio.generarCodigo();

	        System.out.println("Código generado: " + codigo);

	        assertNotNull(codigo);
	        assertTrue(codigo.startsWith("M-"));
	    }


	    @Test
	    public void probarAgregarMaquina() {

	        NegocioMejorado negocio = new NegocioMejorado();

	        negocio.agregarMaquina("Porter", "Azucarada", 10.50);

	        assertEquals(1, negocio.getMaquinas().size());
	    }


	    @Test
	    public void probarCargarMaquinas() {

	        NegocioMejorado negocio = new NegocioMejorado();

	        negocio.agregarMaquina("Porter", "Azucarada", 10.50);
	        negocio.agregarMaquina("Pilsener", "Clásica", 12.50);

	        negocio.cargarMaquinas();

	        assertEquals(2, negocio.getMaquinas().size());
	    }


	    @Test
	    public void probarRecuperarMaquinaExistente() {

	        NegocioMejorado negocio = new NegocioMejorado();

	        negocio.agregarMaquina("Porter", "Azucarada", 10.50);

	        Maquina maquina = negocio.getMaquinas().get(0);

	        String codigo = maquina.getCodigo();

	        Maquina resultado = negocio.recuperarMaquina(codigo);

	        assertEquals(maquina, resultado);
	    }


	    @Test
	    public void probarRecuperarMaquinaNoExistente() {

	        NegocioMejorado negocio = new NegocioMejorado();

	        negocio.agregarMaquina("Porter", "Azucarada", 10.50);

	        Maquina resultado = negocio.recuperarMaquina("M-999");

	        assertNull(resultado);
	    }
	    
	    @Test
	    public void probarAgregarMaquinas() {

	        NegocioMejorado negocio = new NegocioMejorado();

	        boolean resultado = negocio.agregarMaquina(
	            "Porter",
	            "Azucarada",
	            10.50
	        );

	        assertTrue(resultado);
	    }
	}
