package practicas2;

import java.util.Scanner;

// Crea una clase llamada Calculadora con métodos para 
// sumar, restar, multiplicar y dividir dos números. 
// Luego, utiliza esta clase en un programa que realice
//  operaciones aritméticas.

public class Calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        menuOperador();
        
    }

    public static void menuOperador() {
        Scanner sc = new Scanner(System.in);

        double numero1, numero2;
        char elecion;

        System.out.println("Dame el primer valor: ");
        numero1 = sc.nextDouble();

        System.out.println("Dame el segundo valor: ");
        numero2 = sc.nextDouble();

        System.out.println("suma(S), resta(R), multiplicacion(M), division(D)");
        elecion = sc.next().charAt(0);

        switch (elecion) {
            case 'S':
                System.out.println("La suma de los numeros es: "+sumar(numero1, numero2));
                break;

            case 'R':
                System.out.println("La resta de los numeros es: "+restar(numero1, numero2));
                break;
                
            case 'M':
                System.out.println("La multiplicacion de los numeros es: "+multiplciar(numero1, numero2));
                break;    

            case 'D':
                System.out.println("La division de los numeros es: "+dividir(numero1, numero2));
                break;    
        
            default:
                break;
        }


    }

    public static double sumar(double numero1, double numero2) {
        return numero1 + numero2;
    }

    public static double restar(double numero1, double numero2) {
        return numero1 - numero2;
    }

    public static double multiplciar(double numero1, double numero2) {
        return numero1 * numero2;
    }

    public static double dividir(double numero1, double numero2) {
        return numero1 / numero2;
    }   
    
}

