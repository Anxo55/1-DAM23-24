package BoletinArrays;


import java.util.Scanner;

// Pedir por teclado el tamaño de un arreglo de números y pedir los valores numéricos
// con los que se rellena. Los valores no se pueden repetir. Mostrar el arreglo con los
// valores al final.


public class ejercicio9 {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir por teclado el tamaño del arreglo
        System.out.print("Ingrese el tamaño del arreglo: ");
        int tamañoArreglo = scanner.nextInt();

        // Verificar que el tamaño sea mayor que 0
        if (tamañoArreglo <= 0) {
            System.out.println("Por favor, ingrese un tamaño válido mayor que 0.");
            return;
        }

        // Crear un arreglo para almacenar los valores
        int[] arreglo = new int[tamañoArreglo];

        // Pedir por teclado los valores numéricos y llenar el arreglo
        for (int i = 0; i < tamañoArreglo; i++) {
            System.out.print("Ingrese el valor para la posición " + (i + 1) + ": ");
            int valor = scanner.nextInt();

            // Verificar si el valor ya existe en el arreglo
            if (existeEnArreglo(arreglo, valor, i)) {
                System.out.println("El valor ya existe. Por favor, ingrese un valor único.");
                i--; // Decrementar i para repetir la iteración y volver a pedir el valor.
            } else {
                arreglo[i] = valor;
            }
        }

        // Mostrar el arreglo con los valores al final
        System.out.println("Arreglo con valores únicos:");
        for (int i = 0; i < tamañoArreglo; i++) {
            System.out.println("Posición " + (i + 1) + ": " + arreglo[i]);
        }

        scanner.close();
    }

    // Función para verificar si un valor ya existe en el arreglo
    private static boolean existeEnArreglo(int[] arreglo, int valor, int indice) {
        for (int i = 0; i < indice; i++) {
            if (arreglo[i] == valor) {
                return true;
            }
        }
        return false;
    }
}