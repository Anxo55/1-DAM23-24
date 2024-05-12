package variasPracticasJava;

import java.util.Scanner;

public class sumaEnteros{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = 1;
        int suma = 0;

        do {
            suma += numero;
            numero++;
        } while (numero <= 10);

        System.out.println("La suma de los números enteros del 1 al 10 es: " + suma);
    }

}