package repasoExamen;

import java.util.Scanner;

public class EuclidesMCD {

    public static int EuclidesIterativo(int a, int b) {

		while (b > 0) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		return a;
	}

	public static int EuclidesRecursivo(int p, int q) {
		if (q == 0)
			return p;
		else
			return EuclidesRecursivo(q, p % q);
	}

	public static int MinComMul(int a, int b) {
		int prod = a * b;
		return prod / EuclidesIterativo(a, b);
	}

	public static void main(String[] args) {

		int num1, num2 = 0;
//		int resultado1, resultado2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("dame un primer numero: ");
		num1 = sc.nextInt();
		System.out.println("dame un numero: ");
		num2 = sc.nextInt();

//		System.out.println("iterativo: " + EuclidesIterativo(num1, num2));
//		System.out.println("reiterativo: " + EuclidesRecursivo(num1, num2));
		System.out.println("mcm: " + MinComMul(num1, num2));

		sc.close();
	}
}
    

