package TiendaMascotas;

public class GatosSinPelo extends Gatos{

    enum tipoGato3{ESFINGE, ELFO, DONSKOY}

    protected tipoGato3 tipogato;

    public GatosSinPelo(String nombre, int edad, String color, float altura, float longitudDeSalto, tipoGato3 tipogato) {
        super(nombre, edad, color, altura, longitudDeSalto);
        this.tipogato= tipogato;
    }

    public tipoGato3 getTipogato() {
        return tipogato;
    }

    public void setTipogato(tipoGato3 tipogato) {
        this.tipogato = tipogato;
    }

    @Override
    public String toString() {
        return "GatosSinPelo [nombre=" + nombre + ", altura=" + altura + ", edad=" + edad + ", longitudDeSalto="
                + longitudDeSalto + ", color=" + color + ", tipogato=" + tipogato + "]";
    }

    public int pagoImpuestosMunicipales() {
        int suma = super.pagoImpuestosMunicipales();
        suma+=50;
        return suma;
    }
    
}
