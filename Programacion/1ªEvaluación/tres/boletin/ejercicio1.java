package tres.boletin;

import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            
        System.out.println("Dame un numero entero: ");
        numero = sc.nextInt();

        int cuadrado;
        cuadrado = numero * numero;

        
        if(numero>=0) {
            System.out.println("El cuadrado del numero es: "+cuadrado);
        }else{
            System.out.println("Numero negativo, cerrando codigo");
        }

         } while (numero>0);
        
    }
    
}
