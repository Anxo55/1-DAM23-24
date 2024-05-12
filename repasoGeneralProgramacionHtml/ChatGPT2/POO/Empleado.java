package ChatGPT2.POO;

// Crea una clase Empleado con atributos de nombre, salario y fecha de contratación. 
// Implementa un método que calcule el salario anual del empleado.

public class Empleado {

    //atributos o parametros de la clase empleado
    private String nombre;
    private int salario;
    private int fechaContratacion;

    //constructor por defecto con parametros indicados
    Empleado() {
        this.nombre = "Adolfo";
        this.salario = 2500;
        this.fechaContratacion = 2010;
    }

    //constructor con todos los parametros
    Empleado(String nombre, int salario, int fechaContratacion) {
        this.nombre = nombre;
        this.salario = salario;
        this.fechaContratacion = fechaContratacion;
    }

    //metodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(int fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    // Implementa un método que calcule el salario anual del empleado.

   public double salarioAnual() {
    double salarioAnual = this.salario * 12;
    return salarioAnual;    
   }

    //metodo toString para mostrar
    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + ", salario=" + salario + ", fechaContratacion=" + fechaContratacion + "]";
    }
    
}
