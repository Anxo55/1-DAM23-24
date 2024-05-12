package practicaJavaVarios;

import java.util.Scanner;

// Utilizar un ciclo do-while para pedir al usuario que ingrese un número entre 1 y 10, 
// y repetir la solicitud hasta que ingrese un número válido.

public class repeticionNumeroValido {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

         do {

        System.out.println("Dame un numero entero: ");
        numero = sc.nextInt();

        System.out.println("El "+numero+" entra en el bucle");

        } while (numero >=1 && numero <=10);

        System.out.println("Te pasaste, pusiste el "+numero+ " y ese numero no entra en el bucle.");
        
    }
    
}
