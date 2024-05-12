package POO;

import java.util.Scanner;

// Diseña una clase Calculadora que tenga métodos para realizar operaciones matemáticas como suma, resta, multiplicación y división.

public class Calculadora {


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

    public static int menu() {
        Scanner sc = new Scanner(System.in);

        int numero1, numero2;
        int eleccion;
        boolean repetir = true;

        do {
            
       System.out.println("Dame el primer numero entero: ");
        numero1 = sc.nextInt();

        System.out.println("Dame el segundo numero entero: ");
        numero2 = sc.nextInt();

        System.out.println("(S)Suma, (R)Resta, (M)Multiplicacion, (D)Division, (Q) Salir");
        eleccion = sc.next().charAt(0);

        switch (eleccion) {
            case 'S':
                System.out.println("El resultado es: "+sumar(numero1, numero2));
                break;

            case 'R':
                System.out.println("El resultado es: "+restar(numero1, numero2));
                break;

            case 'M':
                System.out.println("El resultado es: "+multiplicar(numero1, numero2));    
                break;

            case 'D':
                System.out.println("El resultado es: "+dividir(numero1, numero2));    
                break;

            case 'Q':
                repetir = false;
                System.out.println("Saliendo del programa...");
                break;    
            default:
            System.out.println("Operacion invalida");
            break;
        }
          } while (repetir);

          return menu();

    }


      public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        
        System.out.println(menu());

    }


    
}
