package repaso;

import java.util.ArrayList;
import java.util.Iterator;

public class EjemploIterator {
    
    public static ArrayList<String> pueblaLista() {
		ArrayList<String> numeros = new ArrayList<String>();
		numeros.add("uno");
		numeros.add("dos");
		numeros.add("tres");
		numeros.add("cuatro");
		numeros.add("cinco");
		numeros.add("seis");
		numeros.add("siete");
		numeros.add("ocho");
		numeros.add("nueve");
		numeros.add("diez");

		return numeros;
	}

	public static void main(String[] args) {

		ArrayList<String> array = pueblaLista();
		
		// empleando un elemento iterator para recorrer la colección
		System.out.println("\nElementos del array recorrido por un Iterator: ");

		Iterator<String> iterator = array.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		iterator.remove();

		System.out.println("\nElementos despues de remover Iterator: ");
		//reasignamos de nuevo un iterador a la referencia que tenemos
		iterator = array.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next()); // elimina el último valor del array
		}
		
		//reasignamos por segunda vez el iterador a la referencia que tenemos
		System.out.println();
		iterator = array.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next()); 
			iterator.remove();
		}
		
		System.out.println("\nQUE HA PASADO?");
		System.out.println(array);
	}
}
