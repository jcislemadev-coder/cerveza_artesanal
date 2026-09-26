package com.krakedev.artesanal.testJUNIT;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.Cliente;
import com.krakedev.artesanal.Maquina;
import com.krakedev.artesanal.NegocioMejorado;

public class TestValidarVentasJUNIT {

    @Test
    public void probarConsumirCerveza() {

        NegocioMejorado negocio = new NegocioMejorado();

        // Registrar cliente
        negocio.registrarCliente("Jessica", "478");

        // Agregar máquina
        negocio.agregarMaquina("Pilsener", "Cerveza clásica", 0.05);

        // Recuperar cliente
        Cliente cliente = negocio.buscarClienteporCodigo(100);

        // Recuperar máquina
        Maquina maquina = negocio.getMaquinas().get(0);

        // Guardamos los valores iniciales
        double consumoInicial = cliente.getTotalConsumido();
        double cantidadInicial = maquina.getCantidadActual();

        // Consumir 500 ml
        negocio.consumirCerveza(100, maquina.getCodigo(), 500);

        // Verificar cliente actualizado
        assertEquals(consumoInicial + 500, cliente.getTotalConsumido());

        // Verificar máquina afectada
        assertEquals(cantidadInicial - 500, maquina.getCantidadActual());
    }
}