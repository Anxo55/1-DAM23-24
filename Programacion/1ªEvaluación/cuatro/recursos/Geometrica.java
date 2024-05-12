package cuatro.recursos;

import java.util.Scanner;

public class Geometrica {

    // termino enesimo      inicial por la razon a la (n-1)
    // an      =      a1* r elevado a n-1

    // 1----> 1
    // razon ----> 2
    // sef ------> 1*2 = 2
    // ter ->>>>>>> 2*2 = 4
    // cuarto -----> 4*2 = 8

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;

        // Solicitar al usuario los valores de la progresión geométrica
        System.out.print("Ingrese el primer término : ");
        int primerTermino = scanner.nextInt();

        System.out.print("Ingrese la razón : ");
        int razon = scanner.nextInt();

        System.out.print("Ingrese el valor de n : ");
        int n = scanner.nextInt();

        // Calcular y mostrar la progresión geométrica hasta el término enésimo
        int[] progresion = calcularProgresionGeometrica(primerTermino, razon, n);

        System.out.println("Progresión geométrica hasta el término enésimo:");

        for (int i = 0; i < n; i++) {
            System.out.print(progresion[i] + " ");
            suma += progresion[i];
        }

        System.out.println("\nTotal: " + suma);
    }

    
    private static int[] calcularProgresionGeometrica(int primerTermino, int razon, int n) {
        int[] progresion = new int[n];

        for (int i = 0; i < n; i++) {
            progresion[i] = primerTermino * (int) Math.pow(razon, i);
        }

        return progresion;
    }
}
