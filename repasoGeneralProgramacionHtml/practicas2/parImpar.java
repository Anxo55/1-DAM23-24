package practicas2;

import java.util.Scanner;

// Escribe un programa que determine si un número es par o impar y muestre un mensaje correspondiente.

public class parImpar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i=1; i<=10; i++) {
            int numero = i;
            numero = (int) (Math.random()*100);

            if(numero % 2 == 0) {
                System.out.println(numero+" es par");
            }else{
                System.out.println(numero+" es impar");
            }
        
        }
        
    }
    
}
