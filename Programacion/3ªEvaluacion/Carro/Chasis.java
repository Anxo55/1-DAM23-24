package Carro;

public class Chasis {

    enum TipoChasis {
       INDEPENDIENTE, MONOCASCO 
    }
    
    private TipoChasis tipoChasis;
    
    public Chasis(TipoChasis tipoChasis) {
        this.tipoChasis = tipoChasis;
    }

    public TipoChasis getTipoChasis() {
        return tipoChasis;
    }

    public void setTipoChasis(TipoChasis tipoChasis) {
        this.tipoChasis = tipoChasis;
    }

    @Override
    public String toString() {
        return "Chasis [tipoChasis=" + tipoChasis + "]";
    }

    
}
