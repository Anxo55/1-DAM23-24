package Carro;

public class Motor {

    private double volumenLitro;

    public Motor(double volumenLitro) {
        this.volumenLitro = volumenLitro;
    }

    public double getVolumenLitro() {
        return volumenLitro;
    }

    public void setVolumenLitro(double volumenLitro) {
        this.volumenLitro = volumenLitro;
    }

    @Override
    public String toString() {
        return "Motor [volumenLitro=" + volumenLitro + "]";
    }

    
    
}
