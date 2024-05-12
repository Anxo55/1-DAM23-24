package ChatGPT.basicos;

import java.util.Scanner;

public class Calculadora {

    public static int sumar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static int restar(int numero1, int numero2) {
        return numero1-numero2;
    }

    public static int multiplicar(int numero1, int numero2) {
        return numero1 * numero2;
    }

    public static int dividir(int numero1, int numero2) {
        return numero1 / numero2;
    }

    // public static int menu(int numero1, int numero2) {
        
    // }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean seguir = true;

        do {
            
        

        System.out.println("(S) SUMA, (R) RESTA, (M) MULTIPLICAR, (D) DIVIDIR, (Q) SALIR");
        char eleccion = sc.next().charAt(0);

        switch (eleccion) {
            case 'S':
                int numero1, numero2;
                System.out.println("Dame el primer entero: ");
                numero1 = sc.nextInt();
                System.out.println("Dame el segundo entero: ");
                numero2 = sc.nextInt();
                System.out.println("La suma de los numeros es: "+ sumar(numero1, numero2));
                break;

            case 'R':
                System.out.println("Dame el primer entero: ");
                numero1 = sc.nextInt();
                System.out.println("Dame el segundo entero: ");
                numero2 = sc.nextInt();
                System.out.println("La resta de los numeros es: " + restar(numero1, numero2));
                break;

            case 'M':
                System.out.println("Dame el primer entero: ");
                numero1 = sc.nextInt();
                System.out.println("Dame el segundo entero: ");
                numero2 = sc.nextInt();  
                System.out.println("La multiplicacion de los numeros es: " + multiplicar(numero1, numero2));
                break;

            case 'D': 
                System.out.println("Dame el primer entero: ");
                numero1 = sc.nextInt();
                System.out.println("Dame el segundo entero: ");
                numero2 = sc.nextInt();  
                System.out.println("La division de los numerops es: " + dividir(numero1, numero2));
                break;

            case 'Q':
                seguir = false;
                System.out.println("Saliendo del programa...");    
                break;

            default:
            System.out.println("Operacion no valida, vuelve a intentarlo");
                break;
        }
        } while (seguir);
        
    }
    
}
