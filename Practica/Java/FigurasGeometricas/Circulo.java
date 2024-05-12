package Java.FigurasGeometricas;

public class Circulo extends Figura{

    protected double radio;

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo [color=" + color + ", radio=" + radio + "]";
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
    }
    
}
