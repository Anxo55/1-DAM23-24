package BoletinArrays;

import java.util.Scanner;

// Pedir valores numéricos en dos arrays distintos y almacenar el resultado de los
// valores de cada posición (posición 0 del arreglo 1 + posición 0 del arreglo 2) y mostrar
// el contenido de los 3 arreglos de esta forma. valor pos 0 arreglo 1 + valor pos 0 arreglo 2 
// = valor pos 0 arreglo 3 valor pos 1 arreglo 1 + valor pos 1 arreglo 2 = valor pos 1 arreglo 
// 3 

public class ejercicio6 {

      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el tamaño de los arreglos
        System.out.print("Ingrese el tamaño de los arreglos: ");
        int tamano = scanner.nextInt();

        // Declarar arreglos
        int[] arreglo1 = new int[tamano];
        int[] arreglo2 = new int[tamano];
        int[] arreglo3 = new int[tamano];

        // Pedir al usuario los valores para el primer arreglo
        System.out.println("Ingrese valores para el primer arreglo:");
        for (int i = 0; i < tamano; i++) {
            System.out.print("Ingrese el valor en la posición " + i + ": ");
            arreglo1[i] = scanner.nextInt();
        }

        // Pedir al usuario los valores para el segundo arreglo
        System.out.println("Ingrese valores para el segundo arreglo:");
        for (int i = 0; i < tamano; i++) {
            System.out.print("Ingrese el valor en la posición " + i + ": ");
            arreglo2[i] = scanner.nextInt();
        }

        // Calcular la suma de los elementos correspondientes y almacenar en el tercer arreglo
        for (int i = 0; i < tamano; i++) {
            arreglo3[i] = arreglo1[i] + arreglo2[i];
        }

        // Mostrar los resultados
        System.out.println("Resultados:");
        for (int i = 0; i < tamano; i++) {
            System.out.println(arreglo1[i] + " + " + arreglo2[i] + " = " + arreglo3[i]);
        }
    }
}