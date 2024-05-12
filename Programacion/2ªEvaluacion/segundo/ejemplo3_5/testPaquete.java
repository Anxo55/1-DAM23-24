package segundo.ejemplo3_5;

import segundo.ejemplo3_5.Paquete.TipoContenido;
import segundo.ejemplo3_5.Paquete.TipoEnvio;

public class testPaquete {

    public static void main(String[] args) {

        Paquete.Persona rte = null;
        Paquete.Persona des = null;

        Paquete metes = new Paquete(rte, des, TipoEnvio.INTERNACIONAL, TipoContenido.MERCANCIA, 2.345);

        System.out.println(metes);

        System.out.println(metes.valorPaquete());

        Paquete.Persona manolo =metes.new Persona("Manolo", "Perez", 1, "alli", 11);

        System.out.println(manolo);
        metes.setDestinatario(manolo);

        System.out.println(metes);

        System.out.println();

        // segundo paquete de la clase
        Paquete sales = null;
        
        // Paquete.Persona carlos = sales.new Persona("a", "b", 2, "aca", 033);
        // Paquete.Persona laura = sales.new Persona("cc", "cc", 3, "acuya", 044);
        // System.out.println(carlos);
        // System.out.println(laura);


        // sales = new Paquete(laura, carlos, TipoEnvio.NACIONAL, TipoContenido.DOCUMENTO, 2.5);
        // System.out.println(sales);
        // System.out.println(sales.valorPaquete());
        
    }
    
}
