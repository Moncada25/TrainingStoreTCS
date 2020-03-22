package com.tcs.semillero.tienda;

public class Sucursal {

	private String nombre;
	private String direccion;
	private int cantProductosDisponibles;
	private double totalVendido;
	private int cantProductosVendidos;
	private String nit;
	private String pintura;
	private String puntoReferencia;
	private Empleado empleado;
	
	public Sucursal(Empleado empleado, String nombre, String direccion, int cantProductos, double totalVendido, String nit, String pintura,
			String puntoReferencia) {
		super();
		this.empleado = empleado;
		this.cantProductosVendidos = 0;
		this.nombre = nombre;
		this.direccion = direccion;
		this.cantProductosDisponibles = cantProductos;
		this.totalVendido = totalVendido;
		this.nit = nit;
		this.pintura = pintura;
		this.puntoReferencia = puntoReferencia;
	}
	
	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	
	public int getCantProductosVendidos() {
		return cantProductosVendidos;
	}

	public void setCantProductosVendidos(int cantProductosVendidos) {
		this.cantProductosVendidos = cantProductosVendidos;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCantProductosDisponibles() {
		return cantProductosDisponibles;
	}

	public void setCantProductosDisponibles(int cantProductosDisponibles) {
		this.cantProductosDisponibles = cantProductosDisponibles;
	}

	public double getTotalVendido() {
		return totalVendido;
	}
	public void setTotalVendido(double totalVendido) {
		this.totalVendido = totalVendido;
	}
	public String getNit() {
		return nit;
	}
	public void setNit(String nit) {
		this.nit = nit;
	}
	public String getPintura() {
		return pintura;
	}
	public void setPintura(String pintura) {
		this.pintura = pintura;
	}
	public String getPuntoReferencia() {
		return puntoReferencia;
	}
	public void setPuntoReferencia(String puntoReferencia) {
		this.puntoReferencia = puntoReferencia;
	}
}