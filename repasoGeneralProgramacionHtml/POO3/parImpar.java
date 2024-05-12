package POO3;

import java.util.Scanner;

public class parImpar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;

       for (int i = 0; i <=10; i++) {
         numero = i;
         numero = (int) (Math.random()*100);
 
         if (numero % 2 == 0) {
            System.out.println("El numero " +numero+" es par.");
         } else {
            System.out.println("El numero " +numero+" es impar.");
         }
       }
        
        
    }
}
