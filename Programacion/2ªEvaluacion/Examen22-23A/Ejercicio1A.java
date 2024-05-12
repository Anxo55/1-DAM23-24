// package Examen22-23A;

// Pedir por teclado la introducción de una tabla de 10 elementos numéricos enteros.
// Eliminar el elemento situado en una posición pedida por teclado al usuario sin dejar huecos en la tabla.
// Mostrar la tabla por consola después de la eliminación de dicho elemento.

import java.util.Scanner;

public class Ejercicio1A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int[] tabla = new int[10];
        System.out.println("Introduce los 10 elementos numéricos enteros:");
        for (int i = 0; i < tabla.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            tabla[i] = scanner.nextInt();
        }

        
        System.out.print("Introduce la posición del elemento a eliminar (de 1 a 10): ");
        int posicionAEliminar = scanner.nextInt();
        
        
        if (posicionAEliminar < 1 || posicionAEliminar > 10) {
            System.out.println("La posición introducida no es válida.");
            return;
        }


        for (int i = posicionAEliminar - 1; i < tabla.length - 1; i++) {
            tabla[i] = tabla[i + 1];
        }
        tabla[tabla.length - 1] = 0; // Para eliminar el último elemento

       
        System.out.println("Tabla después de eliminar el elemento:");
        for (int elemento : tabla) {
            System.out.print(elemento + " ");
        }
    }
}
    

