package segundo.EjerciciosRayas;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] miArray = new int[10];

        for(int i=0; i<miArray.length; i++) {
            System.out.println("Dame los valores del array "+ (i+1)+" :");
            miArray[i] = sc.nextInt();
        }

        System.out.println();
        
        for(int k=miArray.length-1; k>=0;k-- ) {
            System.out.println("Valores dados la vuelta");
            System.out.println(miArray[k]);
        }
        
    }
    
}
