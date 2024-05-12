//package ModeloA22-23;

import java.util.Scanner;

public class Ejercicio2A {

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
