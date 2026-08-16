package com.krakedev.artesanal;

public class Maquina {
	private String nombreCerveza;
	private String descripcion;
	private double precioPorml;
	private double capacidadMaxima;
	private double cantidadActual;
	private String codigo;

	public Maquina(String nombreCerveza, String descripcion, double precioPorml, double capacidadMaxima, String codigo) {
		this.nombreCerveza = nombreCerveza;
		this.descripcion = descripcion;
		this.precioPorml = precioPorml;
		this.capacidadMaxima = capacidadMaxima;
		this.cantidadActual = 0;
		this.codigo = codigo;
	}

	public Maquina(String nombreCerveza, String descripcion, double precioPorml, String codigo) {
		this.nombreCerveza = nombreCerveza;
		this.descripcion = descripcion;
		this.precioPorml = precioPorml;
		this.capacidadMaxima = 10000;
		this.cantidadActual = 0;
		this.codigo = codigo;
	}
	
	public String getCodigo(){
		return codigo;
	}

	public String getnombreCerveza() {
		return nombreCerveza;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public double getPrecioPorml() {
		return precioPorml;
	}

	public double getcapacidadMaxima() {
		return capacidadMaxima;
	}

	public double getCantidadActual() {
		return cantidadActual;
	}

	public void setNombreCerveza(String nombreCerveza) {
		this.nombreCerveza = nombreCerveza;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setPrecioPorml(double precioPorml) {
		this.precioPorml = precioPorml;
	}

	public void imprimir() {
		String mensaje;
		mensaje = "Nombre de cerveza: " + nombreCerveza + " Descripcion: " + descripcion + ", Precio por ml: "
				+ precioPorml + ", Capacidad Maxima: " + capacidadMaxima + ", Cantidad actual: " + cantidadActual
				+ ", Codigo del producto: " + codigo;
		System.out.println(mensaje);

	}

	public void llenarMaquina() {
		this.cantidadActual = this.capacidadMaxima - 200;

	}

	public boolean recargarCerveza(double cantidad) {

		double limitePermitido;
		limitePermitido = capacidadMaxima - 200;

		if (cantidadActual + cantidad <= limitePermitido) {

			cantidadActual = cantidadActual + cantidad;
			return true;
		} else {
			return false;
		}
	}

	public double servirCerveza (double cantidad) {		
		if(cantidadActual >= cantidad) {
			cantidadActual = cantidadActual - cantidad;
			double valor = cantidad * precioPorml;
			return valor;
		}else{
			return 0;
		}
	}

}