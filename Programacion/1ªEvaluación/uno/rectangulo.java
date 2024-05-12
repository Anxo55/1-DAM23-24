package uno;

// Calculo de diagonal ¡, perimetro y area de un rectangulo pidiendo sus DOS LADOS. 

import java.util.Scanner;

public class rectangulo {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame la longitud del primer lado: ");
        double lado1 = sc.nextDouble();

        System.out.println("Dame la longitud del segundo lado: ");
        double lado2 = sc.nextDouble();

        double diagonal = Math.sqrt(Math.pow(lado1, 2) + Math.pow(lado2, 2));

        double perimetro = 2 * (lado1 + lado2);
        double area = lado1 * lado2;

        System.out.println("La diagonal del rectángulo es: " + diagonal);
        System.out.println("El perímetro del rectángulo es: " + perimetro);
        System.out.println("El área del rectángulo es: " + area);

        sc.close();
    }
}

