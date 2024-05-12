package POO4;

// Crea una clase Persona con atributos como nombre, edad, sexo, y métodos para establecer y obtener estos atributos. 
// Luego, crea instancias de esta clase y muestra la información de las personas.

public class Persona {

    private String nombre;
    private int edad;
    private char sexo;

    Persona() {
        this. nombre = "Pepe";
        this.edad = 18;
        this.sexo = 'H';
    }

    Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + "]";
    }
    
}
