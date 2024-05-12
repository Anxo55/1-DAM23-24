package tres.boletin2;

// 12. Pedir un número y calcular su factorial.

import java.util.Scanner;

public class ejercicio12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double factorial;
        int numero;

        System.out.print("Introduce un número: ");
        numero = sc.nextInt();

        factorial = 1;
        for (int i = numero; i > 0; i--) {
            factorial = factorial * i;
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
    
}
