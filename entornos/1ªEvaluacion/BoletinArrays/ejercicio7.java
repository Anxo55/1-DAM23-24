package BoletinArrays;

import java.util.Scanner;

// 7) Buscar un elemento dentro de un arreglo que nosotros le pedimos por teclado. Indicar
// la posición donde se encuentra. Si hay más de uno, indicar igualmente la posición.


public class ejercicio7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el tamaño del arreglo
        System.out.print("Ingrese el tamaño del arreglo: ");
        int tamano = scanner.nextInt();

        // Crear el arreglo con el tamaño proporcionado por el usuario
        int[] arreglo = new int[tamano];

        // Llenar el arreglo con valores ingresados por el usuario
        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < tamano; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }

        // Solicitar al usuario el elemento a buscar
        System.out.print("Ingrese el elemento a buscar: ");
        int elementoBuscar = scanner.nextInt();

        // Buscar el elemento en el arreglo y mostrar las posiciones encontradas
        boolean encontrado = false;
        System.out.print("Posiciones del elemento " + elementoBuscar + ": ");
        for (int i = 0; i < tamano; i++) {
            if (arreglo[i] == elementoBuscar) {
                System.out.print(i + " ");
                encontrado = true;
            }
        }

        // Mostrar mensaje si el elemento no se encuentra en el arreglo
        if (!encontrado) {
            System.out.println("El elemento no se encuentra en el arreglo.");
        }
    }
}
    

