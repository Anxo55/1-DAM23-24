package cosasVarias;

import java.util.Random;

public class MultiploDeDos {
    public static void main(String[] args) {
        // Crear un objeto Random
        Random rand = new Random();

        int[] numerosAleatorios = new int[10]; // Crear un arreglo para almacenar los números aleatorios

        // Generar 10 números aleatorios entre 1 y 100
        for (int i = 0; i < 10; i++) {
            int numero = rand.nextInt(100) + 1; // Generar un número aleatorio entre 1 y 100
            numerosAleatorios[i] = numero;
            if (esMultiploDeDos(numero)) {
                System.out.println(numero + " es múltiplo de 2.");
            } else {
                System.out.println(numero + " no es múltiplo de 2.");
            }
        }

        // Mostrar los números generados aleatoriamente
        System.out.print("Números generados aleatoriamente: ");
        for (int i = 0; i < numerosAleatorios.length; i++) {
            System.out.print(numerosAleatorios[i]);
            if (i < numerosAleatorios.length - 1) {
                System.out.print(", ");
            }
        }
    }

    public static boolean esMultiploDeDos(int numero) {
        return numero % 2 == 0;
    }
}
