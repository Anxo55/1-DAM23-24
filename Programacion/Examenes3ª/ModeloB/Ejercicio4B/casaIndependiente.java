package ModeloB.Ejercicio4B;

public class casaIndependiente extends casaUrbana implements Impuesto {

    public static final int VALOR_AREA = 3375;

    public casaIndependiente(int id, int area, String direccion, int numeroHabitaciones, int numeroBanos,
            int numeroPisos) {
        super(id, area, direccion, numeroHabitaciones, numeroBanos, numeroPisos);
    }

    @Override
    public double calcularPrecioVenta() {
        return this.area * VALOR_AREA;
    }

    @Override
    public double calcularImpuesto() {
        return 0.07 * calcularPrecioVenta() + 500 * numeroHabitaciones + 400 * numeroBanos;
    }

    @Override
    public String toString() {
        return "casaIndependiente [numeroPisos=" + numeroPisos + ", numeroHabitaciones=" + numeroHabitaciones
                + ", numeroBanos=" + numeroBanos + ", id=" + id + ", area=" + area + ", direccion=" + direccion + "]";
    }
}