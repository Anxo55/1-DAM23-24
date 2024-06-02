package ModeloB.Ejercicio4B;

public class apartamentoFamiliar extends Apartamento implements Impuesto {

    public static final int VALOR_AREA = 2425;
    protected int valorAdministracion;

    public apartamentoFamiliar(int id, int area, String direccion, int numeroHabitaciones, int numeroBanos,
            int valorAdministracion) {
        super(id, area, direccion, numeroHabitaciones, numeroBanos);
        this.valorAdministracion = valorAdministracion;
    }

    public int getValorAdministracion() {
        return valorAdministracion;
    }

    public void setValorAdministracion(int valorAdministracion) {
        this.valorAdministracion = valorAdministracion;
    }

    @Override
    public double calcularPrecioVenta() {
        return this.area * VALOR_AREA;
    }

    @Override
    public double calcularImpuesto() {
        return 0.05 * calcularPrecioVenta() + 500 * numeroHabitaciones + 400 * numeroBanos + 5 * valorAdministracion;
    }

    @Override
    public String toString() {
        return "apartamentoFamiliar [valorAdministracion=" + valorAdministracion + ", numeroHabitaciones="
                + numeroHabitaciones + ", numeroBanos=" + numeroBanos + ", id=" + id + ", area=" + area + ", direccion="
                + direccion + "]";
    }
}