// package Examen22-23A;

// Programa que pida al usuario la introducción de dos cadenas de caracteres.
// A continuación construya una tercera cadena intercalando las palabras de las cadenas recibidas.
// Muestre dicha cadena por pantalla.

import java.util.Scanner;

public class Ejercicio3A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Introduce la primera cadena: ");
        String cadena1 = scanner.nextLine();
        System.out.print("Introduce la segunda cadena: ");
        String cadena2 = scanner.nextLine();

       
        String[] palabras1 = cadena1.split(" ");
        String[] palabras2 = cadena2.split(" ");

       
        StringBuilder resultado = new StringBuilder();
        int longitud = Math.max(palabras1.length, palabras2.length);
        for (int i = 0; i < longitud; i++) {
            if (i < palabras1.length) {
                resultado.append(palabras1[i]).append(" ");
            }
            if (i < palabras2.length) {
                resultado.append(palabras2[i]).append(" ");
            }
        }

        
        System.out.println("Cadena intercalada: " + resultado.toString().trim());
    }
}
    

