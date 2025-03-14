package boletin1;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		// Creamos un hashmap para almacenar los nombres de usuario con su contraseña correspondiente
		HashMap<String, String> acceso = new HashMap<String, String>();
		
		// Creamos la variable opcion para almacenar la opcion que introduzca el usuario
		int opcion;
		
		// Creamos la variable nombreUsuario para almacenar el usuario del usuario
		String nombreUsuario;
		
		// Creamos la variable contraseña para almacenar la contraseña del usuario
		String contraseña;
		
		// Creamos la variable intentos para almacenar el numero de intentos del usuario
		int intentos = 0;
		
		// Creamos el booleano esValido para controlar la salida del bucle
		boolean esValido = false;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		
		// Mientras que el usuario no introduzca al opcion 0
		do {
			// Delimitador
			System.out.println("-------------------------");
			
			// Pintamos el menu
			System.out.println("1. Registro");
			System.out.println("2. Login");
			System.out.println("0. Salir");
			
			// Almacenamos la opcion introducida por el usuario
			opcion = reader.nextInt();
			
			// Limpiamos el buffer del scanner
			reader.nextLine();
			
			// Creamos un switch para las distintas acciones del menu
			switch (opcion) {
			
				// Si el usuario introduce la opcion 1
				case 1 -> {
					
					do {
						// Pedimos al usuario que introduzca un nombre de usuario
						System.out.println("Introduzca un nombre de usuario");
						nombreUsuario = reader.nextLine();
						
					// Mientras que el usuario no introduzca un nombre de usuario que no este en uso
					} while (acceso.containsKey(nombreUsuario));
					
					// Pedimos al usuario que introduzca una contraseña
					System.out.println("Establezca una contraseña");
					contraseña = reader.nextLine();
					
					// Insertamos su usuario y su contraseña
					acceso.put(nombreUsuario, contraseña);
					
					// Salto de linea
					System.out.println();
					
					// Pulsa enter para volver al menu
					System.out.println("Pulsa enter para volver al menu");
					reader.nextLine();
				}
				
				// Si el usuario introduce la opcion 2
				case 2 -> {
					
					// Reiniciamos los intentos y la validez antes de comenzar un nuevo login
					intentos = 0;
					esValido = false;
					
					// Mientras que el usuario no agote los intentos
					while (intentos < 3 && !esValido) {
						
						// Pedimos al usuario que introduzca su nombre de usuario
						System.out.println("Introduzca su nombre de usuario");
						nombreUsuario = reader.nextLine();
						
						// Si el usuario existe
						if (acceso.containsKey(nombreUsuario)) {
							
							// Pedimos al usuario que introduzca su contraseña
							System.out.println("Introduzca su contraseña");
							contraseña = reader.nextLine();
							
							// Salto de linea
							System.out.println();
							
							// Si la contraseña es correcta
							if (contraseña.equals(acceso.get(nombreUsuario))) {
								System.out.println("Ha accedido al área restringida");
								
							// Igualamos esValido a true
							esValido = true;
							
							// Si la contraseña no es correcta	
							} else {
								System.out.println("Usuario y/o contraseña incorrecta");
							}
							
						// Si el usuario no existe
						} else {
							System.out.println("Usuario y/o contraseña incorrecta");
						}
					}
					
					// Si agotado todos los intentos
					if (!esValido) {
						System.out.println("Lo siento, no tiene acceso al área restringida");
					}
				}
			}
		} while (opcion != 0);
			
		
		// Salto de linea
		System.out.println();
		
		// Fin del programa
		System.out.println("FIN DEL PROGRAMA");
		
		// Cerramos el scanner
		reader.close();
	}

}
