package Java.Vehiculo;

public class Automovil extends Vehiculo{

    protected String modelo;
    protected int numeroDePuertas;
    
    public Automovil(String fabricante, int anioFabricacion, String modelo, int numeroDePuertas) {
        super(fabricante, anioFabricacion);
        this.modelo = modelo;
        this.numeroDePuertas = numeroDePuertas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }

    @Override
    public String toString() {
        return "Automovil [fabricante=" + fabricante + ", modelo=" + modelo + ", anioFabricacion=" + anioFabricacion
                + ", numeroDePuertas=" + numeroDePuertas + "]";
    }
    
}
