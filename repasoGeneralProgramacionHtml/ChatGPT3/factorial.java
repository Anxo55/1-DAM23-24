package ChatGPT3;

import java.util.Scanner;

// Pide al usuario que ingrese un número entero positivo y luego calcula su factorial utilizando un bucle while.

public class factorial {

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, ingrese un número entero positivo: ");
        int numero = sc.nextInt();

        // Verificar si el número es positivo
        if (numero < 0) {
            System.out.println("El número ingresado no es positivo. Por favor, ingrese un número positivo.");
        } else {
            int factorial = 1;
            int i = 1;

            while (i <= numero) {
                factorial *= i;
                i++;
            }

            System.out.println("El factorial de " + numero + " es " + factorial);
        }

        sc.close();
    }
}
