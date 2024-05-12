package Java.Vehiculo;

public class Bicicleta extends Vehiculo{

    enum tipoBicicleta{ MONTAÑA, CIUDAD}

    protected tipoBicicleta tBicicleta;

    public Bicicleta(String fabricante, int anioFabricacion, tipoBicicleta tBicicleta) {
        super(fabricante, anioFabricacion);
        this.tBicicleta = tBicicleta;
    }

    public tipoBicicleta gettBicicleta() {
        return tBicicleta;
    }

    public void settBicicleta(tipoBicicleta tBicicleta) {
        this.tBicicleta = tBicicleta;
    }

    @Override
    public String toString() {
        return "Bicicleta [fabricante=" + fabricante + ", anioFabricacion=" + anioFabricacion + ", tBicicleta="
                + tBicicleta + "]";
    }
    
}
