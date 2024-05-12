package segundo.repasoExamen;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio14 {
    
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        // Agregar elementos al ArrayList
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        
        // Intercambiar elementos en los índices 1 y 2
        Collections.swap(arrayList, 1, 2);
        
        // Imprimir el ArrayList después del intercambio
        System.out.println(arrayList);
    }
}
