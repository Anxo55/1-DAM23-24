package POO3;

import java.util.Scanner;

public class conversorCelsius {

    public static double celsiusToFarhenheit(double celsius) {
        double farhenheit;

        farhenheit = (celsius * 1.8) + 32;
        return farhenheit;

    }

    public static double farhenheitToCElsius(double farhenheit) {
        double celsius;
        celsius = (farhenheit -32) / 1.8;
        return celsius;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double dato;

        System.out.println("Dame el dato para hacer la conversion: ");
        dato = sc.nextDouble();

        System.out.println(celsiusToFarhenheit(dato));
        System.out.println(farhenheitToCElsius(dato));
    }
    
}
