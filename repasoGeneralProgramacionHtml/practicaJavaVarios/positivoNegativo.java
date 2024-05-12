package practicaJavaVarios;

// Utilizar un if para determinar si un número ingresado por el usuario es positivo o negativo.

import java.util.Scanner;

public class positivoNegativo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        do {
            
        System.out.println("Dame un numero negativo o positivo: ");
        numero = sc.nextInt();

        if (numero > 0) {
            System.out.println("El numero "+numero+" es positivo");
        } else if(numero < 0){
            System.out.println("El numero "+numero+" es negativo");
        }

        } while (numero != 0);

        System.out.println("Pulsaste el 0, saliendo del ejercicio...");
        
    }
    
}
