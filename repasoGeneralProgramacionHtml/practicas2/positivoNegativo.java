package practicas2;

import java.util.Scanner;

// Escribe un programa que pida al usuario un número entero y luego muestre si es positivo, negativo o cero usando estructuras if y else.

public class positivoNegativo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double numeroEntero;

        System.out.println("Dame un numero entero que pueda ser tanto positvo, negativo o cero: ");
        numeroEntero = sc.nextInt();
        
        
            if(numeroEntero > 0) {
                System.out.println("El numero entero es positivo.");
            }

            if (numeroEntero == 0) {
                System.out.println("El numero es cero.");   
            }

            if (numeroEntero < 0) {
                System.out.println("El numero entero es negativo.");
            }

            
        
        
    }
    
}
