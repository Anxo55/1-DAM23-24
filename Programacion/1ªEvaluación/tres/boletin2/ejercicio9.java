package tres.boletin2;

// 9. Escribir todos los números del 100 al 0 de 7 en 7.

import java.util.Scanner;

public class ejercicio9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i =0; i<=100; i+=7) {
            System.out.println(i);
        }
        
    }
    
}
