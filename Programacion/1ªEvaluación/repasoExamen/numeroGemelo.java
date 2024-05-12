package repasoExamen;

import java.util.Scanner;

public class numeroGemelo {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el rango de búsqueda
        System.out.print("Ingrese el valor mínimo del rango: ");
        int minimo = scanner.nextInt();

        System.out.print("Ingrese el valor máximo del rango: ");
        int maximo = scanner.nextInt();

        // Encontrar y mostrar números gemelos en el rango
        System.out.println("Números gemelos en el rango [" + minimo + ", " + maximo + "]:");
        encontrarNumerosGemelos(minimo, maximo);

        scanner.close();
    }

    // Método para verificar si un número es primo
    private static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Método para encontrar y mostrar números gemelos en un rango
    private static void encontrarNumerosGemelos(int minimo, int maximo) {
        for (int i = minimo; i <= maximo - 2; i++) {
            if (esPrimo(i) && esPrimo(i + 2)) {
                System.out.println("(" + i + ", " + (i + 2) + ")");
            }
        }
    }
}