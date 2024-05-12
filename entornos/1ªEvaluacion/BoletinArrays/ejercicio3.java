package BoletinArrays;

import java.util.Scanner;

// 3) Crea un array o arreglo unidimensional con un tamaño de 10, inserta los valores
// numéricos que desees de la manera que quieras (manualmente o por consola) y muestra
// por pantalla la media de valores del array.

public class ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] miArray = new int[10];
        int contador=0;
        int suma = 0;

        for(int i=0; i<miArray.length; i++) {
            System.out.println("Dame los 10 valores del array: ");
            miArray[i] = sc.nextInt();
            suma += miArray[i];
            contador++;
        }

        for (int numero : miArray) {
            System.out.println("Valor "+numero);
            
        }

        double media =  (double) suma / contador;

        System.out.println("La media de los valores es: "+media);
        

    }
    
}
