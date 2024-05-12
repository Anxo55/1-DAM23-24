import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Ejercicio5A {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();

        while (true) {

            System.out.println("\nMenú:");
            System.out.println("a. Poblar la lista con nombres y notas de varios alumnos");
            System.out.println("b. Añadir un alumno");
            System.out.println("c. Mostrar los nombres y notas de todos los alumnos");
            System.out.println("d. Ordenar la lista en orden alfabético por nombre");
            System.out.println("e. Ordenar la lista por notas");
            System.out.println("f. Eliminar un alumno");
            System.out.println("x. Salir");
            System.out.print("Elige una opción: ");
            char opcion = sc.next().charAt(0);

            switch (opcion) {
                case 'a':
                    poblarLista(listaAlumnos);
                    break;
                case 'b':
                    añadirAlumno(listaAlumnos);
                    break;
                case 'c':
                    mostrarInformacion(listaAlumnos);
                    break;
                case 'd':
                    ordenarPorNombre(listaAlumnos);
                    break;
                case 'e':
                    ordenarPorNota(listaAlumnos);
                    break;
                case 'f':
                    eliminarAlumno(listaAlumnos);
                    break;
                case 'g':
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
            }
        }
    }

    public static void poblarLista(ArrayList<Alumno> listaAlumnos) {
        listaAlumnos.add(new Alumno("Juan", 8.5));
        listaAlumnos.add(new Alumno("María", 7.2));
        listaAlumnos.add(new Alumno("Pedro", 6.9));
        listaAlumnos.add(new Alumno("Ana", 9.0));
        listaAlumnos.add(new Alumno("Laura", 8.0));
        System.out.println("Lista poblada con éxito.");
    }

    public static void añadirAlumno(ArrayList<Alumno> listaAlumnos) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el nombre del alumno: ");
        String nombre = sc.nextLine();
        System.out.print("Introduce la nota del alumno: ");
        double nota = sc.nextDouble();
        sc.nextLine(); // Limpiar el buffer

        listaAlumnos.add(new Alumno(nombre, nota));
        System.out.println("Alumno añadido con éxito.");
    }

    public static void mostrarInformacion(ArrayList<Alumno> listaAlumnos) {

        if (listaAlumnos.isEmpty()) {
            System.out.println("No hay alumnos en la lista.");
        } else {
            for (Alumno alumno : listaAlumnos) {
                System.out.println("Nombre: " + alumno.getNombre() + ", Nota: " + alumno.getNota());
            }
        }
    }

    public static void ordenarPorNombre(ArrayList<Alumno> listaAlumnos) {
        Collections.sort(listaAlumnos, Comparator.comparing(Alumno::getNombre));
        System.out.println("Lista ordenada por nombre.");
    }

    public static void ordenarPorNota(ArrayList<Alumno> listaAlumnos) {
        Collections.sort(listaAlumnos, Comparator.comparingDouble(Alumno::getNota).reversed());
        System.out.println("Lista ordenada por nota.");
    }

    public static void eliminarAlumno(ArrayList<Alumno> listaAlumnos) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el nombre del alumno a eliminar: ");
        String nombre = scanner.nextLine();

        for (int i = 0; i < listaAlumnos.size(); i++) {
            if (listaAlumnos.get(i).getNombre().equals(nombre)) {
                listaAlumnos.remove(i);
                System.out.println("Alumno eliminado con éxito.");
                return;
            }
        }
        System.out.println("Alumno con nombre " + nombre + " no encontrado en la lista.");
    }
}

