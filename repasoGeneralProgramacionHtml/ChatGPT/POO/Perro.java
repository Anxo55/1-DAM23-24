package ChatGPT.POO;

//  Define métodos para imprimir la información del perro y para hacer que el perro ladre.

public class Perro {

    private String nombre;
    private String raza;
    private int edad;

    //Constructor con todos los paramtros
    public Perro(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    //Constructor con dos parametros 
    public Perro(String raza, int edad) {
        this.raza = raza;
        this.edad = edad;
    }

    //Constructor por defecto
    public Perro() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Perro [nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + "]";
    }

}
