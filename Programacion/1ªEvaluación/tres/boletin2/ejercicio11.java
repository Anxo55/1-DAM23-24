package tres.boletin2;

import java.util.Scanner;

// 11. Diseñar un programa que muestre el producto de los 10 primeros números impares.

public class ejercicio11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int producto=1;
        for(int i=1; i<=19; i+=2) {
            producto*=i;
        }

        System.out.println("El producto es: "+producto);
        
    }
    
}
