package boletin1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// Creamos la variable numero para almacenar el numero introducido por el usuario
		int numero;
		
		// Creamos una cadena indices para ir concatenando los indices de los numeros pares
		String indices = "";
		
		// Creamos una lista de numeros positivos
		ArrayList<Integer> numerosPositivos = new ArrayList<Integer>();
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		
		// Pedimos al usuario que introduzca un numero
		System.out.println("Introduzca un numero positivo. Introduzca un numero negativo para parar");
		numero = reader.nextInt();
		
		// Mientras que el usuario no introduzca un numero negativo
		while (numero >= 0) {
			
			// Añadimos a la lista el numero introducido por el usuario
			numerosPositivos.add(numero);
			
			// Pedimos al usuario que introduzca un numero
			System.out.println("Introduzca un numero positivo. Introduzca un numero negativo para parar");
			numero = reader.nextInt();
		}
		
		// Recorremos la lista y mostramos los indices de los numeros pares
		for (int i = 0 ; i < numerosPositivos.size() ; i++) {
			
			// Si el numero es par y no es 0 (no es considerado par)
			if (numerosPositivos.get(i) % 2 == 0 && numerosPositivos.get(i) != 0) {
				
				// Almacenamos el indice en una cadena 
				indices += i + " - ";
			}
		}
		
		
		// Salto de linea
		System.out.println();
		
		// Eliminamos el ultimo guion
		indices = indices.substring(0, indices.length() - 3);
		
		// Imprimimos los indices 
		System.out.println("Índices de números pares -> " + indices);
		
		// Cerramos el scanner
		reader.close();
	}

}

