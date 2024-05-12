package cuatro.propuestos;

import java.util.Arrays;

//tenemos que hacer la siguiente matriz: 
//1 1 1 1 1
//1 2 3 4 5  pos(fila i, coli) = pos(fila i, col j-1) + pos(fila i-1, col j)
//1 3 6 10 15
//1 4 10 20 35
//1 5 15 35 70

import java.util.Scanner;

public class Propuesto1 {

   public static void ver(int arra[][]) {
        int filas = arra.length;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < filas; j++) {
                System.out.print(arra[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas;

        System.out.println("Dime las filas: ");
        filas = sc.nextInt();

        int arr[][] = new int[filas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == j) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                }
            }
        }

        // Mostrar la matriz
        System.out.println("Matriz generada:");
        ver(arr);
    }
}