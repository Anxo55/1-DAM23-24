import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Ejercicio6A {
    
    public static void main(String[] args) {
        ArrayList<Carta> mano = generarMano();
        mostrarManoOrdenada(mano);
        int totalPuntos = calcularTotalPuntos(mano);
        System.out.println("Tienes " + totalPuntos + " puntos");
    }

    public static ArrayList<Carta> generarMano() {
        HashMap<String, Integer> valores = new HashMap<>();
        valores.put("as", 11);
        valores.put("dos", 2);
        valores.put("tres", 3);
        valores.put("cuatro", 4);
        valores.put("cinco", 5);
        valores.put("seis", 6);
        valores.put("siete", 7);
        valores.put("sota", 10);
        valores.put("caballo", 10);
        valores.put("rey", 10);

        ArrayList<Carta> mano = new ArrayList<>();
        while (mano.size() < 7) {
            Carta carta = new Carta();
            if (!mano.contains(carta)) {
                mano.add(carta);
            }
        }
        return mano;
    }

    public static int calcularTotalPuntos(ArrayList<Carta> mano) {
        int totalPuntos = 0;
        for (Carta carta : mano) {
            String valorCarta = carta.getValor();
            totalPuntos += valorCarta.equals("as") ? 11 : (valorCarta.equals("sota") || valorCarta.equals("caballo") || valorCarta.equals("rey")) ? 10 : Integer.parseInt(valorCarta);
        }
        return totalPuntos;
    }

    public static void mostrarManoOrdenada(ArrayList<Carta> mano) {
        Collections.sort(mano);
        for (Carta carta : mano) {
            System.out.println(carta);
        }
    }
}
