package segundo.repasoExamen;

import java.util.ArrayList;

public class Ejercicio19 {
    
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        // Agregar elementos al ArrayList
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        
        // Recortar la capacidad del ArrayList al tamaño actual
        arrayList.trimToSize();
        
        // Imprimir el ArrayList después de recortar la capacidad
        System.out.println("ArrayList después de recortar la capacidad: " + arrayList);
    }
}