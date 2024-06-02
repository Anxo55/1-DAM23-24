package ExamenFinal.Coche;

public class Truck extends Car {
    int peso;

    public Truck(int velocidad, double PrecioNormal, String color, int peso) {
        super(velocidad, PrecioNormal, color);
        this.peso = peso;
    }

    @Override
    public double getPrecioVenta() {
        if (peso > 2000) {
            return PrecioNormal * 0.9;
        } else {
            return PrecioNormal * 0.8;
        }
    }
}