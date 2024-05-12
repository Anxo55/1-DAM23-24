package TiendaMascotas;

public class PerrosPequeños extends Perros{

    enum razas3{CANICHE, YORKSHIRE_TERRIER, SCHNAUZER, CHIHUAHUA}

    protected razas3 raza;

    public PerrosPequeños(String nombre, int edad, String color, float peso, boolean muerde, razas3 raza) {
        super(nombre, edad, color, peso, muerde);
        this.raza = raza;
    }

    public razas3 getRaza() {
        return raza;
    }

    public void setRaza(razas3 raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "PerrosPequeños [nombre=" + nombre + ", peso=" + peso + ", edad=" + edad + ", muerde=" + muerde
                + ", color=" + color + ", raza=" + raza + "]";
    }

    public int pagoImpuestosMunicipales() {
        int suma = super.pagoImpuestosMunicipales();
        suma+=100;
        return suma;
    }

}
