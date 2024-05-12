package repasoBoletinPepe;

import java.util.Scanner;

public class ejercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Dame el valor del numero: ");
            numero = sc.nextInt();

        for(int i=1; i<=numero; i++) {
            System.out.println("Recorrido: "+i);
        }

    }
    
}
