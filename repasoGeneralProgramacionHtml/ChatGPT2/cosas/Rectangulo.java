package ChatGPT2.cosas;

import java.util.Scanner;

//arear y perimetro del rectangulo

public class Rectangulo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int base, altura;

        System.out.println("Dame la base del rectangulo: ");
        base = sc.nextInt();

        System.out.println("Dame la altura del rectangulo: ");
        altura = sc.nextInt();

        System.out.println("El area del rectangulo es: "+areaRectangulo(base, altura));
        System.out.println("El perimetro del rectangulo es: "+perimetroRectangulo(base, altura));
        
    }

    public static int areaRectangulo(int base, int altura) {
        int area;
        area = base * altura;
        return area;

    }

    public static int perimetroRectangulo(int base, int altura) {
        int perimetro;
        perimetro = 2 * (base + altura);
        return perimetro;
    }
    
}
