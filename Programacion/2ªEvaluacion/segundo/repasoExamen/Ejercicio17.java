package segundo.repasoExamen;

import java.util.ArrayList;

public class Ejercicio17 {
    
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        // Agregar elementos al ArrayList
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        
        // Vaciar el ArrayList
        arrayList.clear();
        
        // Imprimir el ArrayList después de vaciarlo
        System.out.println("ArrayList después de vaciarlo: " + arrayList);
    }
}
