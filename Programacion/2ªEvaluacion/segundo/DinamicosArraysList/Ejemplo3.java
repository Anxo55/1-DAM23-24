package segundo.DinamicosArraysList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejemplo3 {
    public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);

		ArrayList<String> colores = new ArrayList<String>();

		// Añadir colores a la lista
		colores.add("rojo");
		colores.add("verde");
		colores.add("azul");
		colores.add("blanco");
		colores.add("amarillo");

		for (int i = 0; i < colores.size(); i++) {
			String newColor = colores.get(i);
			System.out.println(newColor);
			System.out.println("Nuevo color: ");
			newColor = sc.nextLine();
			colores.set(i, newColor);
		}

		// Mostrar la lista
		System.out.println("Contenido de la lista: ");
		for (int i = 0; i < colores.size(); i++) {
			// Necesito obtener el elemento para visualizarlo
			System.out.println(colores.get(i));
		}

		// Intento (fallido) de modificación de la lista usando foreach
		for (String c : colores) {
			System.out.println(c);
			System.out.println("Nuevo color: ");
			c = sc.nextLine();
		}

		// Mostrar la lista
		System.out.println("Contenido de la lista: ");
		for (int i = 0; i < colores.size(); i++) {
			// Necesito obtener el elemento para visualizarlo
			System.out.println(colores.get(i));
		}

		sc.close();
	} // cierre main
} // cierre clase
