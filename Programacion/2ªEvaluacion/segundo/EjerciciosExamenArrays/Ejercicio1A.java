package segundo.EjerciciosExamenArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1A {
    
/*
	 * Pedir por teclado la introduccion de una tabla de 10 elementos numericos
	 * enteros. Eliminar el lemento situado en una situacion en una posicion pedida
	 * por el ususario sin dejar huecos en la tabla. Mostrar la tabla por consola
	 * despues de la eliminacion de dicho elemento
	 */

     public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];

		for (int i = 0; i < num.length; i++) {
			System.out.println("Introduzca un el elemento numérico " + i + ": ");
			num[i] = sc.nextInt();
		}

		System.out.println();
		System.out.println("Elementos introducidos: " + Arrays.toString(num));

		System.out.println();
		System.out.println("¿Cual quiere eliminar?: ");
		int pos = sc.nextInt();

		for (int j = pos; j < num.length; j++) {
			num[j] = num[j + 1];
		}
		num[num.length - 1] = -1;
		
		System.out.println(Arrays.toString(num));
		sc.close();
	}

}

