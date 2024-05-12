package segundo.ejemplo3_2;

import java.util.Scanner;

public class TroceandoCadenas {

    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("introduce una frase: ");
		String texto = sc.nextLine();

		// Dividimos la frase en palabras, separadas por espacios.
		String[] palabras = texto.split(" ");

		System.out.println("la frase tiene " + palabras.length + " palabras");
		for (int k = 0; k < palabras.length; k++)
			System.out.println(palabras[k]);

		System.out.println("La frase invirtiendo el orden " + "de las palabras es:");
		// Imprimimos las palabras en orden inverso.
		for (int i = palabras.length - 1; i >= 0; i--) {
			System.out.print(palabras[i]+" ");
		}
		System.out.println();

	}

}
