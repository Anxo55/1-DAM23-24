package Perplexity.POO;

import java.util.Scanner;

public class testCoche {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Coche coche1 = new Coche("Honda", "Civic", 240);
        Coche coche2 = new Coche("Mercedes", "Benz", 200);

        System.out.println(coche1.toString());
        System.out.println(coche2.toString());

        System.out.println("");
        
        coche1.acelerar(10);
        System.out.println(coche1.toString());

        coche2.frenar(20);
        System.out.println(coche2.toString());
        
    }
    
}
