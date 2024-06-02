package ModeloB.Ejercicio4B;

public class Oficina extends local implements Impuesto {

    public static final int VALOR_AREA = 3875;
    private boolean esGobierno;

    public Oficina(int id, int area, String direccion, tipo tipolocal, boolean esGobierno) {
        super(id, area, direccion, tipolocal);
        this.esGobierno = esGobierno;
    }

    public boolean isEsGobierno() {
        return esGobierno;
    }

    public void setEsGobierno(boolean esGobierno) {
        this.esGobierno = esGobierno;
    }

    @Override
    public double calcularPrecioVenta() {
        return this.area * VALOR_AREA;
    }

    @Override
    public double calcularImpuesto() {
        if (esGobierno) return 0;
        return 0.03 * calcularPrecioVenta();
    }

    @Override
    public String toString() {
        return "Oficina [esGobierno=" + esGobierno + ", tipolocal=" + tipolocal + ", id=" + id + ", area=" + area
                + ", direccion=" + direccion + "]";
    }
}
