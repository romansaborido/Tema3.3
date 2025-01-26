package tema3_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Creamos la clase random
		Random rand = new Random();
		
		// Creamos la variable numeroRandom para ir almacenando el numero aleatorio
		int valorRandom;
		
		// Creamos la variable tamañoRandom para generar un tamaño aleatorio para el arraylist
		int tamañoRandom = rand.nextInt(5,11);
		
		// Creamos la variable suma para mostrar la suma de todos los valores del arraylist
		int suma = 0;
		
		// Creamos la variable media para mostrar la media de todos los valores del arraylist
		int media = 0;

		// Creamos la variable numeroMaximo para mostrar el numero mas grande del arraylist
		int numeroMaximo;
		
		// Creamos la variable suma para mostrar el numero mas pequeño del arraylist
		int numeroMinimo;

		// Creamos un arraylist de tipo entero llamado listRandom
		ArrayList<Integer> listRandom = new ArrayList<Integer>();
		
		
		// Creamos un bucle para asignar valores al array
		while (listRandom.size() < tamañoRandom) {
			
			// Generamos un valor aleatorio
			valorRandom = rand.nextInt(0, 101);
			
			// Sumamos el valor
			suma += valorRandom;
			
			// Añadimos al arraylist el valor aleatorio
			listRandom.add(valorRandom);
		}
		
		
		// Encabezado del arraylist
		System.out.println("LISTRANDOM");
		
		// Mostramos los valores del arraylist
		System.out.println(listRandom);
		
		// Salto de linea
		System.out.println();
		
		// Calculamos la media de los valores del arraylist
		media = suma / listRandom.size();
		
		// Obtenemos el numero maximo y el numero minimo del arraylist
		numeroMaximo = Collections.max(listRandom);
		numeroMinimo = Collections.min(listRandom);
		
		// Mostramos los resultados
		System.out.println("Suma -> " + suma);
		System.out.println("Media -> " + media);
		System.out.println("Número máximo -> " + numeroMaximo);
		System.out.println("Número mínimo -> " + numeroMinimo);
	}

}
