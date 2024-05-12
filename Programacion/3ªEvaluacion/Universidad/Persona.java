package Universidad;

public class Persona {

    public String nombre;
    public String direccion;

    public Persona(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", direccion=" + direccion + "]";
    }

    public static String levantarseDeCama() {
        return"Me estoy levantando de cama";
    }

    public static String desayunar() {
       return "Desayuno unas galletas con un café";
    }

    public static String irParaClase() {
        return"Estoy de camino a clase";
    }

    
    
}
