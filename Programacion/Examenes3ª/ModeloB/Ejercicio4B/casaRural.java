package ModeloB.Ejercicio4B;

public class casaRural extends Casa implements Impuesto {

    public static final int VALOR_AREA = 1425;
    protected int distanciaCabecera;
    protected int altura;

    public casaRural(int id, int area, String direccion, int numeroHabitaciones, int numeroBanos, int numeroPisos,
            int distanciaCabecera, int altura) {
        super(id, area, direccion, numeroHabitaciones, numeroBanos, numeroPisos);
        this.distanciaCabecera = distanciaCabecera;
        this.altura = altura;
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
    public double calcularPrecioVenta() {
        return this.area * VALOR_AREA;
    }

    @Override
    public double calcularImpuesto() {
        return 0.07 * calcularPrecioVenta() + 500 * numeroHabitaciones + 400 * numeroBanos + 3 * altura;
    }

    @Override
    public String toString() {
        return "casaRural [distanciaCabecera=" + distanciaCabecera + ", altura=" + altura + ", numeroPisos="
                + numeroPisos + ", numeroHabitaciones=" + numeroHabitaciones + ", numeroBanos=" + numeroBanos + ", id="
                + id + ", area=" + area + ", direccion=" + direccion + "]";
    }
}