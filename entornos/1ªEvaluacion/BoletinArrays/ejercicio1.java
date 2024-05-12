package BoletinArrays;

import java.util.Scanner;

// Crea un array o arreglo unidimensional con un tamaño de 5, asígnale los valores
// numéricos manualmente (los que tú quieras) y muestralos por pantalla

public class ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] miArray = new int[5];

        for(int i=0; i<miArray.length; i++) {
            System.out.println("Dame el valor: "+i);
            miArray[i] = sc.nextInt();
        }

        for (int numero : miArray) {
            System.out.println("Valor: "+numero);
        }
        
    }
    
}
