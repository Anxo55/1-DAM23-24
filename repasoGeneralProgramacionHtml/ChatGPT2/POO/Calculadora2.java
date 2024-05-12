package ChatGPT2.POO;

import java.util.Scanner;

public class Calculadora2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero1, numero2;

        System.out.println("dame el primer entero: ");
        numero1 = sc.nextInt();

        System.out.println("dame el segundo entero: ");
        numero2 = sc.nextInt();

        System.out.println("la suma es: "+sumar(numero1, numero2));
        System.out.println("la resta es: "+restar(numero1, numero2));
        System.out.println("la multiplicacion es: "+multiplicar(numero1, numero2));
        System.out.println("la division es: "+dividir(numero1, numero2));


        
    }

    public static int sumar(int a,int b) {
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
