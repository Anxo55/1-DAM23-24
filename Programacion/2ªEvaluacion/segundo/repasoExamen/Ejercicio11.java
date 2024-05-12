package segundo.repasoExamen;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio11 {
    
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        // Agregar elementos al ArrayList
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        
        // Invertir el orden de los elementos
        Collections.reverse(arrayList);
        
        // Imprimir el ArrayList después de invertir el orden
        System.out.println(arrayList);
    }
}
