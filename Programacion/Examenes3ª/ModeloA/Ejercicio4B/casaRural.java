package ModeloA.Ejercicio4B;

public class casaRural extends Casa implements Comision {
    public static final int VALOR_AREA = 1750;

    protected int distanciaCabecera;
    protected int altura;

    public casaRural(int id, int area, String direccion, int numeroHabitaciones, int numeroBanos, int numeroPisos,
            int distanciaCabecera, int altitud) {
        super(id, area, direccion, numeroHabitaciones, numeroBanos, numeroPisos);
        this.distanciaCabecera = distanciaCabecera;
        this.altura = altitud;
    }

    public int getDistanciaCabecera() {
        return distanciaCabecera;
    }

    public int getAltura() {
        return altura;
    }

    public void setDistanciaCabecera(int distanciaCabecera) {
        this.distanciaCabecera = distanciaCabecera;
    }

    public void setAltitud(int altitud) {
        this.altura = altitud;
    }

    @Override
    public String toString() {
        return "casaRural [distanciaCabecera=" + distanciaCabecera + ", altura=" + altura + ", numeroPisos="
                + numeroPisos + ", numeroHabitaciones=" + numeroHabitaciones + ", numeroBanos=" + numeroBanos + ", id="
                + id + ", area=" + area + ", direccion=" + direccion + "]";
    }

    @Override
    public double calcularPrecioVenta() {
        return this.area * VALOR_AREA;
    }

    @Override
    public double calcularComision() {
        double comisionBase = 0.05 * calcularPrecioVenta();
        comisionBase += 300 * numeroHabitaciones + 200 * numeroBanos;
        comisionBase += 5 * altura;
        return comisionBase;
    }
}