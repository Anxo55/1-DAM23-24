package TiendaMascotas;

public class PerrosGrandes extends Perros{

    enum razas{PASTORALEMAN, DOBERMAN, ROTWEILLER, DALMATA, CHIHUAHUA, COLLIE}

    protected razas raza;

    public PerrosGrandes(String nombre, int edad, String color, float peso, boolean muerde, razas raza) {
        super(nombre, edad, color, peso, muerde);
        this.raza = raza;
    }

    public razas getRaza() {
        return raza;
    }

    public void setRaza(razas raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "PerrosGrandes [nombre=" + nombre + ", peso=" + peso + ", edad=" + edad + ", muerde=" + muerde
                + ", color=" + color + ", raza=" + raza + "]";
    }

    public int pagoImpuestosMunicipales() {
        int suma = super.pagoImpuestosMunicipales();
        suma+=150;
        return suma;
    }

}
