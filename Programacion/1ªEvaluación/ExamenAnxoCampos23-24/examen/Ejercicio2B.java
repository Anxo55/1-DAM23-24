// Dos números primos son primos gemelos si su diferencia es igual a 2. Es decir, una pareja de la 
// forma (p, p+2) siendo p un número primo 
// es una pareja de números primos. 

// Por ejemplo, las parejas (3, 5) y (11,13) son dos parejas de primos gemelos. Listar por pantalla 
// todos los números gemelos entre 0 y 1000.

import java.util.Scanner;

public class Ejercicio2B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor mínimo del rango: ");
        int minimo = scanner.nextInt();

        System.out.print("Ingrese el valor máximo del rango: ");
        int maximo = scanner.nextInt();

        System.out.println("Números gemelos en el rango [" + minimo + ", " + maximo + "]:");
        encontrarNumerosGemelos(minimo, maximo);

        scanner.close();
    }

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

    private static void encontrarNumerosGemelos(int minimo, int maximo) {
        for (int i = minimo; i <= maximo - 2; i++) {
            if (esPrimo(i) && esPrimo(i + 2)) {
                System.out.println("(" + i + ", " + (i + 2) + ")");
            }
        }
    }
    
}
