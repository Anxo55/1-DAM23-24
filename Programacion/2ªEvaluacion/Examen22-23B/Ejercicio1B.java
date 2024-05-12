import java.util.Scanner;

public class Ejercicio1B {

// Pedir por teclado la introducción de una tabla de 10 elementos numéricos enteros.
// Pedir por teclado un valor entero al usuario y desplace dicho número de veces las posiciones del array.
// Los números que salgan por el final del ARRAY deberán entrar de nuevo por el principio del mismo.


public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que introduzca los 10 elementos numéricos enteros
        int[] array = new int[10];
        System.out.println("Introduce 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        
        // Pedir al usuario que introduzca el número de desplazamiento
        System.out.print("Introduce el número de desplazamiento: ");
        int desplazamiento = scanner.nextInt();
        
        // Realizar el desplazamiento
        desplazarArray(array, desplazamiento);
        
        // Mostrar el array desplazado
        System.out.println("Array desplazado:");
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
    }
    
    // Método para desplazar el array
    public static void desplazarArray(int[] array, int desplazamiento) {
        int[] temp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            temp[(i + desplazamiento) % array.length] = array[i];
        }
        // Copiar el array desplazado de vuelta al array original
        System.arraycopy(temp, 0, array, 0, array.length);
    }
}
    

