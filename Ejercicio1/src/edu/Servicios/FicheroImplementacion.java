package edu.Servicios;

import java.io.FileWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FicheroImplementacion implements FicheroInterfaz{

	public void ficheroLog(String mensaje) {
		try {
			
		 
		LocalDate hoy = LocalDate.now();
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("ddMMyyyy");
		
		String FechaDeHoy = formato.format(hoy);
		
		String ficheroLog = "C:\\Users\\CHI\\eclipse-workspace\\Ejercicio1\\src\\edu\\Servicios\\" + FechaDeHoy + ".txt";
		
		FileWriter escribe = new FileWriter(ficheroLog, true);
		escribe.write(mensaje + "\n");
		escribe.close();
			
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al crear/escribir el fichero log " + e.getMessage());
		}
	}
}
