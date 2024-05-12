package segundo.baraja;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

// Escribe un programa que genere una secuencia de 5 cartas de la baraja española
// y que sume los puntos segun el juego de la brisca. El valor de las cartas se debe
// guardar en una estructura hashMap que debe cintener las parejas
// (figura, valor), por ejemplo ("Caballo", 3). La secuencia de cartas debe ser una 
// estructura de la calse arraylist que contiene objetos de la clase Carta. E valor de las cartas
// es el siguietne: as> 11, tres >10, sota>2, caballo>3, rey>4; el resto de cartas no vale nada
// Ejemplo: 
// as de oros
// cinco de bastos
// caballo de espadas
// sota de copas
// tres de oros
// Tienes 26 puntos

public class Ejercicio12 {

    static ArrayList<Carta> mano = new ArrayList<>();

    static HashMap<String, Integer> valores = new HashMap<>();

    static void ponPuntos() {
        valores.put("as", 11);
        valores.put("tres", 10);
        valores.put("rey", 4);
        valores.put("caballo", 3);
        valores.put("sota", 2);
        valores.put("siete", 0);
        valores.put("seis", 0);
        valores.put("cinco", 0);
        valores.put("cuatro", 0);
        valores.put("dos", 0);
        
    }

    static int totalPuntos(ArrayList<Carta> m) {

        ponPuntos();
        int total = 0;

        for(Carta c: m) {
            total+=  (int)  valores.get(c.getValor());
        }
        return total;

    }

    public static void main(String[] args) {


            Carta c = new Carta();
            mano.add(c);
    
            do {
                Carta nueva = new Carta();
                if (!mano.contains(nueva)) 
                    mano.add(nueva);
            } while (mano.size() < 10);
    
            Collections.sort(mano);
    
            System.out.println("Generadas 10 cartas no repetidas:");
            for (Carta carta : mano) 
                System.out.println(carta.toString());
                
            System.out.println("total: "+totalPuntos(mano));
    
        }
    }