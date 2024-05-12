package segundo.ejemplo2_11;

import java.util.Arrays;

public class testArticuloCientifico {

    public static void main(String[] args) {

        ArticuloCientifico uno = new ArticuloCientifico("Leon de tasmania", "Pepe");
        String[] clave1 = {"ff", "gg", "dd"};
        ArticuloCientifico dos = new ArticuloCientifico("Leon Marino", "Angel", clave1, "Atlantico", 2004);
        ArticuloCientifico tres = new ArticuloCientifico("Leon de Cebem", "Antonio", clave1, "Faro", 2010, "Los leones de Cebem molan mucho");
        ArticuloCientifico cuatro = new ArticuloCientifico(tres);
        
        System.out.println(uno.toString());
        System.out.println(Arrays.toString(clave1));
        System.out.println(dos.toString());
        System.out.println(tres.toString());
        System.out.println(cuatro.toString());

    }
    
}
