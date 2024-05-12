package segundo.uno;

import java.util.Scanner;

public class Busqueda2 {

    public static void mostrarArray(int[] arr) {
        int n = arr.length;
        System.out.println("Elementos del array");
        // Imprime los elementos del array
        System.out.print("[ ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
        System.out.println();
    }

    public static void main(String[] args) { 

        int[] array1 = {1, 2, 2, 3, 4, 4, 5, 2};
        int[] array2 = {1, 1, 2, 3, 4, 7, 9,2,6};

        Scanner jm = new Scanner(System.in);

        int n = array1.length;
        int m = array2.length;

        System.out.println("Array 1:");
        mostrarArray(array1);

        System.out.println();

        System.out.println("Array 2:");
        mostrarArray(array2);

        for(int i=0; i<n; i++) {

            for(int j=0; j<m; j++) {

                if(array1[i]==array2[j]) {
                    System.out.println("El valor: "+array1[i]+" esta repetido en posicion "+i
                    +" de A y posicion " + j + " de B");
                }
                
            }//recorro B para cada elemento de A
        }//recorro A
    
    }
}
