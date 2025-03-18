package boletin2;

import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        // Mapa donde la clave es la categoría y el valor es una lista de tareas
        Map<String, List<String>> tareasPorCategoria = new HashMap<>();
        
        // Creamos el scanner
        Scanner scanner = new Scanner(System.in);
        
        // Variable para almacenar la opcion que introduzca el usuario
        int opcion;
        
        do {
        	
            // Mostramos el menú
            menu();
            
            // Obtenemos la opcion que introduzca el usuario y limpiamos el buffer del scanner
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            // Dependiendo de la opcion que seleccione el usuario
            switch (opcion) {
            	
            	// Añadir tarea
                case 1:
              
                	// Pedimos al usuario que introduzca la categoria
                    System.out.println("Introduzca la categoría de la tarea:");
                    String categoria = scanner.nextLine();
                    
                    // Pedimos al usuario que introduzca la descripcion
                    System.out.println("Introduzca la descripción de la tarea:");
                    String tarea = scanner.nextLine();
                    
                    // Añadimos la tarea
                    añadirTarea(tareasPorCategoria, categoria, tarea);
                    
                    break;
                    
                 // Eliminar tarea
                case 2:
                    
                	// Pedimos al usuario que introduzca la categoria
                    System.out.println("Introduzca la categoría de la tarea a eliminar:");
                    categoria = scanner.nextLine();
                    
                    // Pedimos al usuario que introduzca la descripcion
                    System.out.println("Introduzca la descripción de la tarea a eliminar:");
                    tarea = scanner.nextLine();
                    
                    // Eliminamos la tarea
                    eliminarTarea(tareasPorCategoria, categoria, tarea);
                    
                    break;
                    
                 // Listar tareas por categoría
                case 3:
                    
                	// Pedimos al usuario que introduzca la categoria
                    System.out.println("Introduzca la categoría de las tareas a listar:");
                    categoria = scanner.nextLine();
                    
                    // Listamos las tareas
                    listarTareas(tareasPorCategoria, categoria);
                    
                    break;
                    
                // Salir
                case 4:
                    System.out.println("Fin del programa.");
                    break;
                    
                // Opcion no valida
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);
        
        // Cerramos el scanner
        scanner.close();
    }
    
    // Método para mostrar el menú
    static void menu() {
        System.out.println("\n-------- Menú --------");
        System.out.println("1. Añadir tarea");
        System.out.println("2. Eliminar tarea");
        System.out.println("3. Listar tareas");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
    }
    
    // Método para añadir una tarea
    static void añadirTarea(Map<String, List<String>> tareasPorCategoria, String categoria, String tarea) {
        tareasPorCategoria.computeIfAbsent(categoria, k -> new ArrayList<>()).add(tarea);
        System.out.println("Tarea añadida a la categoría '" + categoria + "'.");
    }

    // Método para eliminar una tarea
    static void eliminarTarea(Map<String, List<String>> tareasPorCategoria, String categoria, String tarea) {
        List<String> tareas = tareasPorCategoria.get(categoria);
        
        if (tareas != null && tareas.remove(tarea)) {
            System.out.println("Tarea eliminada de la categoría '" + categoria + "'.");
        } else {
            System.out.println("No se encontró la tarea en la categoría '" + categoria + "'.");
        }
    }

    // Método para listar tareas por categoría
    static void listarTareas(Map<String, List<String>> tareasPorCategoria, String categoria) {
        List<String> tareas = tareasPorCategoria.get(categoria);
        
        if (tareas != null && !tareas.isEmpty()) {
            System.out.println("Tareas en la categoría '" + categoria + "':");
            for (String tarea : tareas) {
                System.out.println("- " + tarea);
            }
        } else {
            System.out.println("No hay tareas en la categoría '" + categoria + "'.");
        }
    }
}

