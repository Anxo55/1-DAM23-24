package Java.Vehiculo;

public class Motocicleta extends Vehiculo{

    protected float cilindraje;

    public Motocicleta(String fabricante, int anioFabricacion, float cilindraje) {
        super(fabricante, anioFabricacion);
        this.cilindraje = cilindraje;
    }

    public float getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(float cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public String toString() {
        return "Motocicleta [fabricante=" + fabricante + ", cilindraje=" + cilindraje + ", anioFabricacion="
                + anioFabricacion + "]";
    }
    
}
