package Carro;

public class Carroceria {

    enum TipoCarroceria {
            INDEPENDIENTE, AUTOPORTANTE, TUBULAR
    }

    private TipoCarroceria tipoCarroceria;
    private String color;

    public Carroceria(TipoCarroceria tipoCarroceria, String color) {
        this.tipoCarroceria = tipoCarroceria;
        this.color = color;
    }

    public TipoCarroceria getTipoCarroceria() {
        return tipoCarroceria;
    }

    public void setTipoCarroceria(TipoCarroceria tipoCarroceria) {
        this.tipoCarroceria = tipoCarroceria;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Carroceria [tipoCarroceria=" + tipoCarroceria + ", color=" + color + "]";
    }

}
