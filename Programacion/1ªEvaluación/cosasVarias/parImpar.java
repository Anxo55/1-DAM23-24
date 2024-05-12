package cosasVarias;

import java.util.Random;
import java.util.Scanner;

public class parImpar {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        int numero;
        System.out.println("dame un valor: ");
        numero = sc.nextInt();

            if(esPar(numero)) {
                System.err.println(numero + " es un numero par");
            } else {
                    System.out.println(numero + " es un numero impar");
            }
    }

    public static boolean esPar(int numero) {
        if(numero % 2 == 0){
            return true;
        }else{
            return false;
        }

    }
    
}
