// package practicas;

import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numero;
    
        System.out.println("Dame un numero para determinar si es par o impar");
        numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
        
    }
    
}
