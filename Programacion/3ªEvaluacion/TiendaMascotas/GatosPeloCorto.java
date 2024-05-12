package TiendaMascotas;

public class GatosPeloCorto extends Gatos{

    enum tipoGato2{AZUL_RUSO, BRITA_NICO, MANX, DEVON_REX}

    protected tipoGato2 tipogato;

    public GatosPeloCorto(String nombre, int edad, String color, float altura, float longitudDeSalto,
            tipoGato2 tipogato) {
        super(nombre, edad, color, altura, longitudDeSalto);
        this.tipogato = tipogato;
    }

    public tipoGato2 getTipogato() {
        return tipogato;
    }

    public void setTipogato(tipoGato2 tipogato) {
        this.tipogato = tipogato;
    }

    @Override
    public String toString() {
        return "GatosPeloCorto [nombre=" + nombre + ", altura=" + altura + ", edad=" + edad + ", longitudDeSalto="
                + longitudDeSalto + ", color=" + color + ", tipogato=" + tipogato + "]";
    }

    public int pagoImpuestosMunicipales() {
        int suma = super.pagoImpuestosMunicipales();
        suma+=100;
        return suma;
    }
    
}
