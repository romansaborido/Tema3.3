package tema3_3;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		// Creamos un linked hash set para almacenar cadenas que no se repitan en orden de insercion
		LinkedHashSet<String> nombres = new LinkedHashSet<String>();
		
		// Creamos la variable nombre para almacenar los nombres que el usuario introduzca
		String nombre;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		
		// Pedimos al usuario que introduzca un nombre
		System.out.println("Introduzca un nombre. Introduzca 'fin' para parar");
		nombre = reader.nextLine();
		
		// Mientras que el usuario no introduzca fin
		while (!nombre.equalsIgnoreCase("fin")) {
			
			// Añadimos el nombre al conjunto
			nombres.add(nombre);
			
			// Pedimos al usuario que introduzca un nombre
			System.out.println("Introduzca un nombre. Introduzca 'fin' para parar");
			nombre = reader.nextLine();
		}
		
		
		// Salto de linea
		System.out.println();
		
		// Encabezado del conjunto 
		System.out.println("NOMBRES");
		
		// Mostramos los nombres que contiene el conjunto
		System.out.println(nombres);
		
		// Cerramos el scanner
		reader.close();
	}

}
