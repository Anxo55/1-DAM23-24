package POO;

// Crea una clase Empleado con atributos como nombre, salario y departamento. 
// Implementa un método para otorgar un aumento de salario.

public class Empleado {

    private String nombre;
    private int salario;
    private String departamento;

    Empleado() {
        this.nombre = "Adolfo";
        this.salario = 5000;
        this.departamento = "programacion";
    }

    Empleado(String nombre, int salario, String departamento) {
        this.nombre = nombre;
        this.salario = salario;
        this.departamento = departamento;
    }

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

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    // Implementa un método para otorgar un aumento de salario.

    public void aumentoSueldo(int aumento) {
        this.salario += aumento;
    }

    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + ", salario=" + salario + ", departamento=" + departamento + "]";
    }
    
}
