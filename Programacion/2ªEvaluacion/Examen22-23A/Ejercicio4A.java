// package Examen22-23A;

// Ingrese un texto de al menos 6 palabras e indique qué tres letras
// han aparecido en el texto más veces, indicando las mismas.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio4A {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un texto
        System.out.print("Ingresa un texto de al menos 6 palabras: ");
        String texto = scanner.nextLine();

        // Convertir el texto a minúsculas para considerar mayúsculas y minúsculas iguales
        texto = texto.toLowerCase();

        // Eliminar caracteres que no sean letras ni espacios
        texto = texto.replaceAll("[^a-z ]", "");

        // Dividir el texto en palabras
        String[] palabras = texto.split("\\s+");

        // Contar la frecuencia de cada letra
        HashMap<Character, Integer> frecuenciaLetras = new HashMap<>();
        for (String palabra : palabras) {
            for (char letra : palabra.toCharArray()) {
                if (Character.isLetter(letra)) {
                    frecuenciaLetras.put(letra, frecuenciaLetras.getOrDefault(letra, 0) + 1);
                }
            }
        }

        // Encontrar las tres letras más repetidas
        char letra1 = ' ';
        char letra2 = ' ';
        char letra3 = ' ';
        int max1 = 0;
        int max2 = 0;
        int max3 = 0;
        for (Map.Entry<Character, Integer> entry : frecuenciaLetras.entrySet()) {
            int frecuencia = entry.getValue();
            if (frecuencia > max1) {
                max3 = max2;
                letra3 = letra2;
                max2 = max1;
                letra2 = letra1;
                max1 = frecuencia;
                letra1 = entry.getKey();
            } else if (frecuencia > max2) {
                max3 = max2;
                letra3 = letra2;
                max2 = frecuencia;
                letra2 = entry.getKey();
            } else if (frecuencia > max3) {
                max3 = frecuencia;
                letra3 = entry.getKey();
            }
        }

        // Mostrar las tres letras más repetidas y su frecuencia
        System.out.println("Las tres letras más repetidas son:");
        System.out.println("1. Letra: " + letra1 + ", Frecuencia: " + max1);
        System.out.println("2. Letra: " + letra2 + ", Frecuencia: " + max2);
        System.out.println("3. Letra: " + letra3 + ", Frecuencia: " + max3);
    }
}