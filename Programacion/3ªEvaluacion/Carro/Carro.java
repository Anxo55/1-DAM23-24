package Carro;

import java.util.Arrays;

public class Carro {

    Motor motor;
    Chasis chasis;
    Carroceria carroceria;
    LLanta[] lLanta;

    public Carro(Motor motor, Chasis chasis, Carroceria carroceria, LLanta[] lLanta) {
        this.motor = motor;
        this.chasis = chasis;
        this.carroceria = carroceria;
        this.lLanta = lLanta;
    }

    @Override
    public String toString() {
        return "Carro [motor=" + motor + ", chasis=" + chasis + ", carroceria=" + carroceria + ", lLanta="
                + Arrays.toString(lLanta) + "]";
    }

    
    
}
