package segundo.ejemplo2_4;

public abstract class Figura {

    String nombre;

    Figura() {
        this.nombre = "";
    }

    Figura(String nombre) {
        this.nombre = nombre;
    }

    double calcularPerimetro() {
        return 0d;
    }

    // double calcularArea() {
    //     return 0d;
    // }
    abstract double calcularArea();

    @Override
    public String toString() {
        return "Figura [nombre=" + nombre + "]";
    }
    
}
