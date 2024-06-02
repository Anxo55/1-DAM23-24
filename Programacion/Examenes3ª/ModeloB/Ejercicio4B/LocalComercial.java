package ModeloB.Ejercicio4B;

public class LocalComercial extends local implements Impuesto {

    public static final int VALOR_AREA = 3475;
    protected String centroComercial;

    public LocalComercial(int id, int area, String direccion, tipo tipolocal, String centroComercial) {
        super(id, area, direccion, tipolocal);
        this.centroComercial = centroComercial;
    }

    public String getCentroComercial() {
        return centroComercial;
    }

    public void setCentroComercial(String centroComercial) {
        this.centroComercial = centroComercial;
    }

    @Override
    public double calcularPrecioVenta() {
        return this.area * VALOR_AREA;
    }

    @Override
    public double calcularImpuesto() {
        return 0.04 * calcularPrecioVenta();
    }

    @Override
    public String toString() {
        return "LocalComercial [centroComercial=" + centroComercial + ", tipolocal=" + tipolocal + ", id=" + id
                + ", area=" + area + ", direccion=" + direccion + "]";
    }
}