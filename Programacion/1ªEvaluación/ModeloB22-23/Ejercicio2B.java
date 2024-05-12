//package ModeloB22-23;

import java.util.Scanner;

public class Ejercicio2B {

    //	Introducir dos números por teclado y mostrar si son novios o no.
//	Con un ejemplo es más fácil de entender. 48 y 75 son números novios
//	porque: La suma de los divisores de cada número por separado es
//	igual a la suma de esos dos números más uno.
//	Divisores de (m) = Divisores de (n) = m + n + 1.
//	D (48) = 1 + 2 + 3 + 4 + 6 + 8 + 12 + 16 + 24 + 48 = 124,
//	D (75) = 1 + 3 + 5 + 15 + 25 + 75 = 124,
//	Si hacemos => 48 + 75 + 1 = 124

	public static int sumaDivisores(int n) {
		int res = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				res += i;
		//Debugging	System.out.println(i + " es divisor de " + n);
			}
		}
		return res;
	}

	public static boolean sonNovios(int n1, int n2) {
		boolean novios = false;
		if ((sumaDivisores(n1) == sumaDivisores(n2)) && (sumaDivisores(n1) == n1 + n2 + 1))
			novios = true;
		return novios;
	}

	public static void main(String[] args) {

		int num1, num2 = 0;
//		int resultado1, resultado2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("dame un primer numero: ");
		num1 = sc.nextInt();
		System.out.println("dame un numero: ");
		num2 = sc.nextInt();

//		resultado1 = sumaDivisores(num1);
//		System.out.println(resultado1);
//		resultado2 = sumaDivisores(num2);
//		System.out.println(resultado2);

		System.out.println("los numeros " + num1 + " y " + num2 + " son novios? " + sonNovios(num1, num2));

		sc.close();
	}
}