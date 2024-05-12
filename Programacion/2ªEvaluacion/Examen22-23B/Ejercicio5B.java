import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Ejercicio5B {
    
    static ArrayList<Persona> personas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("a. Poblar la lista con información de varias personas");
            System.out.println("b. Añadir una persona");
            System.out.println("c. Mostrar la información de todas las personas");
            System.out.println("d. Ordenar la lista por apellido en orden alfabético");
            System.out.println("e. Ordenar la lista por edad");
            System.out.println("f. Eliminar una persona (introduciendo el DNI)");
            System.out.println("x. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.next().charAt(0);

            switch (opcion) {
                case 'a':
                    poblarLista();
                    break;
                case 'b':
                    agregarPersona();
                    break;
                case 'c':
                    mostrarPersonas();
                    break;
                case 'd':
                    ordenarPorApellido();
                    break;
                case 'e':
                    ordenarPorEdad();
                    break;
                case 'f':
                    eliminarPersona();
                    break;
                case 'x':
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 'x');
    }

    public static void poblarLista() {
        personas.add(new Persona("12345678A", "García", "Juan", "M", 30, 75.5));
        personas.add(new Persona("23456789B", "López", "María", "F", 25, 60.2));
        personas.add(new Persona("34567890C", "Martínez", "Pedro", "M", 35, 80.0));
        personas.add(new Persona("45678901D", "Sánchez", "Ana", "F", 40, 65.7));
        personas.add(new Persona("56789012E", "Gómez", "Luis", "M", 28, 70.3));
        System.out.println("Lista poblada con éxito.");
    }

    public static void agregarPersona() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el DNI: ");
        String dni = scanner.nextLine();
        System.out.print("Introduce los apellidos: ");
        String apellidos = scanner.nextLine();
        System.out.print("Introduce los nombres: ");
        String nombres = scanner.nextLine();
        System.out.print("Introduce el sexo (M/F): ");
        String sexo = scanner.nextLine();
        System.out.print("Introduce la edad: ");
        int edad = scanner.nextInt();
        System.out.print("Introduce el peso: ");
        double peso = scanner.nextDouble();

        personas.add(new Persona(dni, apellidos, nombres, sexo, edad, peso));
        System.out.println("Persona añadida con éxito.");
    }

    public static void mostrarPersonas() {
        if (personas.isEmpty()) {
            System.out.println("La lista está vacía.");
            return;
        }
        System.out.println("Información de todas las personas:");
        for (Persona persona : personas) {
            System.out.println(persona.getDni() + " - " + persona.getApellidos() + ", " + persona.getNombres()
                    + " - Sexo: " + persona.getSexo() + ", Edad: " + persona.getEdad() + ", Peso: " + persona.getPeso());
        }
    }

    public static void ordenarPorApellido() {
        if (personas.isEmpty()) {
            System.out.println("La lista está vacía.");
            return;
        }
        Collections.sort(personas, Comparator.comparing(Persona::getApellidos));
        System.out.println("Lista ordenada por apellido en orden alfabético.");
    }

    public static void ordenarPorEdad() {
        if (personas.isEmpty()) {
            System.out.println("La lista está vacía.");
            return;
        }
        Collections.sort(personas, Comparator.comparingInt(Persona::getEdad));
        System.out.println("Lista ordenada por edad.");
    }

    public static void eliminarPersona() {
        if (personas.isEmpty()) {
            System.out.println("La lista está vacía.");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el DNI de la persona a eliminar: ");
        String dni = scanner.nextLine();

        boolean eliminado = personas.removeIf(persona -> persona.getDni().equals(dni));
        if (eliminado) {
            System.out.println("Persona con DNI " + dni + " eliminada.");
        } else {
            System.out.println("No se encontró ninguna persona con DNI " + dni + ".");
        }
    }
}
