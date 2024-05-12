package segundo.uno;

import java.util.Scanner;

public class SumaInversos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame un entero: ");
        int numero = sc.nextInt();

        double suma = 0;
        int i = 1;
        
        while (i<=numero) {
            suma+=(1.0/i);
            System.out.println(suma); 
            i++;   
            System.out.println(i);
        }
        System.out.println("La suma de los inversos da: "+suma);
    }
    
}
