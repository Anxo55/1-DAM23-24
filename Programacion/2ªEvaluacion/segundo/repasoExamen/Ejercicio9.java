package segundo.repasoExamen;

import java.util.ArrayList;
import java.util.Collections;

// 9. Código Java para copiar un array list en otro.

public class Ejercicio9 {

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
        ArrayList<String> array =  puebLista();
        ArrayList<String> array2 =  new ArrayList<String>();
        System.out.println(array);
        System.out.println(array2);

       for(int i=0; i<array.size(); i++) 
            array2.add(" ");

        /* Metodo de copia de la clase Collections el primero deonde copio W
         * els egundo lo que copio R
        */
        Collections.copy(array2, array); 

        System.out.println(array);
        System.out.println(array2);

        

        
    }
    
}
