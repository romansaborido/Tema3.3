package boletin2;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.HashSet;

public class Ejercicio7 {

    public static void main(String[] args) {

        // Creamos un TreeMap para almacenar palabras por su longitud
        TreeMap<Integer, Set<String>> clasificacionPalabras = new TreeMap<>();

        // Lista de palabras de ejemplo
        String[] palabras = {"casa", "perro", "sol", "elefante", "gato", "ratón", "piedra", "luna"};

        // Clasificamos las palabras por su longitud
        for (String palabra : palabras) {
        	
        	// Almacenamos la longitud de la palabra
            int longitud = palabra.length();

            // Si la longitud no existe en el mapa, la agregamos con un nuevo conjunto
            if (!clasificacionPalabras.containsKey(longitud)) {
                clasificacionPalabras.put(longitud, new HashSet<>());
            }

            // Añadimos la palabra al conjunto correspondiente
            clasificacionPalabras.get(longitud).add(palabra);
        }

        // Imprimimos el mapa para mostrar la clasificación
        System.out.println("Clasificación de palabras por longitud:");
        for (Map.Entry<Integer, Set<String>> entry : clasificacionPalabras.entrySet()) {
            System.out.println("Longitud " + entry.getKey() + ": " + entry.getValue());
        }
    }
}

