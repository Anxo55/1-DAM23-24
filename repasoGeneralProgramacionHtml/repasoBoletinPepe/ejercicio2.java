package repasoBoletinPepe;

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do {

        System.out.println("Dame un numero entero: ");
        numero = sc.nextInt();

        if (numero > 0) {
            System.out.println("El numero "+numero+" es par");
        }else if(numero < 0){
            System.out.println("El numero "+numero+ " es impar");
        }else if(numero == 0) {
            System.out.println("Sacaste un  cero, cerrando el programa");
        }

        } while (numero != 0);

    }
    
}
