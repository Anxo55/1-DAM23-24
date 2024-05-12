package repasoExamen;

import java.util.Scanner;

public class numerosAmigos {

//	Dos números naturales distintos son amigos si a cada uno de ellos
//	se lo obtiene sumando los divisores propios del otro. Ejemplos: 1) 10 y 8 no
//	son amigos puesto que los divisores propios de 10 son 1, 2 y 5 cuya suma es 8,
//	pero los divisores propios de 8 son 1, 2, 4 cuya suma es 7 distinto de 10.

	public static int sumaDivisores(int n) {
		int res = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				res += i;
				System.out.println(i + " es divisor de " + n);
			}
		}
		return res;
	}

	public static int sumaDivisoresPropios(int n) {
		int res = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				res += i;
				System.out.println(i + " es divisor de " + n);
			}
		}
		return res;
	}

	public static boolean sonAmigos(int n1, int n2) {
		boolean amigos = false;
		if (sumaDivisoresPropios(n1) == n2 && sumaDivisoresPropios(n2) == n1)
			amigos = true;
		return amigos;
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

		System.out.println("los numeros " + num1 + " y " + num2 + " son amigos? " + sonAmigos(num1, num2));

		sc.close();
	}
    
}
