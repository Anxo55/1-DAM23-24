package tres.sucesiones;

import java.util.Scanner;

public class AritmeticaArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;

        System.out.print("Ingrese el primer término : ");
        int termino = scanner.nextInt();

        System.out.print("Ingrese la razón : ");
        int razon = scanner.nextInt();

        System.out.print("Ingrese el valor de numero: ");
        int numero = scanner.nextInt();

        int[] progresion = calcularProgresionAritmetica(termino, razon, numero);

        System.out.println("Progresión aritmética hasta el término enésimo:");

        for (int i = 0; i < numero; i++) {
            System.out.print(progresion[i] + " ");
            suma += progresion[i];
            
        }
        System.out.println("Total: "+suma);
    }


    private static int[] calcularProgresionAritmetica(int termino, int razon, int numero) {
        int[] progresion = new int[numero];

        for (int i = 0; i < numero; i++) {
            progresion[i] = termino + i * razon;
        }

        return progresion;
    }
}