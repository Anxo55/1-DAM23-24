package tres.boletin;

import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int total = 0;

        do {
            
        System.out.println("Dame numero enteros: ");
        numero = sc.nextInt();

        if(numero>0 || numero <0) {
            total += numero;
        }else{
            System.out.println("El numero es cero, cerrando el programa");
        }
        } while (numero != 0);

        System.out.println("La suma de los numeros es: "+total);
        
    }
    
}
