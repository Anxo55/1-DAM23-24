package segundo.repasoExamen;

import java.util.ArrayList;

public class Ejercicio15 {
    
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        // Agregar elementos al primer ArrayList
        arrayList1.add(1);
        arrayList1.add(2);
        
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        // Agregar elementos al segundo ArrayList
        arrayList2.add(3);
        arrayList2.add(4);
        
        // Unir los dos ArrayLists
        arrayList1.addAll(arrayList2);
        
        // Imprimir el ArrayList resultante
        System.out.println(arrayList1);
    }
}