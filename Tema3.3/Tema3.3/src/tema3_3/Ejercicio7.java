package tema3_3;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio7 {
	
	public static void main(String[] args) {
		
		// Creamos un tree map para almacenar los pares de palabras (español - ingles) ordenados alfabeticamente
		TreeMap<String, String> diccionario = new TreeMap<String, String>();
		
		// Creamos la variable opcion para almacenar la opcion seleccionada por el usuario
		int opcion;
		
		// Creamos la variable palabraEspañol para almacenar la palabra en español que introduzca el usuario
		String palabraEspañol;
		
		// Creamos la variable palabraIngles para almacenar la palabra en ingles que introduzca el usuario
		String palabraIngles;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		
        // Palabras predeterminadas del diccionario
        diccionario.put("Gato", "Cat");
        diccionario.put("Perro", "Dog");
        diccionario.put("Casa", "House");
        diccionario.put("Amigo", "Friend");
        diccionario.put("Libro", "Book");
        diccionario.put("Árbol", "Tree");
        diccionario.put("Comida", "Food");
        diccionario.put("Agua", "Water");
        diccionario.put("Sol", "Sun");
        diccionario.put("Luna", "Moon");
        diccionario.put("Cielo", "Sky");
        diccionario.put("Mar", "Sea");
        diccionario.put("Montaña", "Mountain");
        diccionario.put("Ciudad", "City");
        diccionario.put("Calle", "Street");
        diccionario.put("Trabajo", "Work");
        diccionario.put("Escuela", "School");
        diccionario.put("Música", "Music");
        diccionario.put("Película", "Movie");
        diccionario.put("Viaje", "Trip");
		
		// Mientras que el usuario no introduzca la opcion 0
		do {
			// Delimitador
			System.out.println("-------------------------");
			
			// Pintamos el menú
			System.out.println("1. Inserta palabra");
			System.out.println("2. Busca palabra");
			System.out.println("0. Salir");
			
			// Leemos la opcion seleccionada por el usuario
			opcion = reader.nextInt();
			
			// Limpiamos el buffer del scanner
			reader.nextLine();
			
			// Creamos un switch para las distintas acciones del menu
			switch (opcion) {
				
				// Si opcion = 1
				case 1 -> {
					
						// Pedimos al usuario la palabra en español
						System.out.println("Introduzca la palabra en español: ");
						palabraEspañol = reader.nextLine();
						
						// Pedimos al usuario la palabra en ingles
						System.out.println("Introduzca la palabra en ingles: ");
						palabraIngles = reader.nextLine();
						
						// Convertimos la primera letra en mayuscula y el resto en minusucla
						palabraEspañol = palabraEspañol.substring(0, 1).toUpperCase() + palabraEspañol.substring(1).toLowerCase();
						palabraIngles = palabraIngles.substring(0, 1).toUpperCase() + palabraIngles.substring(1).toLowerCase();
						
						// Añadimos el par al diccionario
						diccionario.put(palabraEspañol, palabraIngles);	
						
						// Salto de linea
						System.out.println();
						
						// Pulsa enter para volver al menu
						System.out.println("Pulsa enter para volver al menu");
						reader.nextLine();
				}
				
				// Si opcion = 2
				case 2 -> {
					
					// Pedimos al usuario la palabra en español
					System.out.println("Introduzca la palabra en español que quieres buscar: ");
					palabraEspañol = reader.nextLine();
					
					// Convertimos la primera letra en mayuscula y el resto en minusucla
					palabraEspañol = palabraEspañol.substring(0, 1).toUpperCase() + palabraEspañol.substring(1).toLowerCase();
					
					// Obtenemos su par en el diccionario
					System.out.println(diccionario.get(palabraEspañol));
					
					// Salto de linea
					System.out.println();
					
					// Pulsa enter para volver al menu
					System.out.println("Pulsa enter para volver al menu");
					reader.nextLine();
				}
			}
		} while (opcion != 0);
		
		// Mensaje de salida
		System.out.println("EL PROGRAMA HA FINALIZADO");
		
		
		// Cerramos el scanner
		reader.close();
	}
}
