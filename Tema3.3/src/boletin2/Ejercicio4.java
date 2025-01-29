package boletin2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		// Creamos la variable opcion para almacenar la opcion que introduzca el usuario
		int opcion;
		
		// Creamos el arraylist llamado nombre de tipo string para almacenar los nombres que introduzca el usuario
		ArrayList<String> nombres = new ArrayList<>();
		
		// Creamos el arraylist llamada nombresOrdenados de tipo string para almacenar la lista de manera ordenada
		ArrayList<String> nombresOrdenados = new ArrayList<>();
		
		// Creamos una variable cadena para almacenar el nombre que introduzca el usuario
		String nombre = "";
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		
		// Damos la bienvenida al usuario
		System.out.println("BIENVENIDO A TU BASE DE DATOS -> NOMBRES" + "\n");
		
		// Mientras que el usuario no introduzca como opcion el 5
		do {
			
			// Pintamos el menu
			System.out.println("-------------------------");
			System.out.println("1. Añadir nuevo nombre a la lista");
			System.out.println("2. Elimina un nombre específico");
			System.out.println("3. Ordena la lista alfabéticamente");
			System.out.println("4. Busca si un nombre específico está en la lista");
			System.out.println("5. Salir" + "\n");
			
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
					System.out.println("\n" + "AÑADIR NUEVO NOMBRE A LA LISTA" + "\n");
					
					// Pedimos al usuario que introduzca un nombre
					System.out.println("Introduzca un nombre");
					nombre = reader.nextLine();
					
					// Pasamos la primera letra de nombre a mayusucula y lo demas a minuscula
					nombre = nombre.substring(0, 1).toUpperCase() + nombre.substring(1).toLowerCase();
					
					// Si la lista contiene el nombre que ya vamos a introducir
					if (nombres.contains(nombre)) {
						
						// Se lo hacemos saber al usuario
						System.out.println("\n" + "El nombre que estás queriendo añadir ya se encuentra en la lista");
					
					// Si el nombre no existe en la lista
					} else {
						
						// Añadimos el nombre a la lista
						nombres.add(nombre);
						
						// Comprobamos que el nombre se haya añadido correctamente
						if (nombres.contains(nombre)) {
							System.out.println("\n" + "El nombre se ha añadido correctamente" + "\n");
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
					System.out.println("\n" + "ELIMINA UN NOMBRE ESPECÍFICO" + "\n");
					
					// Pedimos al usuario que introduzca un nombre a eliminar
					System.out.println("Introduzca el nombre a eliminar");
					nombre = reader.nextLine();
					
					// Pasamos la primera letra de nombre a mayusucula y lo demas a minuscula
					nombre = nombre.substring(0, 1).toUpperCase() + nombre.substring(1).toLowerCase();
					
					// Eliminamos el nombre de la lista
					if (nombres.remove(nombre)) {
						
						// El nombre se ha eliminado correctamente
						System.out.println("\n" + "El nombre se ha eliminado correctamente" + "\n");
					
					// El nombre no se encuentra en la lista
					} else {
						System.out.println("\n" + "El nombre no se encuentra en la lista" + "\n");
					}
				}
				
				// Si el usuario introduce 3
				case 3 -> {
					
					// Delimitador
					System.out.println("-------------------------");
					
					// Funcionamiento
					System.out.println("\n" + "ORDENA LA LISTA ALFABÉTICAMENTE" + "\n");
					
					// Pulse enter para ordenar la lista alfabeticamente y mostrarla por pantalla
					System.out.println("Pulse enter para ordenar la lista alfabeticamente y mostrarla por pantalla");
					reader.nextLine();
					
					// Copiamos la lista de nombres a nombresOrdenados
					nombresOrdenados.addAll(nombres);
					
					// Ordenamos la lista nombresOrdenados
					Collections.sort(nombresOrdenados);
					
					// Mostramos la lista
					System.out.println("\n" + nombresOrdenados + "\n");
				}
				
				// Si el usuario introduce 4
				case 4 -> {
					
					// Delimitador
					System.out.println("-------------------------");
					
					// Funcionamiento
					System.out.println("\n" + "BUSCA SI UN NOMBRE ESTÁ EN LA LISTA" + "\n");
					
					// Pedimos al usuario que introduzca el nombre a buscar
					System.out.println("Introduzca el nombre a buscar");
					nombre = reader.nextLine();
					
					// Pasamos la primera letra de nombre a mayusucula y lo demas a minuscula
					nombre = nombre.substring(0, 1).toUpperCase() + nombre.substring(1).toLowerCase();
				
					// Si el nombre se encuentra en la lista
					if (nombres.contains(nombre)) {
						
						System.out.println("El nombre ya se encuentra en la lista" + "\n");
					
					// Si el nombre no se encuentra en la lista
					} else {
						System.out.println("El nombre NO se encuentra en la lista" + "\n");
					}
				}
				
				// Si el usuario introduce 5
				case 5 -> {}
				
				// Si el usuario introduce una opcion no valida
				default -> {
					System.out.println("Introduzca una opción válida" + "\n");
				}
			}
		} while (opcion != 5);
		
		// Fin del programa
		System.out.println("\n" + "FIN DEL PROGRAMA");
		
		// Cerramos el scanner
		reader.close();
	}

}
