package Java.FigurasGeometricas;

public class Cuadrado extends Figura{

    protected double lado;

    public Cuadrado(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado [color=" + color + ", lado=" + lado + "]";
    }

    public double calcularArea(){
        return lado * lado;
    }
    
}
