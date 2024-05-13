package Composicion;

public class Circulo extends Punto{

    private int radio;

    public Circulo(int y, int x, int radio) {
        super(y, x);
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return super.toString() + "Circulo [radio=" + radio + "]";
    }

    
    
}
