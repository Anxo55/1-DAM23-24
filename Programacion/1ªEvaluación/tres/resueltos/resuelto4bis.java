package tres.resueltos;

import java.util.Scanner;

public class resuelto4bis {

    public static void esAmstrong(int numero) {
        int cifra1, cifra2, cifra3, cifra4;
        cifra1 = numero/1000;
        cifra2 = (numero-1000*cifra1)/100;
        cifra3 = (numero -1000*cifra1 - 100*cifra2)/10;
        cifra4 = numero -1000 * cifra1 - 100*cifra2- 10*cifra3;

        int suma = (int )(Math.pow(cifra1,4)+Math.pow(cifra2, 4)+Math.pow(cifra3, 4)+Math.pow(cifra4, 4));

        if (numero == suma) {
            System.out.println("El numero "+numero+ " es Amstrong");
        }
    }

    public static void main(String[] args) {
        
        for(int i=1000; i<10000; i++) {
            esAmstrong(i);
        }
        
    }
    
}
