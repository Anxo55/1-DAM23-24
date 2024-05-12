package practicaJavaVarios;

import java.util.Scanner;

public class numeroAmigo {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce el primer número: ");
		int numero1 = sc.nextInt();
		System.out.print("Introduce el segundo número: ");
		int numero2 = sc.nextInt();

		int sumaDivisoresA = 0; //acumuladores de divisores
		int sumaDivisoresB = 0;

		for (int i = 1; i < numero1; i++) {
			if (numero1 % i == 0) {
				sumaDivisoresA += i;
			}
		}

		for (int i = 1; i < numero2; i++) {
			if (numero2 % i == 0) {
				sumaDivisoresB += i;
			}
		}

		if (sumaDivisoresA == numero2 && sumaDivisoresB == numero1) {
			System.out.println("Los números " + numero1 + " y " + numero2 + " son números amigos");
		} else {
			System.out.println("Los números " + numero1 + " y " + numero2 + " no son números amigos");
		}
	}
}
    
