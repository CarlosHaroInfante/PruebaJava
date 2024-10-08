package edu.Servicios;

import java.util.Scanner;

public class OperativaImplementacion implements OperativaInterfaz{

	long dinero = 0;
	Scanner sc = new Scanner(System.in);
	public long aniadirVenta() {
		System.out.println("Nueva Venta del día");
		long venta = sc.nextLong();
		
		if(dinero == 0) {
			dinero = venta;
			System.out.println(dinero);
		}else {
			dinero += venta;
			System.out.println(dinero);
		}
		
		return dinero;
	}
	
	public long aniadirGasto() {
		System.out.println("Nuevo Gasto del día");
		long gasto = sc.nextLong();
		if(dinero == 0) {
			dinero = gasto;
			System.out.println(dinero);
		}else {
			dinero -= gasto;
			System.out.println(dinero);
		}
		return dinero;
	}
	
	public void mostrarTotal(){
		System.out.println(dinero);
		
		if(dinero == 0) {
			System.out.println("Vamos mal " + dinero);
		}
		else if (dinero < 0) {
			System.out.println("Vamos muy mal " + dinero);
		}
		else {
			System.out.println(dinero);
		}
	}
}
