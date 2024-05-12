package ChatGPT2.POO;

import java.util.Scanner;

// Crea una clase Calculadora con métodos para sumar, restar, multiplicar y dividir dos números.

public class Calculadora {

    public static void main(String[] args) {
        
        
        
        System.out.println("la suma de los numeros es: "+sumar(4, 4));
        System.out.println("la resta de los numeros es: "+restar(5, 4));
        System.out.println("La multiplicacion de los numeros es: "+multiplicar(4, 4));
        System.out.println("La division de los numeros es: "+dividir(4, 2));


    }

    public static double sumar(int numero1, int numero2) {
        return numero1+numero2;
    }

    public static double restar(int numero1, int numero2) {
        return numero1 - numero2;
    }

    public static double multiplicar(int numero1, int numero2) {
        return numero1 * numero2;
    }

    public static double dividir(int numero1, int numero2) {
        return numero1 / numero2;
    }
    
}
