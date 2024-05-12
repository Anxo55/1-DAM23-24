package practicaJavaVarios;

import java.util.Scanner;

// Utilizar un ciclo for para imprimir los números pares del 2 al 20.

public class forPares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 20; i++) {            
            int numero = i;

            if(numero % 2 == 0) {
                System.out.println("Numero par: "+numero);
            }
        }
        
    }
    
}
