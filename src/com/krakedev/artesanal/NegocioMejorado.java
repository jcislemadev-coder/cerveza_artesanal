package com.krakedev.artesanal;

import java.util.ArrayList;

public class NegocioMejorado {
	ArrayList<Maquina> maquinas;

	public NegocioMejorado() {
		maquinas = new ArrayList<Maquina>();
	}

	public void setMaquinas(ArrayList<Maquina> maquinas) {
		this.maquinas = maquinas;
	}

	public ArrayList<Maquina> getMaquinas() {
		return maquinas;
	}

	public String generarCodigo() {
		int numero = (int) (Math.random() * 100) + 1;
		String codigo = "M-" + numero;
		return codigo;
	}

	public boolean agregarMaquina(String nombreCerveza, String descripcion, double precioPorml) {
		String codigo = generarCodigo();
		Maquina maquinaEncontrada = recuperarMaquina(codigo);

		if (maquinaEncontrada != null) {
			return false;
		}

		Maquina m1 = new Maquina(nombreCerveza, descripcion, precioPorml, codigo);

		maquinas.add(m1);

		return true;

	}

	public void cargarMaquinas() {
		for (int i = 0; i < maquinas.size(); i++) {
			Maquina maquina = maquinas.get(i);
			maquina.llenarMaquina();
		}
	}

	public Maquina recuperarMaquina(String codigo) {
		for (int i = 0; i < maquinas.size(); i++) {
			Maquina maquina = maquinas.get(i);

			if (maquina.getCodigo().equals(codigo)) {
				return maquina;
			}
		}
		return null;
	}

	private ArrayList<Cliente> clientes = new ArrayList<>();

	public void registrarCliente(String nombre, String cedula) {
		int codigo = 100;
		Cliente c1 = new Cliente(nombre, cedula);
		c1.setCodigo(codigo);
		codigo++;
		clientes.add(c1);
		
		System.out.println("Hay: "+clientes.size());
	}
}
