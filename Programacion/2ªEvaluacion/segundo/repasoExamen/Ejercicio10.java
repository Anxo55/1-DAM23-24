package segundo.repasoExamen;

import java.util.ArrayList;

public class Ejercicio10 {
    
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        // Agregar elementos al ArrayList
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        
        // Mover el primer elemento al final
        Integer temp = arrayList.remove(0);
        arrayList.add(temp);
        
        // Imprimir el ArrayList después del movimiento
        System.out.println(arrayList);
    }
}
