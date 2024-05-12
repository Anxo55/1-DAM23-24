package segundo.uno;

import java.util.Scanner;

// Hacer un programa que calcule las raices de una ecuacion cuadratica.

public class RaizCuadratica {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el coeficiente a:");
        double a = sc.nextDouble();

        System.out.println("Ingrese el coeficiente b:");
        double b = sc.nextDouble();

        System.out.println("Ingrese el coeficiente c:");
        double c = sc.nextDouble();

        double discriminante = b * b - 4 * a * c;

        if (discriminante > 0) {
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las raíces son reales y diferentes.");
            System.out.println("Raíz 1 = " + raiz1);
            System.out.println("Raíz 2 = " + raiz2);
        } else if (discriminante == 0) {
            double raiz = -b / (2 * a);
            System.out.println("La ecuación tiene raíces reales e iguales.");
            System.out.println("Raíz = " + raiz);
        } else {
            double parteReal = -b / (2 * a);
            double parteImaginaria = Math.sqrt(Math.abs(discriminante)) / (2 * a);
            System.out.println("Las raíces son complejas conjugadas.");
            System.out.println("Raíz 1 = " + parteReal + " + " + parteImaginaria + "i");
            System.out.println("Raíz 2 = " + parteReal + " - " + parteImaginaria + "i");
        }
    }
}
