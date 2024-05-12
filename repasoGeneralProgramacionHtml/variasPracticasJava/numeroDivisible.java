package variasPracticasJava;

import java.util.Scanner;

// Un programa que determine si un número ingresado por el usuario es divisible por 5 o no,
//  utilizando una estructura if-else.

public class numeroDivisible {

    public static boolean esDivisiblePorCinco(int numero) {
        if(numero % 5 == 0) {
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Dame un numero entero: ");
        numero = sc.nextInt();

        if (esDivisiblePorCinco(numero)) {
            System.out.println("El numero es divisible por 5");
        }else{
            System.out.println("el numero no es divisible por 5");
        }
        
    }
    
}
