package edu.Controladores;

import edu.Servicios.FicheroImplementacion;
import edu.Servicios.FicheroInterfaz;
import edu.Servicios.MenuImplementacion;
import edu.Servicios.MenuInterfaz;
import edu.Servicios.OperativaImplementacion;
import edu.Servicios.OperativaInterfaz;

/*
 * Clase inicio que contendrá el main de la aplicación.
 * 081024
 * @author - CHI
 * */
public class inicio {

	/*
	 * Main que contiene la llamada a métodos, el case del menú, etc.
	 * 081024
	 * @author - CHI
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		FicheroInterfaz fichero = new FicheroImplementacion();
		OperativaInterfaz operativa = new OperativaImplementacion();
		MenuInterfaz menu = new MenuImplementacion();
		String mensaje;
		boolean cerrarMenu = false;
		try {
		while(!cerrarMenu) {
			
			byte op = menu.menu();
			mensaje = "Se inicia el menú";
			fichero.ficheroLog(mensaje);
			switch (op) {
			case 0: {
				mensaje = "Se cierra el menú";
				fichero.ficheroLog(mensaje);
				cerrarMenu = true;
				break;
			}
			case 1: {
				System.out.println("Añadir Venta");
				mensaje = "Se añade una venta";
				fichero.ficheroLog(mensaje);
				operativa.aniadirVenta();
				break;
			}
			case 2: {
				System.out.println("Añadir Gasto");
				mensaje = "Se añade un gasto";
				fichero.ficheroLog(mensaje);
				operativa.aniadirGasto();
				break;
			}
			case 3: {
				System.out.println("Mostrar Total");
				mensaje = "Se muestra el total";
				fichero.ficheroLog(mensaje);
				operativa.mostrarTotal();
				cerrarMenu = true;
				break;
			}
			default:
				System.out.println("Opción no válida");
				mensaje = "Opción no válida";
				fichero.ficheroLog(mensaje);
				break;
			}
			
			
		}
			} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Fallo en el menú de la aplicación");
		}	
	
	}

}
