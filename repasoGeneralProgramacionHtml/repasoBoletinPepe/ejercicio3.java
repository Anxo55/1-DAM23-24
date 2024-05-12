package repasoBoletinPepe;

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        
        do {
            
        System.out.println("Dame un numero entero: ");
        numero = sc.nextInt();

        if(numero % 2 == 0) {
            System.out.println("El numero "+numero+" es par");
        }else{
            System.out.println("El numero "+numero+" es impar");
        }

        if(numero == 0) {
            System.out.println("Sacaste un 0, cerrando el programa");
        }

        } while (numero != 0);
        
    }
    
}
