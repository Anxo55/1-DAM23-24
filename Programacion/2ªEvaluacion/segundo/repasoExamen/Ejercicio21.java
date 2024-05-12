package segundo.repasoExamen;

import java.util.ArrayList;

public class Ejercicio21 {
    
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        // Agregar elementos al ArrayList
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        
        // Elemento a utilizar para el reemplazo
        int elementoDado = 10;
        
        // Reemplazar el segundo elemento con el elemento dado
        if (arrayList.size() >= 2) {
            arrayList.set(1, elementoDado);
            System.out.println("El segundo elemento fue reemplazado con " + elementoDado + ".");
        } else {
            System.out.println("El ArrayList no tiene suficientes elementos para realizar el reemplazo.");
        }
        
        // Imprimir el ArrayList después del reemplazo
        System.out.println("ArrayList después del reemplazo: " + arrayList);
    }
}