package TiendaMascotas;

public class GatosPeloLargo extends Gatos{

    enum tipoGato{ANGORA, HIMALAYO, BALINES, SOMALI}

    protected tipoGato tipogato;

    public GatosPeloLargo(String nombre, int edad, String color, float altura, float longitudDeSalto,
            tipoGato tipogato) {
        super(nombre, edad, color, altura, longitudDeSalto);
        this.tipogato = tipogato;
    }

    public tipoGato getTipogato() {
        return tipogato;
    }

    public void setTipogato(tipoGato tipogato) {
        this.tipogato = tipogato;
    }

    @Override
    public String toString() {
        return "GatosPeloLargo [nombre=" + nombre + ", altura=" + altura + ", edad=" + edad + ", longitudDeSalto="
                + longitudDeSalto + ", color=" + color + ", tipogato=" + tipogato + "]";
    }

    public int pagoImpuestosMunicipales() {
        int suma = super.pagoImpuestosMunicipales();
        suma+=200;
        return suma;
    }
    
}
