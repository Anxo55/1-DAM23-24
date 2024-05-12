package uno;

import java.util.Random;

// (Ejercicio de dificultad alta) Realiza un programa que genere letras aleatoriamente y determine si son vocales o 
// consonantes

import java.util.Scanner;


public class propuesto8 {
    
    public static void main(String[] args) {
        int cantidadLetras = 1000;
        int cantidadVocales = 0; 
        
        for (int i = 0; i < cantidadLetras; i++) {
            char letra = generarLetraAleatoria();
            String tipo = determinarTipo(letra);
            
            if (tipo.equals("vocal")) {
                cantidadVocales++;
            }
            System.out.println("Letra: " + letra + " es " + tipo);
        }
        
        double porcentajeVocales = (double) cantidadVocales / cantidadLetras * 100;
        System.out.println("El porcentaje de vocales es: " + porcentajeVocales + "%");
    }

    
    public static char generarLetraAleatoria() {
        Random random = new Random();
        char letra;
        int numeroAleatorio = random.nextInt(26) + 97;
        letra = (char) numeroAleatorio;

        return letra;
    }

    
    public static String determinarTipo(char letra) {
        String vocales = "aeiou";

        if (vocales.contains(String.valueOf(letra))) {
            return "vocal";
        } else {
            return "consonante";
        }
    }
}