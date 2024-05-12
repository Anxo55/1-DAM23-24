package cuatro.recursos;

import java.util.Scanner;

public class Piramide {

   public static void imprimirPiramideNumerica(int altura, int nivel) {
        if (nivel > altura) {
            return;
        }

        imprimirEspacios(altura - nivel);

        imprimirNumeros(nivel);

       System.out.println();

        imprimirPiramideNumerica(altura, nivel + 1);
    }

    public static void imprimirEspacios(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            System.out.print(" ");
        }
    }

    public static void imprimirNumeros(int cantidad) {
        for (int i = 1; i <= cantidad; i++) {
            System.out.print(i);
        }
        for (int i = cantidad - 1; i >= 1; i--) {
            System.out.print(i);
        }
    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame la altura de la piramide: ");
        int altura = sc.nextInt(); 
        imprimirPiramideNumerica(altura, 1);
    }

    
}