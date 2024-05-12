package segundo.repasoExamen;

import java.util.ArrayList;

public class Ejercicio20 {
    
    public static void main(String[] args) {
        // Crear un ArrayList con capacidad inicial de 10
        ArrayList<Integer> arrayList = new ArrayList<>(10);
        
        // Agregar elementos al ArrayList
        for (int i = 1; i <= 15; i++) {
            arrayList.add(i);
        }
        
        // Imprimir el ArrayList
        System.out.println("ArrayList después de agregar elementos: " + arrayList);
    }
}
