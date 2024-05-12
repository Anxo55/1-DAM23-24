package POO;

// Desarrolla una clase Tienda que represente productos en venta. Cada producto debe tener un nombre, precio y cantidad en stock. 
// Agrega métodos para comprar y vender productos.

public class Tienda {

    private String nombre;
    private double precio;
    private int cantidadProducto;

    Tienda() {
        this.nombre = "Platano";
        this.precio = 2.30;
        this.cantidadProducto = 7;
    }

    Tienda(String nombre, double precio, int cantidadProducto) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadProducto = cantidadProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }
    

    @Override
    public String toString() {
        return "Tienda [nombre=" + nombre + ", precio=" + precio + ", cantidadProducto=" + cantidadProducto + "]";
    }
    
}
