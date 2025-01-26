package tema3_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		// Creamos la variable numero para almacenar el numero introducido por el usuario
		int numero;
		
		// Creamos la constante tamañoArrayList para almacenar el tamaño del arraylist
		final int TAMAÑO_ARRAY_LIST = 30;
		
		// Creamos el arraylist listRandomSort para almacenar numeros aleatorios de manera ordenada
		ArrayList<Integer> listRandomSort = new ArrayList<Integer>();
		
		// Creamos la clase random
		Random rand = new Random();
		
		
		// Creamos un bucle para asignar valores al array
		while (listRandomSort.size() < TAMAÑO_ARRAY_LIST) {
			
			// Generamos un valor aleatorio
			numero = rand.nextInt(1,11);
			
			// Añadimos el valor al arraylist
			listRandomSort.add(numero);
		}
		
		
		// Ordenamos el arraylist
		Collections.sort(listRandomSort);
		
		// Encabezado del arraylist
		System.out.println("LIST RANDOM SORT");
		
		// Mostramos los valores del arraylist
		System.out.println(listRandomSort);
	}
}
