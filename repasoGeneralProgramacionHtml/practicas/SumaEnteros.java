// package practicas;

import java.util.Scanner;

public class SumaEnteros {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero1, numero2;

        System.out.println("Dame el primer entero: ");
        numero1 = sc.nextInt();

        System.out.println("Dame el segundo entero");
        numero2 = sc.nextInt();

        int suma = numero1 + numero2;

        System.out.println(suma);
        
    }
    
}
