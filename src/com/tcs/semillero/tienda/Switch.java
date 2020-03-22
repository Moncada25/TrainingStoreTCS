package com.tcs.semillero.tienda;

public class Switch extends Producto {

	private boolean esUsado;
	
	public Switch(String serial, int modelo, String color, double precio, boolean esUsado) {
		super();
		this.nombre = "Switch";
		this.serial = serial;
		this.modelo = modelo;
		this.color = color;
		this.precio = precio;
		this.esUsado = esUsado;
	}

	public boolean isEsUsado() {
		return esUsado;
	}

	public void setEsUsado(boolean esUsado) {
		this.esUsado = esUsado;
	}	
}