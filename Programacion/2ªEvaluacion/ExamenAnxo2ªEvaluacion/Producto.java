package ExamenAnxo2ªEvaluacion;

public class Producto {

    private int cantidad;
    private float precio;

    Producto(int cantidad, float precio) {
        this.cantidad = cantidad;
        this.precio = precio;
    }

    Producto() {

    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto [cantidad=" + cantidad + ", precio=" + precio + "]";
    }

    
}
