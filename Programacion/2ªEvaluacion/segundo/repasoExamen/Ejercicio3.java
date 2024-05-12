package segundo.repasoExamen;

import java.util.ArrayList;

// 3. Código Java para insertar un elemento en un array list en su primera
// posición.

public class Ejercicio3 {

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
       ArrayList<String> array = puebLista();

        array.add(0, "ceeero"); // Valor a insertar en la primera posicion

        System.out.println(array.toString());

        
    }
    
}
