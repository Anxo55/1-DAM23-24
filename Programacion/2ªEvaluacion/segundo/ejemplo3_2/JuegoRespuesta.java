package segundo.ejemplo3_2;

import java.util.Scanner;

public class JuegoRespuesta {

    public static final char RESPOSTA_CORRECTA = 'b';
    
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Acierta la pregunta.");
		System.out.println("¿Cuál de los siguientes no es un tipo 	primitivo?");
		System.out.println("a) Entero");
		System.out.println("b) Scanner");
		System.out.println("c) Carácter");
		System.out.println("d) Booleano");
		System.out.print("Tu respuesta es la opción:");
		// Se lee la cadena de texto.
		String palabra = sc.next();
		// Es una palabra de un único carácter?
		if (palabra.length() == 1) {
			// Se extrae el carácter de la cadena de texto.
			char caracter = palabra.charAt(0);

			// Es un carácter válido? (a, b, c o d)
			if ((caracter >= 'a') && (caracter <= 'd')) {
				// La respuesta final es correcta?
				if (caracter == RESPOSTA_CORRECTA) {
					System.out.println("Efectivamente, la respuesta era " + RESPOSTA_CORRECTA + ".");
				} else {
					System.out.println("La respuesta " + caracter + " es incorrecta.");
				}
			} else {
				System.out.println("" + caracter + " es una opción incorrecta.");
			}
		} else {
			// No lo era.
			System.out.println("\" " + palabra + "\"no es un carácter individual.");
		}
		sc.nextLine();
	}
    
}
