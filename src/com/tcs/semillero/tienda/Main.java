package com.tcs.semillero.tienda;

import javax.swing.JOptionPane;

public class Main extends Core {
	
	public static void main(String[] args) {
		
		Empleado david = new Empleado(25, 2, "David", "Azul");
		Empleado camilo = new Empleado(30, 1, "Camilo", "Rojo");
		
		Sucursal barra = new Sucursal(david, "Barranquilla", "Calle 10", 5, 0, "203913301", "Rojo", "Al frente del Éxito");
		Sucursal mede = new Sucursal(camilo, "Medellín", "Carrera 30", 5, 0, "204403301", "Azul", "Diagonal al Cai");

		Xbox xbox = new Xbox("75982", 2009, "Rojo", 500, false);
		PlayStation play = new PlayStation("33155", 2015, "Negro", 1000, 500);
		Switch nSwitch = new Switch("10932", 2018, "Azul", 2000, true);

		int opcion, opcionSuc, opcionPro;

		String menu = ""
				+ "<html>" + getStyle()
				+ "	<h1>Bienvenido a la tienda de Jaime</h1>" 
				+ "	<h2>¿Qué quieres hacer?</h2>" 
				+ "	<h3>"
				+ "		1. Vender un producto <br>"
				+ "		2. Facturación de la sede de Barranquilla <br>"
				+ "		3. Facturación de la sede de Medellín <br>"
				+ "		4. Facturación global <br>"
				+ "		5. Agregar inventario <br>"
				+ "		6. Salir"
				+ "	</h3>"
				+ "</html>";
		
		String menuSuc = ""
				+ "<html>" + getStyle()
				+ "	<h2>Seleccione una sucursal</h2>" 
				+ "	<h3>"
				+ "		1. Barranquilla <br>"
				+ "		2. Medellín <br>"
				+ "		3. Volver"
				+ "	</h3>"
				+ "</html>";
		
		String menuPro = ""
				+ "<html>" + getStyle()
				+ "	<h2>Seleccione un producto</h2>" 
				+ "	<h3>"
				+ "		1. PlayStation <br>"
				+ "		2. Xbox <br>"
				+ "		3. Switch <br>"
				+ "		4. Volver"
				+ "	</h3>"
				+ "</html>";
		
		do {
			
			try {
				
				opcion = Integer
						.parseInt(JOptionPane.showInputDialog(null, menu, "Menú Principal", JOptionPane.PLAIN_MESSAGE));
				
				switch (opcion) {
				
				case 1:

					do {

						opcionSuc = Integer
								.parseInt(JOptionPane.showInputDialog(null, menuSuc, "Vender Producto", JOptionPane.PLAIN_MESSAGE));

						switch (opcionSuc) {

						case 1:

							do {

								opcionPro = Integer.parseInt(JOptionPane.showInputDialog(null, menuPro,
										"Sucursal "+barra.getNombre(), JOptionPane.PLAIN_MESSAGE));

								switch (opcionPro) {
								
								case 1:

									if(registrarVenta(play, barra)) {
										ventaRealizada(play, barra);
									}else {
										ventaNoRealizada(play, barra);
									}

									break;

								case 2:
									
									if(registrarVenta(xbox, barra)) {
										ventaRealizada(xbox, barra);										
									}else {
										ventaNoRealizada(xbox, barra);
									}
									
									break;

								case 3:
									
									if(registrarVenta(nSwitch, barra)) {		
										ventaRealizada(nSwitch, barra);			
									}else {
										ventaNoRealizada(nSwitch, barra);
									}

									break;

								case 4:

									opcionSuc = 2;

									break;

								default:

									JOptionPane.showMessageDialog(null, "<html>"+getStyle()+"<h2>Producto no disponible</h2></html>", "¡Verifique!",
											JOptionPane.PLAIN_MESSAGE);
									opcionPro = 2;
									break;
								}

							} while (opcionPro > 0 && opcionPro < 4);

							break;

						case 2:

							do {

								opcionPro = Integer.parseInt(JOptionPane.showInputDialog(null, menuPro,
										"Sucursal "+mede.getNombre(), JOptionPane.PLAIN_MESSAGE));

								switch (opcionPro) {

								case 1:
									
									if(registrarVenta(play, mede)) {
										ventaRealizada(play, mede);
									}else {
										ventaNoRealizada(play, mede);
									}

									break;

								case 2:
									
									if(registrarVenta(xbox, mede)) {
										ventaRealizada(xbox, mede);
									}else {
										ventaNoRealizada(xbox, mede);
									}

									break;

								case 3:

									if(registrarVenta(nSwitch, mede)) {
										ventaRealizada(nSwitch, mede);
									}else {
										ventaNoRealizada(nSwitch, mede);
									}

									break;

								case 4:

									opcionSuc = 2;

									break;

								default:

									JOptionPane.showMessageDialog(null, "<html>"+getStyle()+"<h2>Producto no disponible</h2></html>", "¡Verifique!",
											JOptionPane.PLAIN_MESSAGE);
									opcionPro = 2;
									break;
								}

							} while (opcionPro > 0 && opcionPro < 4);

							break;

						case 3:

							opcion = 2;
							break;

						default:
							JOptionPane.showMessageDialog(null, "<html>"+getStyle()+"<h2>Sucursal no disponible<h2></html>", "¡Verifique!",
									JOptionPane.PLAIN_MESSAGE);
							opcionSuc = 2;
							break;
						}

					} while (opcionSuc > 0 && opcionSuc < 3);

					break;

				case 2:
					
					generarFacturacion(barra);
					break;

				case 3:

					generarFacturacion(mede);
					break;

				case 4:

					generarFacturacionGlobal();
					break;
					
				case 5:
					
					do {

						opcionSuc = Integer
								.parseInt(JOptionPane.showInputDialog(null, menuSuc, "Agregar Inventario", JOptionPane.PLAIN_MESSAGE));

						switch (opcionSuc) {

						case 1:

							agregarInventario(barra);	
							break;

						case 2:
							
							agregarInventario(mede);	
							break;

						case 3:

							opcion = 2;
							break;

						default:
							JOptionPane.showMessageDialog(null, "<html>"+getStyle()+"<h2>Sucursal no disponible<h2></html>", "¡Verifique!",
									JOptionPane.PLAIN_MESSAGE);
							opcionSuc = 2;
							break;
						}

					} while (opcionSuc > 0 && opcionSuc < 3);					
					
					break;
					
				case 6:
					
					JOptionPane.showMessageDialog(null, "<html>"+getStyle()+"<h3>¡Gracias por su visita!</h3></html>", "Transacción Finalizada",
							JOptionPane.PLAIN_MESSAGE);
					break;

				default:
					JOptionPane.showMessageDialog(null, "<html>"+getStyle()+"<h2>Opción no disponible</h2>", "¡Verifique!", JOptionPane.PLAIN_MESSAGE);
					opcion = 2;
					break;
				}
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,
						"<html>"+getStyle()+"<h2>Ingresa un caracter numérico</h2></html>",
						"¡Verifica!", JOptionPane.PLAIN_MESSAGE);
				
				opcion = 2;
			}

		} while (opcion >	 0 && opcion < 6);
	}
}