package BoletinArrays;

import java.util.Scanner;

// Crea dos arrays o arreglos unidimensionales que tengan el mismo tamaño (se pedirá
// por teclado), en uno de ellos almacenarás nombres de personas como cadenas, en el otro
// array o arreglo ira almacenando la longitud de los nombres, para ello puedes usar la
// función que java ofrece para devolver la longitud de una cadena. Muestra por pantalla el 
// nombre y la longitud que tiene. Puedes usar funciones si lo deseas.

public class ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de los arreglos: ");
        int tamano = sc.nextInt();

        String[] nombres = new String[tamano];
        int[] longitudes = new int[tamano];

        for (int i = 0; i < tamano; i++) {
            System.out.print("Ingrese un nombre: ");
            nombres[i] = sc.next();

            longitudes[i] = nombres[i].length();
        }
        System.out.println(" ");

        System.out.println("Nombres y sus longitudes:");
        for (int i = 0; i < tamano; i++) {
            System.out.println("Nombre: " + nombres[i] + ", Longitud: " + longitudes[i]);
        }
    }
}