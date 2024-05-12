// package practicas;

import java.util.Scanner;

public class areaTriangulo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int base, altura, area;

        System.out.println("Dame la base del triangulo: ");
        base = sc.nextInt();

        System.out.println("Dame la altura del triangulo: ");
        altura = sc.nextInt();

        area = (base * altura) / 2;

        System.out.println("El area del triangulo es: "+area);
        
    }
    
}
