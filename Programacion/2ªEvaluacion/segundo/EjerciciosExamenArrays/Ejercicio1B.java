package segundo.EjerciciosExamenArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1B {
    
/*
	 * Pedir por teclado la introduccion de una tabla de 10 elementos numericos
	 * enteros
	 * 
	 * Pedir por teclado un valor entero al usuario y desplace dicho numero de veces
	 * las posiciones del array.
	 * 
	 * Los numeros que salgan por el PRINCIPIO del ARRAY deberan entrar de nuevo por
	 * elfinal del mismo
	 */
	
     public static void rotaDerecha(int[] num) {
		int aux = num[num.length - 1];

		for (int i = num.length - 2; i >= 0; i--) {
			num[i + 1] = num[i];
		}

		num[0] = aux;
		System.out.println(Arrays.toString(num));

	}

	public static void rotaIzquierda(int[] num) {
		int aux = num[0];

		for (int i = 0; i < num.length - 1; i++) {
			num[i] = num[i + 1];
		}

		num[num.length - 1] = aux;
		System.out.println(Arrays.toString(num));

	}

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
		System.out.println("¿Cuantas posiciones movemos?: ");
		int pos = sc.nextInt();
		
		for (int i = 0; i < pos; i++) {
			rotaIzquierda(num);
		}

	}

}

