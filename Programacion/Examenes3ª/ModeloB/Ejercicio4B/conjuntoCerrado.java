package ModeloB.Ejercicio4B;

public class conjuntoCerrado extends casaUrbana implements Impuesto {

    public static final int VALOR_AREA = 2125;
    protected double valorAdministracion;
    protected boolean tienePiscina;
    protected boolean tieneCamposDeportivos;

    public conjuntoCerrado(int id, int area, String direccion, int numeroHabitaciones, int numeroBanos, int numeroPisos,
            double valorAdministracion, boolean tienePiscina, boolean tieneCamposDeportivos) {
        super(id, area, direccion, numeroHabitaciones, numeroBanos, numeroPisos);
        this.valorAdministracion = valorAdministracion;
        this.tienePiscina = tienePiscina;
        this.tieneCamposDeportivos = tieneCamposDeportivos;
    }

    public double getValorAdministracion() {
        return valorAdministracion;
    }

    public boolean isTienePiscina() {
        return tienePiscina;
    }

    public boolean isTieneCamposDeportivos() {
        return tieneCamposDeportivos;
    }

    public void setValorAdministracion(double valorAdministracion) {
        this.valorAdministracion = valorAdministracion;
    }

    public void setTienePiscina(boolean tienePiscina) {
        this.tienePiscina = tienePiscina;
    }

    public void setTieneCamposDeportivos(boolean tieneCamposDeportivos) {
        this.tieneCamposDeportivos = tieneCamposDeportivos;
    }

    @Override
    public double calcularPrecioVenta() {
        return this.area * VALOR_AREA;
    }

    @Override
    public double calcularImpuesto() {
        double impuesto = 0.07 * calcularPrecioVenta() + 500 * numeroHabitaciones + 400 * numeroBanos;
        if (tienePiscina) impuesto += 7000;
        if (tieneCamposDeportivos) impuesto += 5000;
        return impuesto;
    }

    @Override
    public String toString() {
        return "conjuntoCerrado [valorAdministracion=" + valorAdministracion + ", tienePiscina=" + tienePiscina
                + ", tieneCamposDeportivos=" + tieneCamposDeportivos + ", numeroPisos=" + numeroPisos
                + ", numeroHabitaciones=" + numeroHabitaciones + ", numeroBanos=" + numeroBanos + ", id=" + id
                + ", area=" + area + ", direccion=" + direccion + "]";
    }
}