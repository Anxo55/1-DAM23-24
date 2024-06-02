package ExamenFinal.Coche;

public class Car {
    
    int velocidad;
    double PrecioNormal;
    String color;

    public Car(int velocidad, double PrecioNormal, String color) {
        this.velocidad = velocidad;
        this.PrecioNormal = PrecioNormal;
        this.color = color;
    }

    public double getPrecioVenta() {
        return PrecioNormal;
    }
}