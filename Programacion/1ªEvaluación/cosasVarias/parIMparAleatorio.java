package cosasVarias;

import java.util.Random;
import java.util.Scanner;

public class parIMparAleatorio {

     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numero;

        Random random = new Random();

        for(int i=0; i<10; i++) {
            numero = random.nextInt(100);
            System.out.println("El numero es: "+numero);

            if (esPar(numero)) {
                System.out.println("EL numero es par.");
            } else {
                    System.out.println("El numero es impar.");
            }
        }

    }

    public static boolean esPar(int numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}