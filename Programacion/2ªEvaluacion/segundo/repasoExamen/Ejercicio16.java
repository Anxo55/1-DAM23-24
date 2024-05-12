package segundo.repasoExamen;

import java.util.ArrayList;

public class Ejercicio16 {
    
    public static void main(String[] args) {
        ArrayList<Integer> originalArrayList = new ArrayList<>();
        // Agregar elementos al ArrayList original
        originalArrayList.add(1);
        originalArrayList.add(2);
        originalArrayList.add(3);
        
        // Clonar el ArrayList original
        ArrayList<Integer> clonedArrayList = new ArrayList<>(originalArrayList);
        
        // Imprimir el ArrayList clonado
        System.out.println("ArrayList clonado: " + clonedArrayList);
    }
}