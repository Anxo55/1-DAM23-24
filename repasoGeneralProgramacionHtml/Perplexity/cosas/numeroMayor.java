package Perplexity.cosas;

import java.util.Scanner;

public class numeroMayor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero1, numero2;

        System.out.println("Dame el primer numero entero: ");
        numero1 = sc.nextInt();

        System.out.println("Dame el segundo numero entero: ");
        numero2 = sc.nextInt();

        int mayor = numeroMasGrande(numero1, numero2);

        System.out.println("El numero mas grande es: "+mayor);

        
    }

    public static int numeroMasGrande(int numero1, int numero2) {
        if (numero1 > numero2) {
            return numero1;
        } else {
            return numero2;
            
        }
    }
    
}
