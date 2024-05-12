package POO3;

import java.util.Scanner;

public class anioBisiesto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int año;

        System.out.println("Dame el año para saber si es bisiesto: ");
        año = sc.nextInt();

        if (esBisiesto(año)) {
            System.out.println(año+ " es un año bisiesto");
        } else {
            System.out.println(año+ " no es un año bisiesto");
        }
        
    }

    public static boolean esBisiesto(int año) {

        if( (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0) ) {
            return true;
        }else{
           return false;
        }

    }
        
}
