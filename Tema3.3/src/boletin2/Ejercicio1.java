package boletin2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// Creamos la variable numero para almacenar el numero generado aleatoriamente
		int numero;
		
		// Creamos el arraylist de enteros para almacenar 10 numeros aleatorios del 1 al 10
		ArrayList<Integer> enteros = new ArrayList<>();
		
		// Creamos la clase random
		Random rand = new Random();
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		
		// Mientras que la longitud del array sea menor que 11
		while (enteros.size() < 10) {
			
			// Generamos el numero aleatorio
			numero = rand.nextInt(1,11);
			
			// Añadimos el numero a la lista
			enteros.add(numero);
		}
		
		// Mostramos el título del programa
		System.out.println("BIENVENIDO A DESORDENA LA LISTA!" + "\n");
		
		// Mostramos la lista ordenada
		System.out.println("Lista original -> " + enteros + "\n");
		
		// Pulsa enter para desordenar la lista
		System.out.println("Pusla enter para desordenar la lista");
		reader.nextLine();
		
		// Desordenamos la lista
		Collections.shuffle(enteros);
		
		// Mostramos la lista ya desordenada
		System.out.println("Lista desordenada -> " + enteros);
		
		// Cerramos el scanner
		reader.close();
	}

}
