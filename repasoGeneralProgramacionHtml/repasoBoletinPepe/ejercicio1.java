package repasoBoletinPepe;

import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int cuadrado;

        do {
            
       System.out.println("Dame un numero entero: ");
        numero = sc.nextInt();

        if(numero>0) {
            cuadrado = numero * numero;
            System.out.println("El cuadrado de "+numero+" es: "+cuadrado);
        }else if(numero < 0){
            System.out.println("Sacaste un numero negativo, cerrando el programa...");
        }

         } while (numero>=0 );

    }
    
}
