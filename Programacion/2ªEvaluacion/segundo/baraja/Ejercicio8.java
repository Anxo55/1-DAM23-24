package segundo.baraja;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

// Realiza un programa que escoja al azar 10 cartas de la baraja española
// (10 objetos de la calse Carta). Emplea un objeto de la clase ArrayList para
// almacenarkas y asegurate de que no se repite ninguna

public class Ejercicio8 {
    static HashMap<String,Integer> parejas = new HashMap<String,Integer>();
	
	static void ponPuntosAlMap() {
		parejas.put("rey", 10);
		parejas.put("caballo", 9);
		parejas.put("sota", 8);
		parejas.put("siete", 7);
		parejas.put("seis", 6);
		parejas.put("cinco", 5);
        parejas.put("cuatro", 4);
        parejas.put("tres",3);
        parejas.put("dos", 2);
        parejas.put("as", 1);
		
	}

    static ArrayList<Carta> mano = new ArrayList<>();

    public static void main(String[] args) {
        ponPuntosAlMap();
        Carta c = new Carta();
        mano.add(c);

        do {
            Carta nueva = new Carta();
            if (!mano.contains(nueva)) 
                mano.add(nueva);
        } while (mano.size() < 10);

        Collections.sort(mano);

        // int total = 0;
        System.out.println("Generadas 10 cartas no repetidas:");
        for (Carta carta : mano) {
            System.out.println(carta.toString());
            // total += carta.getPuntos();
        }
        // System.out.println("PUNTAJE TOTAL: " + total + " PUNTOS");

    }
}