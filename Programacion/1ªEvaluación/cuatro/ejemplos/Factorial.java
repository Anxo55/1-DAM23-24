package cuatro.ejemplos;

import java.util.Scanner;

public class Factorial {

    public static int factorialRepetititvo(int numero) {

        int factorial = 1;
         for(int i = numero; i>0; i--) {
            factorial = factorial *i;
        }
        return factorial;
        
    }

    public static int factRecursivo(int numero) {
        if(numero > 1)
            return numero * factRecursivo(numero-1);// si pones solo numero en vez de numero-1, te salta el error.
        else  
            return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Dime un numero entre 1 y 9: ");
        numero = sc.nextInt();

       
        // System.out.println("El factorial de " + numero + " es: " + factorialRepetititvo(numero));
        System.out.println("El factorial de " + numero + " es: " + factRecursivo(numero));
        
    }
    
}
