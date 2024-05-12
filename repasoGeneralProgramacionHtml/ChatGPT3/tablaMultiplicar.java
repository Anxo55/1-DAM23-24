package ChatGPT3;

import java.util.Scanner;

// Pide al usuario un número y muestra la tabla de multiplicar de ese número del 1 al 10. 
// Utiliza un bucle while para generar la tabla.

public class tablaMultiplicar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Dame un numero por consola para hacer su tabla de multiplicar: ");
        numero = sc.nextInt();

        System.out.println("La tabla de multiplciar de "+numero+ " es: ");

        int numeroMultiplica = 1;

        while (numeroMultiplica <=10) {
            int resultado;
            resultado = numero * numeroMultiplica;
            System.out.println(numero+" x "+numeroMultiplica+ " = "+resultado);
            numeroMultiplica++;
        }
        
    }

}







