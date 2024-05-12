package uno;

import java.util.Scanner;

public class triangulo {

      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dame el primer lado: ");
        double lado1 = sc.nextDouble();
        
        System.out.print("Dame el segundo lado: ");
        double lado2 = sc.nextDouble();
        
        System.out.print("Dame el tercer lado: ");
        double lado3 = sc.nextDouble();
        
        if (esPosibleFormarTriangulo(lado1, lado2, lado3)) {
            System.out.println("Se puede crear el triangulo.");
        } else {
            System.out.println("No se puede crear el triangulo.");
        }
        
        sc.close();
    }
    
    public static boolean esPosibleFormarTriangulo(double a, double b, double c) {
        
        if (a + b > c && a + c > b && b + c > a) {
            return true; 
        } else {
            return false; 
        }
    }
}
