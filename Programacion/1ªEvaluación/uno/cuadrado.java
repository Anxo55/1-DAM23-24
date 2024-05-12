package uno;

// Pidiendo el lado del cuadrado, dar el perimetro el area y la diagonal

import java.util.Scanner;

public class cuadrado {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la longitud del lado del cuadrado: ");
        double lado = sc.nextDouble();

        double diagonal = lado * Math.sqrt(2);
        double perimetro = 4 * lado;
        double area = lado * lado;

        // Mostrar los resultados
        System.out.println("Diagonal del cuadrado: " + diagonal);
        System.out.println("Perímetro del cuadrado: " + perimetro);
        System.out.println("Area del cuadrado: " + area);
        sc.close();
    }
}

