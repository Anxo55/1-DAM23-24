package repasosExamen;

import java.util.Scanner;

public class Calculadora {

    public static int sumar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static int restar(int numero1, int numero2) {
        return numero1 - numero2;
    }

    public static int multiplciar(int numero1, int numero2) {
        return numero1 * numero2;
    }

    public static int dividir(int numero1, int numero2) {
        return numero1 / numero2;
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        boolean seguir  = true;

        do {

        System.out.println("Dame el primer numero entero: ");
        int numero1 = sc.nextInt();

        System.out.println("Dame el segundo numero entero: ");
        int numero2 = sc.nextInt();

        
            System.out.println("S(SUMA), R(RESTA), M(MULTIPLICAR), D(DIVIDIR), Q(SALIR)");
            char opcion = sc.next().charAt(0);

        switch (opcion) {
            case 'S':
                System.out.println("La suma de los valores es: "+sumar(numero1, numero2));
                break;

            case 'R':
                System.out.println("La resta de los valores es: "+restar(numero1, numero2));    
                break;

            case 'M':
                System.out.println("La multiplicacion de los valores es: "+multiplciar(numero1, numero2));    
                break;

            case 'D':
                System.out.println("La division de los valores es: "+dividir(numero1, numero2));    
                break;

            case 'Q':
                seguir = false;
                System.out.println("Cerrando el programa tra pulsar (Q)");
                break; 

            default:
                System.out.println("Opcion invalida, vuelve a intentarlo...");
                break;
        }

        } while (seguir);
        
    }

    public static void main(String[] args) {
        menu();        
    }
    
}
