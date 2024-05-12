package ChatGPT2.cosas;

import java.util.Scanner;

public class operadores {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numero1, numero2;

        System.out.println("dame el primer numero entero: ");
        numero1 = sc.nextInt();

        System.out.println("dame e segundo numero entero: ");
        numero2 = sc.nextInt();

        System.out.println("escoge una de ls opciones: ");
        int operacion = sc.nextInt();

        switch (operacion) {
            case 1:
            System.out.println("La suma de los numeros es: "+sumar(numero1, numero2));   
            break;

            case 2:
            System.out.println("la resta es: "+restar(numero1, numero2));
            break;

            case 3:
            System.out.println("la multiplicacion es: "+multiplicar(numero1, numero2));
            break;

            case 4:
            System.out.println("La division es: "+dividir(numero1, numero2));
            break;

            default:
            System.out.println("Operacion no valida...");
                break;
        }

    }

    public static int sumar(int a, int b) {
        return a+b;
    }

    public static int restar(int a, int b) {
        return a-b;
    }

    public static int multiplicar(int a, int b) {
        return a*b;
    }

    public static int dividir(int a, int b) {
        return a/b;
    }
    
}
