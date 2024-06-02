package ExamenFinal.Coche;

public class SUV extends VehiculoConMulta {
    double potencia;

    public SUV(int velocidad, double PrecioNormal, String color, double potencia) {
        super(velocidad, PrecioNormal, color);
        this.potencia = potencia;
    }

    @Override
    public double getPrecioVenta() {
        if (potencia > 200) {
            return PrecioNormal + (5 * potencia);
        } else {
            return PrecioNormal + (3 * potencia);
        }
    }
}
