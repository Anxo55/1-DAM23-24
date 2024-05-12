package Java.FigurasGeometricas;

public class Triangulo extends Figura{

    protected double base;
    protected double altura;
    
    public Triangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Triangulo [color=" + color + ", base=" + base + ", altura=" + altura + "]";
    }

    public double calcularArea() {
        return (base * altura) / 2;
    }
    
}
