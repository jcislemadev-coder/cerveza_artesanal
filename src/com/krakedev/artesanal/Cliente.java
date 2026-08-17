package com.krakedev.artesanal;

public class Cliente {
	private String nombre;
	private String cedula;
	private int codigo;
	private double totalConsumido;
	
	public Cliente(String nombre, String cedula) {
		this.nombre = nombre;
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	
	public String getCedula() {
		return cedula;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public double getTotalConsumido() {
		return totalConsumido;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setCedula (String cedula) {
		this.cedula = cedula;
	}
	
	public void setCodigo (int codigo) {
		this.codigo = codigo;
	}
	
	public void setTotalConsumido (double totalConsumido) {
		this.totalConsumido = totalConsumido;
	}
}
