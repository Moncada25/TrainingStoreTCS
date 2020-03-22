package com.tcs.semillero.tienda;

public class Producto {

	protected String nombre;
	protected String serial;
	protected int modelo;
	protected String color;
	protected double precio;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
	public int getModelo() {
		return modelo;
	}
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}