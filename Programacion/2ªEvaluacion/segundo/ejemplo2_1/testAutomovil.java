package segundo.ejemplo2_1;

import segundo.ejemplo2_1.Automovil.tipoAutomovil;
import segundo.ejemplo2_1.Automovil.tipoColor;
import segundo.ejemplo2_1.Automovil.tipoCombustible;

public class testAutomovil {

    public static void main(String[] args) {

        Automovil miAutomovil = new Automovil(null, 3, 150, 3, 5, 200, tipoColor.ROJO, 50, tipoCombustible.GASOLINA, tipoAutomovil.CIUDAD, true);
        System.out.println(miAutomovil.toString());

        miAutomovil.acelerar(100);
        miAutomovil.decelerar(75);
        miAutomovil.frenar(40);

    }
    
}
