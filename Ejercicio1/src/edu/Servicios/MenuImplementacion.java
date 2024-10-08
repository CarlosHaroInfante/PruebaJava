package edu.Servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz{

	Scanner sc = new Scanner(System.in);
	public byte menu() {
		
		System.out.println("Menú Principal");
		System.out.println("--------------");
		System.out.println("[0] - Cerrar Menú");
		System.out.println("[1] - Añadir Venta");
		System.out.println("[2] - Añadir Gasto");
		System.out.println("[3] - Mostrar Total");
		
		byte opcion = sc.nextByte();
		
		return opcion;
		
	}
}
