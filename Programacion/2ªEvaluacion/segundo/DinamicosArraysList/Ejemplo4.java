package segundo.DinamicosArraysList;

import java.util.ArrayList;

public class Ejemplo4 {
    public static void main(String[] args) {

		ArrayList<String> colores = new ArrayList<String>();

		// Añadir colores a la lista
		colores.add("rojo");
		colores.add("verde");
		colores.add("azul");
		colores.add("blanco");
		colores.add("amarillo");
		colores.add("blanco");

		// Mostrar la lista
		System.out.println("Contenido de la lista: ");
		for (String color : colores) {
			System.out.println(color);
		}

		// Eliminar elemento de la lista
		if (colores.contains("blanco")) {
			System.out.println("El blanco está en la lista de colores");
			colores.remove("blanco");
		}

		System.out.println("Nuevo contenido de la lista: ");
		for (String color : colores) {
			System.out.println(color);
		}

		// Pruebas con borrado por índice
		int n = 21;
		if (n < colores.size()) {
			colores.remove(n);
		} else {
			System.out.println("A LO LOCO NOOOOOO");
		}

		n = 2;
		if (n < colores.size()) {
			colores.remove(n);
		} else {
			System.out.println("A LO LOCO NOOOOOO");
		}

		colores.remove(2);
		System.out.println("Contenido de la lista despues de quitar el elemento de la posición 2: ");
		for (String color : colores) {
			System.out.println(color);
		}

	} // cierre main
} // cierre clase
