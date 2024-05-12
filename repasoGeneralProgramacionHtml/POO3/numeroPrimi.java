package POO3;

import java.util.Scanner;

public class numeroPrimi {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;

        do {

        System.out.println("Dame un numero para determinar si el numeroe es primo.");
        numero = sc.nextInt();

        if (esPrimo(numero)) {
            System.out.println("El numero "+numero+" es primo");
        } else {
            System.out.println("El numero "+numero+" no es primo");
        }
        
            } while (numero != 0);

    }

    public static boolean esPrimo(int numero) {

    if (numero <= 1) {
        return false;
    }

    for (int i = 2; i < Math.sqrt(numero); i++) {
            if(numero % i == 0) {
                return false;
            }
    }
    return true;
    }
    
}
