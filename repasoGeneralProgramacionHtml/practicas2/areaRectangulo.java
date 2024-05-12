package practicas2;

import java.util.Scanner;

// Define una clase llamada Rectangulo con atributos ancho y alto. 
// Agrega un método calcular_area que calcule y 
// devuelva el área del rectángulo.

public class areaRectangulo {

    public static int calcularAreaRectangulo(int ancho, int alto) {
        int area;
        area = ancho * alto;
        return area;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ancho, alto;

        System.out.println("Dame el ancho del rectangulo: ");
        ancho  = sc.nextInt();

        System.out.println("Dame el alto del rectangulo: ");
        alto = sc.nextInt();

        System.out.println("El area del reactangulo es: "+calcularAreaRectangulo(ancho, alto));
        
    }


}
