package pruebaRepaso;

import java.util.Scanner;

// Metodo de multiplicacion rusa, consiste en multiplciar sucesivamente por 2 el multiplicando
// y dividir por 2 el multiplicador hasta que el multiplicador tome el valor 1, Luego se suman todos los multiplicandos correspondientes
// a los multiplicadores pares.

public class Ejercicio4A {

     public static int multiplicacionRusa(int multiplicando, int multiplicador) {
        int resultado = 0;

        while (multiplicador > 0) {
            if (multiplicador % 2 != 0) {
                resultado += multiplicando;
            }
            multiplicando *= 2;
            multiplicador /= 2;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el multiplicando: ");
        int multiplicando = sc.nextInt();

        System.out.println("Dame el multiplicador");
        int multiplicador = sc.nextInt();

        int resultado = multiplicacionRusa(multiplicando, multiplicador);
        System.out.println("El resultado de la multiplicación rusa es: " + resultado);
    }
}
