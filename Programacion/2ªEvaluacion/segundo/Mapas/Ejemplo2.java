package segundo.Mapas;

import java.util.HashMap;

public class Ejemplo2 {
    
    public static void main(String[] args) {

        HashMap<Integer, String> mapa = new HashMap<>();
        mapa.put(924, "Amalia Nuñez");
        mapa.put(921, "Cindy Nero");
        mapa.put(700, "Cesar Vazquez");
        mapa.put(219, "Victor Tilla");
        mapa.put(537, "Alan Brito");
        mapa.put(605, "Esteban Quito");
        System.out.println(mapa.keySet());
        System.out.println(mapa.get(921));
        System.out.println(mapa.get(605));
        System.out.println(mapa.get(888));

        // System.out.println("Los elementos del mapa son: \n" + mapa);
        
    }
    
}