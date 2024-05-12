package practicas2;

import java.util.Scanner;

// Crea un programa que solicite tres números al usuario y muestre el número más grande 
// usando estructuras if anidadas.

public class numeroMasGrande {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero1, numero2, numero3;

        System.out.println("Dame el primer entero: ");
        numero1 = sc.nextInt();

        System.out.println("Dame el segundo entero: ");
        numero2 = sc.nextInt();

        System.out.println("Dame el tercer entero: ");
        numero3 = sc.nextInt();

        if(numero1 > numero2 && numero1 >numero3) {
            System.out.println("El numero 1 es el mayor");
        }else if(numero2 > numero1 && numero2 > numero3) {
            System.out.println("El numero 2 es el mayor");
        }else if(numero3 > numero1 && numero3 > numero2) {
            System.out.println("El numero 3 es el mayor");
        }
        
    }
    
}
