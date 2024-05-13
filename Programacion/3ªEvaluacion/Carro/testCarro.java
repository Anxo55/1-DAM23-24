package Carro;

import Carro.Carroceria.TipoCarroceria;
import Carro.Chasis.TipoChasis;

public class testCarro {

    public static void main(String[] args) {
        
        Motor motor = new Motor(2.0);
        Chasis chasis = new Chasis(TipoChasis.INDEPENDIENTE);
        Carroceria carroceria = new Carroceria(TipoCarroceria.TUBULAR, "rojo");
        LLanta[] lLantas = new LLanta[4];

        for(int i = 0; i<lLantas.length; i++) {
            lLantas[i] = new LLanta("Carrera", 25, 30, 35);
        }

        Carro carro = new Carro(motor, chasis, carroceria, lLantas);

        System.out.println(carro.toString());

    }
    
}
