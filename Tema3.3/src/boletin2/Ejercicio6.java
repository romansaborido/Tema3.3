package boletin2;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Ejercicio6 {

    public static void main(String[] args) {

        // Creamos un TreeMap para almacenar por orden alfabetico a las personas y sus telefonos
        TreeMap<String, Set<Integer>> personasTelefonos = new TreeMap<>();

        // Creamos una variable para almacenar la opcion que introduzca el usuario
        int opcion;

        // Creamos una variable cadena para almacenar el nombre de la persona que introduzca el usuario
        String nombre;

        // Creamos una variable tipo int para almacenar el numero de telefono que introduzca el usuario
        int telefono = 0;

        // Creamos el scanner
        Scanner reader = new Scanner(System.in);

        do {

            // Pintamos el menu
            menu();

            // Pedimos al usuario que introduzca una opcion
            System.out.println("Introduzca una opcion");
            opcion = reader.nextInt();

            // Limpiamos el buffer del scanner
            reader.nextLine();

            // Creamos un switch para las distintas acciones
            switch (opcion) {

                // Si el usuario selecciona la opcion 1
                case 1 -> {

                    // Funcionamiento
                    System.out.println("\n" + "AÑADIR PERSONA" + "\n");

                    // Pedimos al usuario que introduzca el nombre de la persona
                    System.out.println("Introduzca el nombre de la persona");
                    nombre = reader.nextLine();

                    // Si el nombre no existe en el mapa
                    if (!personasTelefonos.containsKey(nombre)) {

                        // Introducimos el nombre
                        personasTelefonos.put(nombre, null);

                    // Si el nombre existe en el mapa
                    } else {
                        System.out.println("El nombre ya se encuentra en la lista");
                    }
                }

                // Si el usuario selecciona la opcion 2
                case 2 -> {

                    // Funcionamiento
                    System.out.println("\n" + "AÑADIR TELÉFONO A UNA PERSONA" + "\n");

                    // Pedimos al usuario que introduzca el nombre de la persona
                    System.out.println("Introduzca el nombre de la persona");
                    nombre = reader.nextLine();

                    // Si la persona existe en el mapa
                    if (personasTelefonos.containsKey(nombre)) {

                        do {
                            try {
                                // Pedimos al usuario que introduzca el telefono
                                System.out.println("Introduzca el número de teléfono que quieres añadir");
                                telefono = reader.nextInt();

                                // Comprobamos que es un numero de telefono valido
                                assert (telefono >= 1000000000 && telefono <= 999999999) : "Introduzca un número de teléfono válido";

                                // Añadimos el teléfono a la persona
                                Set<Integer> telefonos = personasTelefonos.get(nombre);
                                if (telefonos != null) {
                                    telefonos.add(telefono);
                                } else {
                                    telefonos = new TreeSet<>();
                                    telefonos.add(telefono);
                                    personasTelefonos.put(nombre, telefonos);
                                }

                            // Mostramos un error si introduce un numero de telefono no valido
                            } catch (AssertionError e) {
                                System.err.println(e.getMessage());

                            // Mostramos un error si no introduce un numero entero
                            } catch (InputMismatchException e) {
                                System.err.println("Introduzca un número de teléfono");

                            // Limpiamos el buffer del scanner
                            } finally {
                                reader.nextLine();
                            }
                        } while (telefono < 100000000 || telefono > 999999999);
                    } else {
                        System.out.println("La persona no existe");
                    }
                }

                // Si el usuario selecciona la opcion 3
                case 3 -> {

                    // Funcionamiento
                    System.out.println("\n" + "MOSTRAR LOS TELÉFONOS DE UNA PERSONA" + "\n");

                    // Pedimos al usuario que introduzca el nombre de la persona
                    System.out.println("Introduzca el nombre de la persona");
                    nombre = reader.nextLine();

                    // Si la persona existe en el mapa
                    if (personasTelefonos.containsKey(nombre)) {

                        Set<Integer> telefonos = personasTelefonos.get(nombre);

                        if (telefonos != null && !telefonos.isEmpty()) {
                            System.out.println("Teléfonos de " + nombre + ": " + telefonos);
                        } else {
                            System.out.println("No tiene teléfonos registrados.");
                        }

                    } else {
                        System.out.println("La persona no existe");
                    }
                }

                // Si el usuario selecciona la opcion 4
                case 4 -> {

                    // Funcionamiento
                    System.out.println("\n" + "ELIMINAR TELÉFONO DE UNA PERSONA" + "\n");

                    // Pedimos al usuario que introduzca el nombre de la persona
                    System.out.println("Introduzca el nombre de la persona");
                    nombre = reader.nextLine();

                    // Si la persona existe en el mapa
                    if (personasTelefonos.containsKey(nombre)) {

                        Set<Integer> telefonos = personasTelefonos.get(nombre);

                        // Si la persona tiene teléfonos registrados
                        if (telefonos != null && !telefonos.isEmpty()) {

                            // Pedimos el teléfono a eliminar
                            System.out.println("Introduzca el teléfono que quiere eliminar");
                            telefono = reader.nextInt();

                            // Si el teléfono existe en la lista
                            if (telefonos.contains(telefono)) {
                                telefonos.remove(telefono);
                                System.out.println("Teléfono eliminado.");
                            } else {
                                System.out.println("Este teléfono no está registrado.");
                            }

                        } else {
                            System.out.println("La persona no tiene teléfonos registrados.");
                        }

                    } else {
                        System.out.println("La persona no existe");
                    }
                }

                // Si el usuario selecciona la opcion 5
                case 5 -> {

                    // Funcionamiento
                    System.out.println("\n" + "ELIMINAR UNA PERSONA" + "\n");

                    // Pedimos al usuario que introduzca el nombre de la persona
                    System.out.println("Introduzca el nombre de la persona");
                    nombre = reader.nextLine();

                    // Si la persona existe en el mapa
                    if (personasTelefonos.containsKey(nombre)) {

                        personasTelefonos.remove(nombre);
                        System.out.println("Persona eliminada.");

                    } else {
                        System.out.println("La persona no existe");
                    }
                }

                // Si el usuario selecciona una opcion no valida
                default -> {
                    System.out.println("Has introducido una opción no válida");
                }

                // Si el usuario selecciona la opcion 6
                case 6 -> {}
            }

        } while (opcion != 6);

        // Fin del programa
        System.out.println("\n" + "FIN DEL PROGRAMA");

        // Cerramos el scanner
        reader.close();
    }

    // Método que pinta el menú
    static void menu() {
        System.out.println("-------------------------");
        System.out.println("1. Añadir persona");
        System.out.println("2. Añadir teléfono a una persona");
        System.out.println("3. Mostrar los teléfonos de una persona");
        System.out.println("4. Eliminar teléfono de una persona");
        System.out.println("5. Eliminar una persona");
        System.out.println("6. Salir" + "\n");
    }
}

