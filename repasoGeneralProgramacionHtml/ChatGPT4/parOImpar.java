package ChatGPT4;

import java.util.Scanner;

public class parOImpar {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Determiname si los siguientes numeros son pares o impares: ");

        for (int i = 0; i < 100; i++) {
            i = (int) (Math.random()*100);
            
            if (i % 2 == 0 ) {
                System.out.println("El numero "+i+ " es par");
            } else{
                System.out.println("El numero "+i+ " es impar");
            }
            
        }
        
    }
    
}
