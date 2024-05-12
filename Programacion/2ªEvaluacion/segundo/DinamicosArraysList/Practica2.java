package segundo.DinamicosArraysList;

import java.util.ArrayList;
import java.util.Random;

// Programa que introduzca valores aleatorios entre 0 y 100 en un arraylist y que luego calcule la suma, la media
// el maximo y el minimo de esos numeros. EL tamaño de la lista tambien sera aleatorio y podrá oscilar entre 10
// y 20 elementos ambos inclusive.

public class Practica2 {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Random rand = new Random();

        int tamanoLista = rand.nextInt(11) + 10;

        for (int i = 0; i < tamanoLista; i++) {
            numeros.add(rand.nextInt(101));
        }

        
        int suma = 0;
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        for (int num : numeros) {
            suma += num;
            if (num > maximo) {
                maximo = num;
            }
            if (num < minimo) {
                minimo = num;
            }
        }

        double media = (double) suma / numeros.size();

        // Mostrar resultados
        System.out.println("Lista de números generados: " + numeros);
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media);
        System.out.println("Máximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
    }
}
