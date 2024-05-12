package segundo.ejemplo3_2;

import java.util.Scanner;

public class BuscaCaracter {
    public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe una línea de texto cualquiera y pulsa retorno: ");
		String texto = sc.nextLine();
		
		System.out.println("¿Qué carácter quieres buscar?");
		String charText = sc.next();
		sc.nextLine();
		
		char busca = charText.charAt(0);
		int posIn = texto.indexOf(busca);
		int posFi = texto.lastIndexOf(busca);
		if (posIn > -1) {
			System.out.println("Las apariciones del carácter " + busca + " son:");
			System.out.println("Primera vez en: " + posIn);
			System.out.println("Última vez en: " + posFi);
		} else {
			System.out.println("Este carácter no se encuentra en el texto.");
		}
	}
}