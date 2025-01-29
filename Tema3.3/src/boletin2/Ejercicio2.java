package boletin2;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Creamos la variable numero para almacenar el numero generado aleatoriamente
		int numero;
		
		// Creamos un linked hash set para almacenar los numeros sin que se repitan con orden de insercion
		LinkedHashSet<Integer> numeros = new LinkedHashSet<>();
		
		// Creamos la clase random
		Random rand = new Random();
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Damos la bienvenida al programa
		System.out.println("BIENVENIDO A DEL 1 AL 20!" + "\n");
		
		// Pulsa enter para mostrar 10 numeros del 1 al 20 sin que se repitan
		System.out.println("Pulsa enter para mostrar 10 numeros del 1 al 20 sin que se repitan");
		reader.nextLine();
		
		// Mientras que el tamaño del conjunto sea menor que 10
		while (numeros.size() < 10) {
			
			// Generamos el numero aleatorio del 1 al 20
			numero = rand.nextInt(1,21);
			
			// Almacenamos el numero en el conjunto
			numeros.add(numero);
		}
		
		// Mostramos los numeros generados por pantalla 
		System.out.println(numeros);

		// Cerramos el scanner
		reader.close();
	}

}
