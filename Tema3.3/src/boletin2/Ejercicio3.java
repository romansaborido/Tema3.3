package boletin2;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		// Creamos la variable frase para almacenar la frase que introduzca el usuario
		String frase;
		
		// Creamos un TreeMap para almacenar los caracteres de la frase que introduzca el usuario en orden alfabético
		TreeMap<Character, Integer> conteoLetras = new TreeMap<>();
		
		// Creamos la variable c para almacenar el caracter que obtengamos
		char c;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		
		// Damos la bienvenida al usuario
		System.out.println("BIENVENIDO AL CONTEO DE LETRAS!" + "\n");
		
		// Pedimos al usuario que introduzca una frase
		System.out.println("Introduzca una frase");
		frase = reader.nextLine();
		
		// Recorremos todos los caracteres de la frase
		for (int i = 0 ; i < frase.length() ; i++) {
			
			// Obtenemos el caracter
			c = frase.charAt(i);
			
			// Si el caracter que estamos leyendo es una letra
			if (Character.isLetter(c)) {
				
				// Si la clave ya existe en el mapa
				if (conteoLetras.containsKey(c)) {
					
					// Incrementamos el valor
					conteoLetras.put(c, conteoLetras.get(c) + 1);
				
				// Si la clave no existe
				} else {
					
					// Añadimos la clave con valor 1
					conteoLetras.put(c, 1);
				}
			}
		}
	
		// Imprimimos el resultado
		System.out.println("\n" + "CONTEO DE LETRAS" + "\n" + conteoLetras);
		
		// Cerramos el scanner
		reader.close();
		
	}

}
