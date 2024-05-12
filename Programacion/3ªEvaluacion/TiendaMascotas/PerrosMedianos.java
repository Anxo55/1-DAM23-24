package TiendaMascotas;

public class PerrosMedianos extends Perros{

   enum razas2{COLLIE, DALMATA, BULLDOG, GALGO, SABUESO}

   protected razas2 raza;

public PerrosMedianos(String nombre, int edad, String color, float peso, boolean muerde, razas2 raza) {
    super(nombre, edad, color, peso, muerde);
    this.raza = raza;
}

public razas2 getRaza() {
    return raza;
}

public void setRaza(razas2 raza) {
    this.raza = raza;
}

@Override
public String toString() {
    return "PerrosMedianos [nombre=" + nombre + ", peso=" + peso + ", edad=" + edad + ", muerde=" + muerde + ", color="
            + color + ", raza=" + raza + "]";
}

public int pagoImpuestosMunicipales() {
    int suma = super.pagoImpuestosMunicipales();
    suma+=120;
    return suma;
}

}
