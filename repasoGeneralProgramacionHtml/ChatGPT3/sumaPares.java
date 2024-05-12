package ChatGPT3;

import java.util.Scanner;

// Crea un programa que calcule la suma de todos los números pares entre 1 y 100. 
// Utiliza un bucle while para iterar a través de los números y un if para verificar si un número es par.

public class sumaPares {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero=0;

        //metodo para mostrar los numeros del 1 al 100
        for (int i = 0; i <= 100; i++) {
            

            if (i % 2 == 0) {
                System.out.println("El numero "+i+ " es par");
            } else {
                System.out.println("El numero "+i+ " es impar");
                
            }
 
        }

        
        
    }
    
}
