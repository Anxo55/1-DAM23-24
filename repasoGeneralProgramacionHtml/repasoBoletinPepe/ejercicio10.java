package repasoBoletinPepe;

import java.util.Scanner;

public class ejercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int suma = 0;
        //int contador = 0;

        for(int i=1; i<=15; i++) {
            System.out.println("Dame el valor "+i+": ");
            numero = sc.nextInt();
          //  contador++;
            suma += numero;
        }

        System.out.println("La suma de los numeros es: "+suma);

    }
    
}
