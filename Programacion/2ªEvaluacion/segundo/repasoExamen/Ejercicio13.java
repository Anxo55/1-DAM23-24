package segundo.repasoExamen;

import java.util.ArrayList;

public class Ejercicio13 {
    
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(2);
        
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(1);
        arrayList2.add(2);
        
        // Comparar los ArrayLists
        boolean isEqual = arrayList1.equals(arrayList2);
        
        // Imprimir el resultado de la comparación
        if (isEqual) {
            System.out.println("Los ArrayLists son iguales.");
        } else {
            System.out.println("Los ArrayLists son diferentes.");
        }
    }
}