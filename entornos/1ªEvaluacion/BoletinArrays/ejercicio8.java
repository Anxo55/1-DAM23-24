package BoletinArrays;

// 8) Pediremos los IDs (números) de alumnos de dos clases, álgebra y análisis. Queremos
// mostrar todos los alumnos comunes en las dos asignaturas. Estos alumnos se guarden en
// un tercer arreglo y que sea el que se muestre. También indica el numero de alumnos que
// se repiten.

import java.util.Scanner;

public class ejercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar IDs de alumnos de la clase de álgebra
        int[] algebraIDs = solicitarIDs("Álgebra");

        // Solicitar IDs de alumnos de la clase de análisis
        int[] analisisIDs = solicitarIDs("Análisis");

        // Encontrar y mostrar los alumnos comunes en ambas asignaturas
        int[] alumnosComunes = encontrarAlumnosComunes(algebraIDs, analisisIDs);

        System.out.println("Alumnos comunes en Álgebra y Análisis:");
        mostrarIDs(alumnosComunes);

        // Mostrar el número de alumnos que se repiten
        int numAlumnosRepetidos = alumnosComunes.length;
        System.out.println("Número de alumnos que se repiten: " + numAlumnosRepetidos);
    }

    // Función para solicitar IDs de alumnos
    static int[] solicitarIDs(String asignatura) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de alumnos en la clase de " + asignatura + ": ");
        int numAlumnos = scanner.nextInt();

        int[] ids = new int[numAlumnos];
        System.out.println("Ingrese los IDs de los alumnos de la clase de " + asignatura + ":");
        for (int i = 0; i < numAlumnos; i++) {
            System.out.print("ID del alumno " + (i + 1) + ": ");
            ids[i] = scanner.nextInt();
        }

        return ids;
    }

    // Función para encontrar alumnos comunes en dos clases
    static int[] encontrarAlumnosComunes(int[] clase1, int[] clase2) {
        int[] alumnosComunes = new int[Math.min(clase1.length, clase2.length)];
        int indiceComunes = 0;

        for (int id1 : clase1) {
            for (int id2 : clase2) {
                if (id1 == id2) {
                    alumnosComunes[indiceComunes++] = id1;
                    break;
                }
            }
        }

        return java.util.Arrays.copyOf(alumnosComunes, indiceComunes);
    }

    // Función para mostrar IDs de alumnos
    static void mostrarIDs(int[] ids) {
        for (int id : ids) {
            System.out.print(id + " ");
        }
        System.out.println();
    }
}
