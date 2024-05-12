package segundo.repasoExamen;

import java.util.ArrayList;
import java.util.Scanner;

// 1. Código Java para crear un nuevo array list, añadir algunos colores
// (string) e imprimir la colección.

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> colores = new ArrayList<String>();

        String valur = "";
        System.out.println("Introduzca los colores (0 para salir): ");

        while (!valur.equals("0")) {
            valur = sc.next();
            if(!valur.equals("0")) {
                colores.add(valur);
                System.out.println("Añadido: "+ valur);
            }
        
    }

    for(int i=0; i<colores.size(); i++) {
        System.out.println("Color " + (i+1) + ": " + colores.get(i));
    }
    
}
}
