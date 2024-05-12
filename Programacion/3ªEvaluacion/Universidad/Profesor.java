package Universidad;

public class Profesor extends Persona{

    public String departamento;
    public String categoria;
    
    public Profesor(String nombre, String direccion, String departamento, String categoria) {
        super(nombre, direccion);
        this.departamento = departamento;
        this.categoria = categoria;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Profesor [nombre=" + nombre + ", departamento=" + departamento + ", direccion=" + direccion
                + ", categoria=" + categoria + "]";
    }

    public static String corregir() {
        return"Corrijo examenes";
    }

    public static String darClase() {
        return"Dar clase de matematicas, lengua...";
    }
    
    
}
