package repasoExamen;

import java.util.Scanner;

public class numeroPerfecto {
public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.print("Ingrese un número positivo: ");
        int numero = scanner.nextInt();

        // Verificar si el número es perfecto
        if (esNumeroPerfecto(numero)) {
            System.out.println(numero + " es un número perfecto.");
        } else {
            System.out.println(numero + " no es un número perfecto.");
        } 

        scanner.close();
    }

    // Método para verificar si un número es perfecto
    private static boolean esNumeroPerfecto(int numero) {
        if (numero <= 0) {
            return false;
        }

        int sumaDivisores = 0;
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }

        return sumaDivisores == numero;
    }
}
