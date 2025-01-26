package boletin1;

import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;

public class Ejercicio9 {

	    public static void main(String[] args) {
	    	
	        // Creamos las colecciones para contar las veces que sale cada número y estrella
	        Map<Integer, Integer> numeros = new TreeMap<Integer, Integer>();
	        Map<Integer, Integer> estrellas = new TreeMap<Integer, Integer>();
	        
	        // Creamos el scanner
	        Scanner reader = new Scanner(System.in);
	        
	        // Solicitamos al usuario los 5 números
	        System.out.println("Introduce los 5 números del sorteo (del 1 al 50):");
	        for (int i = 0; i < 5; i++) {
	            int numero;
	            do {
	                System.out.print("Número " + (i + 1) + ": ");
	                numero = reader.nextInt();
	                if (numero < 1 || numero > 50) {
	                    System.out.println("Número fuera de rango. Debe ser entre 1 y 50.");
	                }
	            } while (numero < 1 || numero > 50);
	            
	            // Incrementamos el contador de números
	            numeros.put(numero, numeros.getOrDefault(numero, 0) + 1);
	        }
	        
	        // Solicitamos al usuario las 2 estrellas
	        System.out.println("Introduce las 2 estrellas del sorteo (del 1 al 12):");
	        for (int i = 0; i < 2; i++) {
	            int estrella;
	            do {
	                System.out.print("Estrella " + (i + 1) + ": ");
	                estrella = reader.nextInt();
	                if (estrella < 1 || estrella > 12) {
	                    System.out.println("Estrella fuera de rango. Debe ser entre 1 y 12.");
	                }
	            } while (estrella < 1 || estrella > 12);
	            
	            // Incrementamos el contador de estrellas
	            estrellas.put(estrella, estrellas.getOrDefault(estrella, 0) + 1);
	        }
	        
	        // Mostramos los números registrados
	        System.out.println("Números registrados:");
	        for (Map.Entry<Integer, Integer> entry : numeros.entrySet()) {
	            System.out.println("Número " + entry.getKey() + ": " + entry.getValue() + " veces");
	        }
	        
	        // Mostramos las estrellas registradas
	        System.out.println("Estrellas registradas:");
	        for (Map.Entry<Integer, Integer> entry : estrellas.entrySet()) {
	            System.out.println("Estrella " + entry.getKey() + ": " + entry.getValue() + " veces");
	        }
	        
	        // Cerramos el scanner
	        reader.close();
	    }
	}
