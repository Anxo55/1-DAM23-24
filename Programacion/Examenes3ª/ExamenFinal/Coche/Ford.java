package ExamenFinal.Coche;

public class Ford extends Car {
    int año;
    int DescuentoFabricante;

    public Ford(int velocidad, double PrecioNormal, String color, int año, int DescuentoFabricante) {
        super(velocidad, PrecioNormal, color);
        this.año = año;
        this.DescuentoFabricante = DescuentoFabricante;
    }

    @Override
    public double getPrecioVenta() {
        return PrecioNormal - DescuentoFabricante;
    }
}
