package practicas2;

import java.util.Scanner;

// Crea un programa que tome dos números enteros y muestre cuál es el mayor.

public class numeroMayor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double numero1, numero2;

        System.out.println("Dame el primer valor: ");
        numero1 = sc.nextDouble();

        System.out.println("Dame el segundo valor: ");
        numero2 = sc.nextDouble();

        if(numero1>numero2) {
            System.out.println("El numero "+numero1+ " es mayor que el numero "+numero2);
        }else{
            System.out.println("El numero "+numero2+ " es mayor que el numero "+numero1);
        }


        
    }
    
}
