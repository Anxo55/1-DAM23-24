package segundo.Mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Ejemplo3 {
    
    public static void main(String[] args) {

        HashMap<Integer, String> mapa = new HashMap<>();
        mapa.put(924, "Amalia Nuñez");
        mapa.put(921, "Cindy Nero");
        mapa.put(700, "Cesar Vazquez");
        mapa.put(219, "Victor Tilla");
        mapa.put(537, "Alan Brito");
        mapa.put(605, "Esteban Quito");

        System.out.println("Todas las entradas del diccionario extraidas con entrySet: ");
        System.out.println(mapa.entrySet());

        System.out.println("\nEntradas del diccionario extraidas una a una: ");
        // Otra solucion en el for con eclipse: Map.Entry pareja: mapa.entrySet()
        for(Entry<Integer, String> pareja: mapa.entrySet()) {
            System.out.println("esta entrada del set es: "+pareja);
        }
        
    }
        
}
