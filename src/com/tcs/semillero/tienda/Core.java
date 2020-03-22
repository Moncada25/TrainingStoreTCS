package com.tcs.semillero.tienda;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Core {
	
	protected static ArrayList<Producto> productosVendidos = new ArrayList<Producto>();
	protected static ArrayList<Sucursal> sedeVenta = new ArrayList<Sucursal>(); 

	public static void agregarInventario(Sucursal sucursal) {
		
		int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>"+getStyle()+"<h3>¿Cuántos productos desea agregar al inventario?</h3></html>", "Sucursal "+sucursal.getNombre(),
				JOptionPane.PLAIN_MESSAGE));
		
		if(cantidad > 0) {
			
			sucursal.setCantProductosDisponibles(sucursal.getCantProductosDisponibles() + cantidad);
			
			JOptionPane.showMessageDialog(null, "<html>"+getStyle()+"<h3>Se han agregado correctamente "+cantidad+" productos a la sucursal de "+sucursal.getNombre()+"</h3></html>", "¡Éxito!",
					JOptionPane.PLAIN_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(null, "<html>"+getStyle()+"<h2>No es posible agregar esa cantidad</h2></html>", "¡Error!",
					JOptionPane.PLAIN_MESSAGE);
		}
	}
	
	protected static boolean registrarVenta(Producto producto, Sucursal sucursal) {
		
		if(sucursal.getCantProductosDisponibles() > 0) {
			
			sucursal.setCantProductosDisponibles(sucursal.getCantProductosDisponibles() - 1);
			sucursal.setCantProductosVendidos(sucursal.getCantProductosVendidos() + 1);
			sucursal.setTotalVendido(sucursal.getTotalVendido() + producto.getPrecio());
			
			productosVendidos.add(producto);		
			sedeVenta.add(sucursal);
			
			return true;
		}
		
		return false;
	}
	
	protected static void generarFacturacion(Sucursal sucursal) {
		
		JOptionPane.showMessageDialog(null, ""
				+ "<html>" + getStyle()
						+ "<h2>"+sucursal.getNombre()+"</h2>"
						+ "<h3>"
						+ "	Vendedor a cargo → "+sucursal.getEmpleado().getNombre() + ", "+sucursal.getEmpleado().getEdad()+" años.<br>"
						+ "	Productos disponibles → " + sucursal.getCantProductosDisponibles() + "<br>"
						+ "	Productos vendidos → "+sucursal.getCantProductosVendidos() + "<br>"
						+ "	Total recaudado → $"+sucursal.getTotalVendido()
						+ "</h3>"
				+ "</html>", "Facturación", JOptionPane.PLAIN_MESSAGE);
	}
	
	protected static void generarFacturacionGlobal() {
		
		String lista = "";
		double totalVentas = 0.0;
		int cantidadProductos = 0;
		
		if(productosVendidos.size() > 0) {
			
			lista = ""
					+ "---------------------------------------------------<br>"
					+ "Producto → Sucursal → Precio <br>"
					+ "---------------------------------------------------<br>";
			
			for (int i = 0; i < productosVendidos.size(); i++) {
				lista += productosVendidos.get(i).getNombre()+" → "+sedeVenta.get(i).getNombre() + " → $"+productosVendidos.get(i).getPrecio()+"<br>";
				totalVentas += productosVendidos.get(i).getPrecio();
				cantidadProductos++;
			}
			
			lista +=  "---------------------------------------------------<br>";
		}
		
		JOptionPane.showMessageDialog(null, ""
				+ "<html>" + getStyle()
						+ "<h2>Registro de todas las sedes</h2>"
						+ "<h3>"
						+ lista
						+ "Productos vendidos → " + cantidadProductos + "<br>"
						+ "Total recaudado → $"+ totalVentas
						+ "</h3>"
				+ "</html>", "Facturación", JOptionPane.PLAIN_MESSAGE);
	}
	
	protected static void ventaRealizada(Producto producto, Sucursal sucursal) {
		
		JOptionPane.showMessageDialog(null,
				"<html> "+getStyle()+"<h3>Se ha vendido correctamente un "+producto.getNombre()+" desde la sucursal de "+sucursal.getNombre()+"</h3></html>",
				"Venta Realizada", JOptionPane.PLAIN_MESSAGE);
	}
	
	protected static void ventaNoRealizada(Producto producto, Sucursal sucursal) {
		
		JOptionPane.showMessageDialog(null,
				"<html> "+getStyle()+"<h3>No hay stock disponible de "+producto.getNombre()+" en la sucursal de "+sucursal.getNombre()+".</h3></html>",
				"¡Error!", JOptionPane.PLAIN_MESSAGE);
	}
	
	protected static String getStyle() {
		return ""
				+ "<style type='text/css'>"
				+ "	h1{"
				+ "		color: rgb(220, 70, 50);"
				+ "		font-size: 17px;"
				+ "		font-family: Times New Roman;"
				+ "		font-style: italic;"
				+ "		border: 3px inset red;"
				+ "		border-top: none;"
				+ "		text-align: center;"
				+ "	}"
				+ ""
				+ "	h2{"
				+ "		color: rgb(220, 70, 50);"
				+ "		font-size: 15px;"
				+ "		font-family: Times New Roman;"
				+ "		font-style: italic;"
				+ "		text-align: center;"
				+ "	}"
				+ ""
				+ "	h3{"
				+ "		color: rgb(21, 87, 163);"
				+ "		font-size: 14px;"
				+ "		font-family: Times New Roman;"
				+ "		font-style: italic;"
				+ "	}"
				+ "</style>";
	}
}