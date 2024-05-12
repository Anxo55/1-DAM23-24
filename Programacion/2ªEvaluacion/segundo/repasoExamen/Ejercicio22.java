package segundo.repasoExamen;

import java.util.ArrayList;

public class Ejercicio22 {
    
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        // Agregar elementos al ArrayList
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        
        // Imprimir todos los elementos con su posición
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("Elemento en la posición " + i + ": " + arrayList.get(i));
        }
    }
}
