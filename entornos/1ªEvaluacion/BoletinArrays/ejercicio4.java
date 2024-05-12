package BoletinArrays;

import java.util.Scanner;

// Crea un array o arreglo unidimensional donde tú le indiques el tamaño por teclado y
// crear una función que rellene el array o arreglo con los múltiplos de un numero pedido
// por teclado. Por ejemplo, si defino un array de tamaño 5 y elijo un 3 en la función, el
// array contendrá 3, 6, 9, 12, 15. Muéstralos por pantalla usando otra función distinta.

public class ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamanho;
       
        System.out.println("Dame el tamaño del array: ");
        tamanho = sc.nextInt();

        int[] miArray = new int[tamanho];
        
        System.out.print("Ingrese el número para generar los múltiplos: ");
        int numero = sc.nextInt();
        
        for (int i = 0; i < miArray.length; i++) {
            miArray[i] = numero * (i + 1);
        }

        System.out.print("Elementos del arreglo: ");
        for (int elemento : miArray) {
            System.out.print(elemento + " ");
        }
    }
}
