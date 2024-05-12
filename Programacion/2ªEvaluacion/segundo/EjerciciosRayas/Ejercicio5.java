package segundo.EjerciciosRayas;

import java.util.Scanner;

// Programa que pida 10 numeros por teclado y que luego muestre los numeros introducidos junto con las palabras "maximo"
// "minimo" al lado del maximo y del minimo respectivamente.

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] miArray = new int[10];

        for(int i=0; i<miArray.length; i++) {
            System.out.println("Dame el valor "+  (i+1) + " :");
            miArray[i] = sc.nextInt();
        }

        String[] leyenda = new String[10];
        int max = miArray[0];
        int min = miArray[0];
        int posMax=0;
        int posMin=0;

        for(int j=0; j<miArray.length; j++) {
            if(miArray[j]<min) {
                min = miArray[j];
                posMin=j;
            }

            if(miArray[j]>max) {
                max = miArray[j];
                posMax=j;
            }
        }
        
            leyenda[posMax] = "maximo";
            leyenda[posMin] = "minimo";
            System.out.println("---numero----leyenda----");
            for(int k=0; k<miArray.length; k++) {
                System.out.println(" "+miArray[k]+ "----"+leyenda[k]+"----");
            }
        
    }
    
}
