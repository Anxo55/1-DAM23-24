package Ejercicio3B;

public class apartaEstudio extends Apartamento implements Comision{
    public static final int VALOR_AREA = 1900; // Actualizado según la tabla

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

    @Override
    public double calcularComision() {
        double comisionBase = 0.05 * calcularPrecioVenta();
        comisionBase += 200 * numeroHabitaciones + 100 * numeroBanos;
        comisionBase += 5 * area;
        return comisionBase;
    }
}
