package Carro;

public class LLanta {
    
    String marca;
    int diametroRim;
    int altura;
    int anchura;

    public LLanta(String marca, int diametroRim, int altura, int anchura) {
        this.marca = marca;
        this.diametroRim = diametroRim;
        this.altura = altura;
        this.anchura = anchura;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getDiametroRim() {
        return diametroRim;
    }

    public void setDiametroRim(int diametroRim) {
        this.diametroRim = diametroRim;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getAnchura() {
        return anchura;
    }

    public void setAnchura(int anchura) {
        this.anchura = anchura;
    }

    @Override
    public String toString() {
        return "LLanta [marca=" + marca + ", diametroRim=" + diametroRim + ", altura=" + altura + ", anchura=" + anchura
                + "]";
    }

    
    
}
