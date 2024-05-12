package cuatro.recursos;

import java.util.Scanner;

public class Fibonacci {

    // 0  +  1 -----> 1
    // 1  +  1 -----> 2
    // 1  +  2 -----> 3
    // 2  +  2 -----> 4
    // 2  +  3 -----> 5

    // orden 0 1 2 3 4 5 6 7 8 9 10
    // termino0 1 1 2 3 5 8 13 21 34 55

    public static int FibonnacciIterativo(int orden) {
        int tcero = 0;
        int tuno = 1;
        int aux = 0;
        

        // System.out.println("fib0: "+tcero);
        // System.out.println("fib1: "+tuno);

        for(int i=0; i<orden-1; i++) {
            aux = tcero + tuno;
            // System.out.println("fib "+(i+2) +": "+aux);
            tcero = tuno;
            tuno=aux;
        }
        return aux;
    }

    public static int FibonnacciRecursivo(int orden) {
        
        if (orden == 0) {
            return 0;
        } else if (orden == 1) {
            return 1;
        } else {
           
            return FibonnacciRecursivo(orden - 1) + FibonnacciRecursivo(orden - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que termino quieres obtener: ");
        int orden = sc.nextInt();

        System.out.println("El termino "+orden+" es: "+FibonnacciIterativo(orden));
        System.out.println("El termino "+orden+" es: "+FibonnacciRecursivo(orden));

    }
    
}
