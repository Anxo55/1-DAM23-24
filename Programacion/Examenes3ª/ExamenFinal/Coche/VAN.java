package ExamenFinal.Coche;

public class VAN extends VehiculoConMulta {
    int peso;
    double cilindrada;

    public VAN(int velocidad, double PrecioNormal, String color, int peso, double cilindrada) {
        super(velocidad, PrecioNormal, color);
        this.peso = peso;
        this.cilindrada = cilindrada;
    }

    @Override
    public double getPrecioVenta() {
        double precioBase;
        if (peso > 2000) {
            precioBase = PrecioNormal * 0.9;
        } else {
            precioBase = PrecioNormal * 0.8;
        }
        
        if (cilindrada < 3000) {
            return precioBase + (3 * cilindrada);
        } else {
            return precioBase + (4 * cilindrada);
        }
    }
}