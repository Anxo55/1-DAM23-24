package POO2;

import java.util.Scanner;

public class Calculadora {

    static Scanner sc;

    public static void main(String[] args) {
        
       menu();

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

    public static void menu() {
    
        Scanner sc = new Scanner(System.in);

        int escoge;
        boolean repetir = true;

        int numero1, numero2;

        do {
       
        System.out.println("Dame el primer entero: ");
        numero1 = sc.nextInt();

        System.out.println("Dame el segundo numero entero: ");
        numero2 = sc.nextInt();

        System.out.println("1(SUMA), 2(RESTA), 3(MULTIPLICACION), 4(DIVISION), 5(SALIR)");
        escoge = sc.nextInt();

        switch (escoge) {
            case 1:
                System.out.println("La suma de los numeros es: "+sumar(numero1, numero2));
                break;

            case 2:
                System.out.println("La resta de los numeros es: "+restar(numero1, numero2));    
                break;

            case 3:
                System.out.println("La multiplicacion de los numeros es: "+multiplicar(numero1, numero2));    
                break;

            case 4: 
                System.out.println("La division de los numeros es: "+dividir(numero1, numero2));    
                break;

            case 5:
                repetir = false;
                System.out.println("Cerrando el programa con exito...");  
                break;  
        
            default:
                System.out.println("Opcion no valida, intentalo de nuevo");
                break;
        }

        } while (repetir);
       

    }
}
