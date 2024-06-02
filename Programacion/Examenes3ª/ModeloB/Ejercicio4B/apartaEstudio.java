package ModeloB.Ejercicio4B;

public class apartaEstudio extends Apartamento implements Impuesto {

    public static final int VALOR_AREA = 1725;

    public apartaEstudio(int id, int area, String direccion, int numeroHabitaciones, int numeroBanos) {
        super(id, area, direccion, numeroHabitaciones, numeroBanos);
    }

    @Override
    public double calcularPrecioVenta() {
        return this.area * VALOR_AREA;
    }

    @Override
    public double calcularImpuesto() {
        return 0.05 * calcularPrecioVenta() + 500 * numeroHabitaciones + 400 * numeroBanos;
    }

    @Override
    public String toString() {
        return "apartaEstudio [numeroHabitaciones=" + numeroHabitaciones + ", numeroBanos=" + numeroBanos + ", id=" + id
                + ", area=" + area + ", direccion=" + direccion + "]";
    }
}