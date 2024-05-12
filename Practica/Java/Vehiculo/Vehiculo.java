package Java.Vehiculo;

public class Vehiculo {

    protected String fabricante;
    protected int anioFabricacion;

    public Vehiculo(String fabricante, int anioFabricacion) {
        this.fabricante = fabricante;
        this.anioFabricacion = anioFabricacion;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    @Override
    public String toString() {
        return "Vehiculo [fabricante=" + fabricante + ", anioFabricacion=" + anioFabricacion + "]";
    }
    
}
