package cuatro.recursos;

import java.util.Scanner;

import dos.resueltos.resuelto1;

public class Potencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base;
        int exponente;
        int potencia = 1;

        System.out.println("Dame la base: ");
        base = sc.nextInt();

        System.out.println("Dame el exponente: ");
        exponente = sc.nextInt();

       for(int i=0; i<exponente; i++) {
        potencia *= base;
       }

       System.out.println("La potencia es: "+potencia);
        
    }

    
    
}
