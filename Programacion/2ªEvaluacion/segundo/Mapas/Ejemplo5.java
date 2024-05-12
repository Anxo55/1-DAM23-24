package segundo.Mapas;

import java.util.HashMap;
import java.util.Scanner;

public class Ejemplo5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Integer, String> mapa = new HashMap<>();
        mapa.put(924, "Amalia Nuñez");
        mapa.put(921, "Cindy Nero");
        mapa.put(700, "Cesar Vazquez");
        mapa.put(219, "Victor Tilla");
        mapa.put(537, "Alan Brito");
        mapa.put(605, "Esteban Quito");

        System.out.println(mapa.keySet());
        System.out.println("Porfavor introduza un codigo (vas a ciegas): ");
        int codigoIntroducido = sc.nextInt();

        if(mapa.containsKey(codigoIntroducido)) {
            System.out.println("El codigo " + codigoIntroducido + " corresponde a");
            System.out.println(mapa.get(codigoIntroducido));
        }else{
            System.out.println("El codigo introducido no existe.");
        }

        System.out.println(mapa.values());
        
    }
    
}
