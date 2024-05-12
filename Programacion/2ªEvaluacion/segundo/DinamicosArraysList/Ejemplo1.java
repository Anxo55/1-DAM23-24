package segundo.DinamicosArraysList;

import java.util.ArrayList;

public class Ejemplo1 {

    public static void main(String[] args) {
        ArrayList<String> cadenas = new ArrayList<String>();
        
        System.out.println("Nº de elementos: " + cadenas.size());
        cadenas.add("rojo");
        cadenas.add("verde");
        cadenas.add("azul");
        System.out.println("Nº de elementos: " + cadenas.size());
        cadenas.add("blanco");
        System.out.println("Nº de elementos: " + cadenas.size());

        int n=0;

        if (n<cadenas.size()) 
            System.out.println("El elemento que hay en la posicion 0 es: "+cadenas.get(n));
        
        n=3;
        if (n<cadenas.size()) 
            System.out.println("El elemento que hay en la posicion 3 es: "+cadenas.get(n));

        n=5;
        if (n<cadenas.size())
            System.out.println("El elemento que hay en la posicion 3 es: "+cadenas.get(n));
        System.out.println(cadenas);
        
    }
    
}
