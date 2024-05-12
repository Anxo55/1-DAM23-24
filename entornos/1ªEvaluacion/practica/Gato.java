public class Gato {

    private char color;
    private String nombre;

//cosntructor por defecto sin parametros
public Gato() {

}

//Constructor con todos los parametros
public Gato(char color, String nombre) {
    this.color = color;
    this.nombre = nombre;
}

//Constructor con el parametro color
public Gato(char color) {
    this.color = color;
}

//COnstructor con el parametros nombre
public Gato(String nombre) {
    this.nombre = nombre;
}

public char getColor() {
    return color;
}

public void setColor(char color) {
    this.color = color;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

@Override
public String toString() {
    return "Gato [color=" + color + ", nombre=" + nombre + "]";
}   
    
}
