package segundo.Mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Ejemplo4 {

    public static void main(String[] args) {

         HashMap<Integer, String> mapa = new HashMap<>();
        mapa.put(924, "Amalia Nuñez");
        mapa.put(921, "Cindy Nero");
        mapa.put(700, "Cesar Vazquez");
        mapa.put(219, "Victor Tilla");
        mapa.put(537, "Alan Brito");
        mapa.put(605, "Esteban Quito");

        System.out.println("Codigo\tNombre\n-----\t---------");

        for(Entry<Integer, String> duo: mapa.entrySet()) {
            System.out.println(duo.getKey() + "\t");
            System.out.println(duo.getValue());
        }
        
    }
    
}
