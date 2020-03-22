package com.tcs.semillero.tienda;

public class Empleado {

	private int edad;
	private int experiencia;
	private String nombre;
	private String colorUniforme;
	
	public Empleado(int edad, int experiencia, String nombre, String colorUniforme) {
		super();
		this.edad = edad;
		this.experiencia = experiencia;
		this.nombre = nombre;
		this.colorUniforme = colorUniforme;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColorUniforme() {
		return colorUniforme;
	}
	public void setColorUniforme(String colorUniforme) {
		this.colorUniforme = colorUniforme;
	}
}