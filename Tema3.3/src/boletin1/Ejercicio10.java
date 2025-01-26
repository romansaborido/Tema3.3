package boletin1;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		// Creamos un HashMap para almacenar los productos y sus precios
        HashMap<String, Double> productos = new HashMap<String, Double>();
        
        // Creamos un HashMap para almacenar los productos y su stock
        HashMap<String, Integer> stock = new HashMap<String, Integer>();
        
        // Creamos el scanner
        Scanner reader = new Scanner(System.in);
        
        // Creamos la variable opcion para almacenar la opcion introducida por el usuario
        int opcion;
        
        // Creamos la variable nombreProducto para almacenar el nombre del producto
        String nombreProducto;
        
        // Creamos la variable productoEliminar para almacenar el nombre del producto que el usuario quiere eliminar
        String productoEliminar;
        
        // Creamos la variable precioProducto para almacenar el precio del producto
        double precioProducto;
        
        // Creamos la variable stockProducto para almacenar la cantidad de cada producto
        int stockProducto;

        do {
            // Menú de opciones
            System.out.println("PRODUCTOS");
            System.out.println("1. Alta de producto");
            System.out.println("2. Baja de producto");
            System.out.println("4. Listar existencias");
            System.out.println("0. Salir");
            
            // Pedimos al usuario que introduzca una opcion
            System.out.print("Introduzca una opción: ");
            opcion = reader.nextInt();
            
            // Limpiar el buffer el scanner
            reader.nextLine(); 
            
            // Creamos un switch 
            switch (opcion) {
            
            	// Si el usuario selecciona la opcion 1
            	case 1 -> {
            		
            		// Pedimos al usuario que introduzca el nombre del producto
                    System.out.print("Introduce el nombre del producto: ");
                    nombreProducto = reader.nextLine();
                    
                    // Si el producto ya existe
                    if (productos.containsKey(nombreProducto)) {
                        System.out.println("El producto ya está registrado");
                    
                    // Si el producto no existe
                    } else {
                    	
                    	// Pedimos al usuario que introduzca el precio del producto
                        System.out.print("Introduce el precio del producto: ");
                        precioProducto = reader.nextDouble();
                        
                        // Limpiamos el buffer del scanner
                        reader.nextLine();

                        // Registramos el producto en el mapa
                        productos.put(nombreProducto, precioProducto);
                        System.out.println("Producto añadido correctamente");
                    }
            	}

            	// Si el usuario selecciona la opcion 2
                case 2 -> {
                	
                	// Pedimos al usuario que introduzca el nombre del producto a eliminar
                    System.out.print("Introduce el nombre del producto a eliminar: ");
                    productoEliminar = reader.nextLine();
                    
                    // Si el producto a eliminar existe
                    if (productos.containsKey(productoEliminar)) {
                    	
                    	// Eliminamos el producto
                        productos.remove(productoEliminar);
                        System.out.println("Producto eliminado correctamente");
                        
                    // Si el producto a eliminar no existe
                    } else {
                        System.out.println("El producto no existe");
                    }
            	}
                
                // Si el usuario selecciona la opcion 4
                case 4 -> {
                	
                	// Pedimos al usuario que introduzca el nombre del producto
                	System.out.println("Introduzca el nombre del producto");
                	nombreProducto = reader.nextLine();
                	
                	// Si el producto no existe
                	if (!productos.containsKey(nombreProducto)) {
                		System.out.println("El producto no existe");
                		
                	// Si el producto existe
                	} else {
                		
                		// Pedimos al usuario que introduzca el stock
                    	System.out.println("Introduzca el stock del producto");
                    	stockProducto = reader.nextInt();
                    	
                    	// Añadimos el producto y el stock al mapa
                    	stock.put(nombreProducto, stockProducto);
                	}
            	}
                
                // Si el usuario selecciona la opcion 0
                case 0 -> {
                    System.out.println("Saliendo del programa...");
                }
                
                // Si el usuario introduce una opcion no valida
                default -> {
                    System.out.println("Opción no válida. Intenta nuevamente.");
                }
            }
        
        // Mientras que el usuario no introduzca la opcion 0
        } while (opcion != 0);
        
        // Cerramos el scanner
        reader.close();
    }
}
