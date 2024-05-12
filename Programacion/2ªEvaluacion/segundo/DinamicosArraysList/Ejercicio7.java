package segundo.DinamicosArraysList;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio7 {

    public static void main(String[] args) {

        ArrayList<Gato> g = new ArrayList<Gato>();

        g.add(new Gato("Garfield", "naranja", "mestizo"));
        g.add(new Gato("Pepe", "gris", "angora"));
        g.add(new Gato("Mauri", "blanco", "manx"));
        g.add(new Gato("Ulises", "marron", "persa"));

        System.out.println("Datos de los gatos: ");
        for(Gato gatoAux : g) {
            System.out.println(gatoAux.toString());
        }

        //comparacion entre dos gatos
        Gato g1 = g.get(0);
        Gato g2 = g.get(3);

        //System.out.println(g1.equals(g2));
        System.out.println(g1.compareTo(g2));
        System.out.println(g2.compareTo(g1));

        // ordeno alfabeticamente gracias al compare to
        Collections.sort(g);
        System.out.println("Datos de los gatos despues de SORT: ");
        for(Gato gatoAux : g) {
            System.out.println(gatoAux.toString());
        }

        // comprobar igualdades
        System.out.println(g1.equals(g2));
        System.out.println(g1.equals(g1));
    }
    
}
