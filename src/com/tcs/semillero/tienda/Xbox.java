package com.tcs.semillero.tienda;

public class Xbox extends Producto {

	private boolean incluyeJuegos;
	
	public Xbox(String serial, int modelo, String color, double precio, boolean incluyeJuegos) {
		super();
		this.nombre = "Xbox";
		this.serial = serial;
		this.modelo = modelo;
		this.color = color;
		this.precio = precio;
		this.incluyeJuegos = incluyeJuegos;
	}

	public boolean isIncluyeJuegos() {
		return incluyeJuegos;
	}

	public void setIncluyeJuegos(boolean incluyeJuegos) {
		this.incluyeJuegos = incluyeJuegos;
	}
}