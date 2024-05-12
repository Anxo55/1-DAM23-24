package POO4;

import java.util.Scanner;

public class Calculadora {

static Scanner sc;

    public static void menuCalculadora() {

        Scanner sc = new Scanner(System.in);

        int numero1, numero2;
        char operacion;
        boolean seguir = true;

        do {
            
        System.out.println("Dame el primer entero: ");
        numero1 = sc.nextInt();

        System.out.println("Dame el segundo entero: ");
        numero2 = sc.nextInt();

        System.out.println("(S)SUMA, (R)RESTA, (M)MULTIPLICACION, (D)DIVIISON, (Q)SALIR");
        operacion = sc.next().charAt(0);

        switch (operacion) {
            case 'S':
                System.out.println(sumar(numero1, numero2));
                break;
        
            case 'R':
                System.out.println(restar(numero1, numero2));    
                break;

            case 'M':
                System.out.println(multiplicar(numero1, numero2));    
                break;

            case 'D':
                System.out.println(dividir(numero1, numero2));    
                break;

            case 'Q':
                seguir = false;
                System.out.println("Saliendo del programa...");    
                break;

            default:
                System.out.println("Operacion no valida, intentelo de nuevo.");
                break;
        }
            
    } while (seguir);     

    }

    public static int sumar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static int restar(int numero1, int numero2) {
        return numero1 - numero2;
    }

    public static int multiplicar(int numero1, int numero2) {
        return numero1*numero2;
    }

    public static int dividir(int numero1, int numero2)  {
        return numero1 / numero2;
    }


    public static void main(String[] args) {
        
        menuCalculadora();

    }
    
}
