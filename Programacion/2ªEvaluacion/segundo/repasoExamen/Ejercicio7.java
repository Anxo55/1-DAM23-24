package segundo.repasoExamen;

import java.util.ArrayList;
import java.util.Scanner;

// 7. Código Java para buscar un elemento en un array list.

public class Ejercicio7 {
    
    public static ArrayList<String> puebLista() {
    ArrayList<String> numeros = new ArrayList<String>();
    numeros.add("uno");
    numeros.add(("dos"));
    numeros.add("tres");
    numeros.add("cuatro");
    numeros.add("seis");
    numeros.add("siete");
    numeros.add("ocho");
    numeros.add("nueve");
    numeros.add("diez");
    

    return numeros;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    ArrayList<String> array = puebLista();/* ArrayList de ejemplo */
    System.out.println("Tamaño de la lista "+array.size());
    System.out.println(array);

    /* Posicion en la que insertar */
    System.out.println("Introduce valor a buscar ");
    String valor = sc.nextLine();

    System.out.println("Buscando: "+valor);
    int indice = array.indexOf(valor);
    System.out.println("Encontrado en posicion: "+indice);
    
}

    
}
