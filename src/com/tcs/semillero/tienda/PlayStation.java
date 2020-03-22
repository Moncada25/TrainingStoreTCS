package com.tcs.semillero.tienda;

public class PlayStation extends Producto {

	private int capacidad;
	
	public PlayStation(String serial, int modelo, String color, double precio, int capacidad) {
		super();
		this.nombre = "PlayStation";
		this.serial = serial;
		this.modelo = modelo;
		this.color = color;
		this.precio = precio;
		this.capacidad = capacidad;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
}