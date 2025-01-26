package boletin1;

import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio6 {

	public static void main(String[] args) {

		// Creamos un tree set para almacenar cadenas que no se repitan en orden alfabetico
		TreeSet<String> nombresAlfabeticamente = new TreeSet<String>();

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
			nombresAlfabeticamente.add(nombre);

			// Pedimos al usuario que introduzca un nombre
			System.out.println("Introduzca un nombre. Introduzca 'fin' para parar");
			nombre = reader.nextLine();
		}

		
		// Salto de linea
		System.out.println();

		// Encabezado del conjunto
		System.out.println("NOMBRES ORDENADOS ALFABÉTICAMENTE");

		// Mostramos los nombres que contiene el conjunto
		System.out.println(nombresAlfabeticamente);

		// Cerramos el scanner
		reader.close();
	}
	
}
