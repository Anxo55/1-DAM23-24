package ModeloA.Ejercicio4B;

public class apartaEstudio extends Apartamento {
    public static final int VALOR_AREA = 1850; // Actualizado según la tabla

    public apartaEstudio(int id, int area, String direccion, int numeroHabitaciones, int numeroBanos) {
        super(id, area, direccion, numeroHabitaciones, numeroBanos);
    }

    @Override
    public String toString() {
        return "apartaEstudio [numeroHabitaciones=" + numeroHabitaciones + ", numeroBanos=" + numeroBanos + ", id=" + id
                + ", area=" + area + ", direccion=" + direccion + "]";
    }

    @Override
    public double calcularPrecioVenta() {
        return this.area * VALOR_AREA;
    }
}
