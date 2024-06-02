package ExamenFinal.Coche;

public class Sedan extends VehiculoConMulta {
    int longitud;

    public Sedan(int velocidad, double PrecioNormal, String color, int longitud) {
        super(velocidad, PrecioNormal, color);
        this.longitud = longitud;
    }

    @Override
    public double getPrecioVenta() {
        if (longitud > 5000) {
            return PrecioNormal * 0.95;
        } else {
            return PrecioNormal * 0.9;
        }
    }
}