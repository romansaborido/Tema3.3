package boletin2;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		// Creamos la variable opcion para almacenar la opcion que introduzca el usuario
		int opcion;
		
		// Creamos el HashMap llamado series de tipo string y string para almacenar las series y sus valoraciones
		HashMap<String, String> series = new HashMap<>();
		
		// Creamos una variable cadena para almacenar el nombre de la serie que introduzca el usuario
		String serie = "";
		
		// Creamos una variable cadena para almacenar la valoracion de la serie que introduzca el usuario
		String valoracion;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		
		// Damos la bienvenida al usuario
		System.out.println("BIENVENIDO A XIAOMI TV BOX" + "\n");
		
		// Mientras que el usuario no introduzca como opcion el 4
		do {
			
			// Pintamos el menu
			System.out.println("-------------------------");
			System.out.println("1. Agregar serie");
			System.out.println("2. Buscar serie");
			System.out.println("3. Eliminar serie");
			System.out.println("4. Salir" + "\n");
			
			// Pedimos al usuario que introduzca una opcion 
			System.out.println("Introduzca una opcion");
			opcion = reader.nextInt();
			
			// Limpiamos el buffer del scanner
			reader.nextLine();
			
			// Creamos un switch para las distintas acciones del menu
			switch (opcion) {
			
				// Si el usuario introduce 1
				case 1 -> {
					
					// Delimitador
					System.out.println("-------------------------");
					
					// Funcionamiento
					System.out.println("\n" + "AGREGAR SERIE" + "\n");
					
					// Pedimos al usuario que introduzca una serie
					System.out.println("Introduzca una serie");
					serie = reader.nextLine();
					
					// Pasamos la primera letra del nombre de la serie a mayusucula y lo demas a minuscula
					serie = serie.substring(0, 1).toUpperCase() + serie.substring(1).toLowerCase();
					
					// Si el mapa contiene la serie que vamos a introducir
					if (series.containsKey(serie)) {
						
						// Se lo hacemos saber al usuario
						System.out.println("\n" + "La serie que estás queriendo añadir ya se encuentra en tu TVBox");
					
					// Si la serie no existe en el mapa
					} else {
						
						// Pedimos al usuario que introduzca la valoracion de la serie
						System.out.println("Introduzca una valoración de la serie");
						valoracion = reader.nextLine();
						
						// Añadimos la serie y su valoracion a la lista
						series.put(serie, valoracion);
						
						// Comprobamos que los datos se hayan añadido correctamente
						if (series.containsKey(serie) && series.get(serie).equals(valoracion)) {
							System.out.println("\n" + "Los datos se han añadido correctamente" + "\n");
						} else {
							System.out.println("\n" + "Ha ocurrido un error" + "\n");
						}
					}
				}
				
				// Si el usuario introduce 2
				case 2 -> {
					
					// Delimitador
					System.out.println("-------------------------");
					
					// Funcionamiento
					System.out.println("\n" + "BUSCAR SERIE" + "\n");
					
					// Pedimos al usuario que introduzca la serie a buscar
					System.out.println("Introduzca la serie a buscar");
					serie = reader.nextLine();
					
					// Pasamos la primera letra del nombre de la serie a mayusucula y lo demas a minuscula
					serie = serie.substring(0, 1).toUpperCase() + serie.substring(1).toLowerCase();
				
					// Si la serie se encuentra en el mapa
					if (series.containsKey(serie)) {
						
						// Obtenemos la valoracion de la serie
						valoracion = series.get(serie);
						
						// Si la serie no tiene valoracion
						if (valoracion == null) {
							System.out.println("Esta serie no tiene valoración" + "\n");
						
						// Si la serie si tiene valoracion la mostramos
						} else {
							System.out.println("\n" + "Valoración -> " + valoracion);
						}
						
					// Si la serie no se encuentra en el mapa
					} else {
						System.out.println("La serie no se encuentra en tu TVBox" + "\n");
					}
				}
				
				// Si el usuario introduce 3
				case 3 -> {
					
					// Delimitador
					System.out.println("-------------------------");
					
					// Funcionamiento
					System.out.println("\n" + "ELIMINAR SERIE" + "\n");
					
					// Pedimos al usuario que introduzca un nombre a eliminar
					System.out.println("Introduzca el nombre a eliminar");
					serie = reader.nextLine();
					
					// Pasamos la primera letra del nombre de la serie a mayusucula y lo demas a minuscula
					serie = serie.substring(0, 1).toUpperCase() + serie.substring(1).toLowerCase();
					
					// Obtenemos la valoracion 
					valoracion = series.get(serie);
					
					// Eliminamos la serie y su valoracion
					if (series.remove(serie, valoracion)) {
						
						// Los datos han sido eliminados correctamente
						System.out.println("\n" + "Los datos han sido eliminados correctamente" + "\n");
					
					// La serie no se encuentra en el mapa
					} else {
						System.out.println("\n" + "La serie no se encuentra en tu TVBox" + "\n");
					}
				}
				
				// Si el usuario introduce 4
				case 4 -> {}
				
				// Si el usuario introduce una opcion no valida
				default -> {
					System.out.println("Introduzca una opción válida" + "\n");
				}
			}
		} while (opcion != 4);
		
		// Fin del programa
		System.out.println("\n" + "FIN DEL PROGRAMA");
		
		// Cerramos el scanner
		reader.close();
	}

}
