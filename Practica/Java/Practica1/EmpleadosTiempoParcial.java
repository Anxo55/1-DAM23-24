package Java.Practica1;

public class EmpleadosTiempoParcial extends Empleado{

    protected float salarioPorHora;
    protected float horasExtrasTrabajadas;
    
    public EmpleadosTiempoParcial(String nombre, int ID, float salarioBase, float salarioPorHora,
            float horasExtrasTrabajadas) {
        super(nombre, ID, salarioBase);
        this.salarioPorHora = salarioPorHora;
        this.horasExtrasTrabajadas = horasExtrasTrabajadas;
    }

    public float getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(float salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    public float getHorasExtrasTrabajadas() {
        return horasExtrasTrabajadas;
    }

    public void setHorasExtrasTrabajadas(float horasExtrasTrabajadas) {
        this.horasExtrasTrabajadas = horasExtrasTrabajadas;
    }

    @Override
    public String toString() {
        return "EmpleadosTiempoParcial [nombre=" + nombre + ", ID=" + ID + ", salarioPorHora=" + salarioPorHora
                + ", salarioBase=" + salarioBase + ", horasExtrasTrabajadas=" + horasExtrasTrabajadas + "]";
    }
    
}
