package practicaJavaVarios;

import java.util.Scanner;

// Utilizar un ciclo for para imprimir los números impares del 1 al 19.

public class forImpares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i=1; i <=19; i+=2) {
            int numero = i;

            System.out.println(numero);
        }
        
    }
    
}
