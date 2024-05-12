// package Arrays;

import java.util.Scanner;

public class practica3b {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el tamaño del array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Introduce el número para la posición " + i + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Los números introducidos son: ");
        for (int number : array) {
            System.out.println(number);
        }

        scanner.close();
    }
}
