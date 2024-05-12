package segundo.DinamicosArraysList;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio9 {

    public static void main(String[] args) {

        ArrayList<Gato> g = new ArrayList<>();
        
        g.add(new Gato("Garfield", "naranja", "mestizo"));
        g.add(new Gato("Pepe", "gris", "angora"));
        g.add(new Gato("Mauri", "blanco", "manx"));
        g.add(new Gato("Ulises", "marron", "persa"));
        g.add(new Gato("Adan", "negro", "angora"));

        Gato uno = g.get(1);
        Gato dos = g.get(4);

        System.out.println(uno.compareTo(dos));
        System.out.println(uno.equals(dos));
        
        Collections.sort(g);
        System.out.println("Datos de los nuevos gatos ordenados: ");
        for(Gato gatoAux : g) {
            System.out.println(gatoAux.toString());
        }

        
       

        
        
    }
    
}
