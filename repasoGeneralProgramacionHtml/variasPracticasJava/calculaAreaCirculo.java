package variasPracticasJava;

import java.util.Scanner;

// Diseña un programa que calcule el área de un círculo 
// con un método que reciba el radio como parámetro.
// PI x r^2

public class calculaAreaCirculo {

    // static final PI=3.14;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radio;

        System.out.println("Dame el radio de la esfera: ");
        radio = sc.nextDouble();

        System.out.println("El area de la esfera es: "+areaEsfera(radio));
        
    }

    public static double areaEsfera(double radio) {
        double area;
        area = 3.14 * (radio*radio);
        return area;
    }
    
}
