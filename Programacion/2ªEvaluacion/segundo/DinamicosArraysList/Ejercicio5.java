package segundo.DinamicosArraysList;

import java.util.ArrayList;

public class Ejercicio5 {
    
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
		int n = 2;
		if (n < colores.size()) {
			colores.set(n, "turquesa");
			System.out.println("MODIFICADO");
		} else {
			System.out.println("A LO LOCO NOOOO");
		}

		System.out.println("Contenido de la lista despues de machacar la posición 2: ");
		for (String color : colores) {
			System.out.println(color);
		}

	} // cierre main
}
// cierre clase
