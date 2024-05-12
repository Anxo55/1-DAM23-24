// package practicas;

import java.util.Scanner;

public class ordenAscendente {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Dame el numero 1 y hacer una cadena ascendente hasta 10: ");
        numero = sc.nextInt();

        while (numero <10) {
            numero++;
            System.out.println(numero);
        }

    }
    
}
