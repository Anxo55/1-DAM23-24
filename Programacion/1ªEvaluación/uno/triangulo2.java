package uno;

import java.util.Scanner;

public class triangulo2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double lado1, lado2, lado3;

        System.out.println("Dame el primer lado: ");
        lado1=sc.nextDouble();

        System.out.println("Dame el segundo lado: ");
        lado2 = sc.nextDouble();

        System.out.println("Dame el tercer lado: ");
        lado3 = sc.nextDouble();

        if (esPosibleFormarTriangulo(lado1, lado2, lado3)) {
            System.err.println("Es posible formar triangulo");
        } else {
            System.out.println("No es posible formar triangulo");
        }
    }

    public static boolean esPosibleFormarTriangulo(double a, double b ,double c) {
        
        if(a+b>c && b+c>a && c+a>b) {
            return true;
        }else{
            return false;
        }
    }
    
}
