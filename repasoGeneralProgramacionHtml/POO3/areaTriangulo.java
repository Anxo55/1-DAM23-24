package POO3;

import java.util.Scanner;

public class areaTriangulo {

    public static double areaTriangulo(double base, double altura) {

        double area;
        area = (base * altura) / 2;
        return area;

    }

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        double base, altura;

        System.out.println("Dame la base: ");
        base = sc.nextDouble();

        System.out.println("Dame la altura: ");
        altura = sc.nextDouble();

        System.out.println("El area del triangulo es: "+areaTriangulo(base, altura));

    }
    
}
