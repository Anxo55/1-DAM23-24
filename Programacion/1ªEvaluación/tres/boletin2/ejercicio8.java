package tres.boletin2;

// 8. Pedir un número N, y mostrar todos los números del 1 al N.

import java.util.Scanner;

public class ejercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Dame el numero a llegar: ");
        numero = sc.nextInt();
        System.out.println("El valor a llegar es: "+numero);

        for(int i=1; i<=numero; i++) {
            System.out.println(i);
        }
        
    }
    
}
