package boletin1;

import java.util.Random;
import java.util.TreeSet;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		// Creamos la constante tamañoTreeSet para almacenar el tamaño del arraylist
		final int TAMAÑO_TREE_SET = 20;
		
		// Creamos la variable valorAleatorio para almacenar el numero aleatorio generado
		int valorAleatorio;
		
		// Creamos la clase random
		Random rand = new Random();
		
		// Creamos un conjunto treeSet para almacenar los valores de manera ordenada
		TreeSet<Integer> conjuntoOrdenado = new TreeSet<Integer>();
		
		
		// Creamos un bucle para asignar los valores del conjunto 
		while (conjuntoOrdenado.size() < TAMAÑO_TREE_SET) {
			
			// Generamos un numero entero aleatorio
			valorAleatorio = rand.nextInt(0, 100);
			
			// Añadimos el valor al conjunto
			conjuntoOrdenado.add(valorAleatorio);
		}
		
		
		// Encabezado del arraylist
		System.out.println("CONJUNTO ORDENADO");
		
		// Mostramos los valores del conjunto
		System.out.println(conjuntoOrdenado);
	}

}

