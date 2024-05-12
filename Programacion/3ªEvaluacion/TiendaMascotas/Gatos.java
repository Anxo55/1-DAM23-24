package TiendaMascotas;

public class Gatos extends Mascota{

    protected float altura;
    protected float longitudDeSalto;

    
    public Gatos(String nombre, int edad, String color, float altura, float longitudDeSalto) {
        super(nombre, edad, color);
        this.altura = altura;
        this.longitudDeSalto = longitudDeSalto;
    }


    @Override
    public String toString() {
        return "Gatos [nombre=" + nombre + ", altura=" + altura + ", edad=" + edad + ", longitudDeSalto="
                + longitudDeSalto + ", color=" + color + "]";
    }

    public static String maullar(){
        return "Los gatos maúllan y ronronean";
    }

    public int pagoImpuestosMunicipales() {
        int suma = super.pagoImpuestosMunicipales();
        suma+=75;
        return suma;
    }
    
}
