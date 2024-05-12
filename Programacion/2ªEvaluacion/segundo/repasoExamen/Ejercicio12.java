package segundo.repasoExamen;

import java.util.ArrayList;

public class Ejercicio12 {
    
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        // Agregar elementos al ArrayList
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        
        // Extraer una parte del ArrayList (del índice 1 al índice 3)
        ArrayList<Integer> subList = new ArrayList<>(arrayList.subList(1, 3));
        
        // Imprimir la parte extraída del ArrayList
        System.out.println(subList);
    }
}
