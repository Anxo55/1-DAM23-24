package variasPracticasJava;

import java.util.Scanner;

// Escribe un programa que clasifique un número en "positivo," "negativo," o "cero" 
// utilizando una estructura switch.

public class positivoNegativo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.err.println("Dame un valor positivo, negativo o cero: ");
        numero = sc.nextInt();

        switch (numero) {
            case 1 :
                System.out.println("El numero es positivo.");
                break;

            case -1:
                System.out.println("El numero es negativo.");
                break;
                
            case 0: 
                System.out.println("El numero es cero.");
                break;    
        
            default:
            System.out.println("Opcion incorrecta");
                break;
        }
        
    }
    
}
