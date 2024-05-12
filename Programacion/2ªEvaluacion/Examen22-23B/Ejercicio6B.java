import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Ejercicio6B {
    

    public static void main(String[] args) {
        HashMap<String, Integer> valores = new HashMap<>();
        valores.put("as", 20);
        valores.put("rey", 15);
        valores.put("sota", 15);
        valores.put("caballo", 15);
        valores.put("diez", 10);
        valores.put("nueve", 9);
        valores.put("ocho", 8);
        valores.put("siete", 7);
        valores.put("seis", 6);
        valores.put("cinco", 5);
        valores.put("cuatro", 4);
        valores.put("tres", 3);
        valores.put("dos", 2);

        ArrayList<Carta> mano = new ArrayList<>();

        while (mano.size() < 5) {
            Carta carta = new Carta();
            if (!mano.contains(carta)) {
                mano.add(carta);
            }
        }

        Collections.sort(mano);

        int totalPuntos = 0;
        System.out.print("Secuencia de cartas: ");
        for (int i = 0; i < mano.size(); i++) {
            Carta carta = mano.get(i);
            String valorCarta = carta.getValor();
            System.out.print(valorCarta + " de " + carta.getPalo());
            if (i < mano.size() - 1) {
                System.out.print(", ");
            }
            totalPuntos += valores.get(valorCarta);
        }

        System.out.println("\nTienes " + totalPuntos + " puntos.");
    }
}