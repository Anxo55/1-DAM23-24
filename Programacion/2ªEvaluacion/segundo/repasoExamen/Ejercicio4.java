package segundo.repasoExamen;

import java.util.ArrayList;
import java.util.Scanner;

// 4. Código Java para obtener un elemento (en un índice especificado) de
// un array list dado.

public class Ejercicio4 {

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
    
    ArrayList<String> array = puebLista();
    System.out.println("Tamaña de la lsita: "+array.size());
    System.out.println("Introduce indice: ");
    int indice = sc.nextInt();
    
    String valor = array.get(indice/* Valor indice */);
    System.out.println("Valor indice: "+valor);
}
    
}
