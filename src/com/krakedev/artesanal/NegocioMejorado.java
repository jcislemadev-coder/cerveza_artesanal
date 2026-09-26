package com.krakedev.artesanal;

import java.util.ArrayList;

public class NegocioMejorado {
	ArrayList<Maquina> maquinas;
	
	public NegocioMejorado(){
		maquinas = new ArrayList<Maquina>();
	}
	
	public void setMaquinas (ArrayList<Maquina> maquinas) {
		this.maquinas = maquinas;
	}
	
	public ArrayList<Maquina> getMaquinas(){
		return maquinas;
	}
	
	public String generarCodigo() {
		int numero = (int) (Math.random()*100) + 1;
		String codigo = "M-" + numero;
		return codigo;
	}
	
	public void agregarMaquina(String nombreCerveza, String descripcion,double precioPorml) {
		String codigo= generarCodigo();
		Maquina m1 = new Maquina(
		nombreCerveza,
		descripcion,
		precioPorml,
		codigo);
		
		maquinas.add(m1); 
		
	}
	
	public void cargarMaquinas() {
		for (int i=0; i<maquinas.size(); i++) {
			Maquina maquina = maquinas.get(i);
			maquina.llenarMaquina();
		}
	}
	
}
