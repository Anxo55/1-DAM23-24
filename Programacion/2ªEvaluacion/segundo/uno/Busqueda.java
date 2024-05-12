package segundo.uno;

import java.util.Scanner;

public class Busqueda {

    public static void mostrarArray(int[] arr) {
        int n = arr.length;
        System.out.println("Elementos del array");
        // Imprime los elementos del array
        System.out.print("[ ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    public static boolean isInArray(int[] arr, int num) {
        boolean esta = false;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == num) {
                esta = true;
                break;
            }
        }
        return esta;
    }

    public static boolean isInArrays(int[] arr1, int[] arr2, int num) {
        return isInArray(arr1, num) || isInArray(arr2, num);
    }

    public static void main(String[] args) { 

        int[] array1 = {1, 2, 2, 3, 4, 4, 5, 2};
        int[] array2 = {6, 7, 8, 9, 10};

        Scanner jm = new Scanner(System.in);

        System.out.println("Array 1:");
        mostrarArray(array1);

        System.out.println("Array 2:");
        mostrarArray(array2);

        System.out.println("Dame un entero: ");
        int num = jm.nextInt();

        if (isInArrays(array1, array2, num))
            System.out.println("El número " + num + " está en al menos uno de los arrays.");
        else
            System.out.println("El número " + num + " NO está en ninguno de los arrays.");
    }
}