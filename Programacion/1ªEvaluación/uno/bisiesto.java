package uno;

import java.util.Scanner;

public class bisiesto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un año: ");
        int año = sc.nextInt();
        sc.close();
        
        if (esBisiesto(año)) {
            System.out.println(año + " es un año bisiesto.");
        } else {
            System.out.println(año + " no es un año bisiesto.");
        }
    }
    
    public static boolean esBisiesto(int año) {
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
    

