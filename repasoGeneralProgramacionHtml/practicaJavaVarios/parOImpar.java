package practicaJavaVarios;

import java.util.Scanner;

// Utilizar un if-else para determinar si un número ingresado por el usuario es par o impar.

public class parOImpar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Dame un numero para determinar si es par o impar: ");
        numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El numero "+numero+ " es par");
        } else {
            System.out.println("El numero "+numero+ " es impar");
        }
        
    }
    
}
