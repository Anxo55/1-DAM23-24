package Java.Practica1;

public class Contratistas extends Empleado{

    protected float tarifaPorProyecto;
    protected boolean esContratado;
    
    public Contratistas(String nombre, int ID, float salarioBase, float tarifaPorProyecto, boolean esContratado) {
        super(nombre, ID, salarioBase);
        this.tarifaPorProyecto = tarifaPorProyecto;
        this.esContratado = esContratado;
    }

    public float getTarifaPorProyecto() {
        return tarifaPorProyecto;
    }

    public void setTarifaPorProyecto(float tarifaPorProyecto) {
        this.tarifaPorProyecto = tarifaPorProyecto;
    }

    public boolean isEsContratado() {
        return esContratado;
    }

    public void setEsContratado(boolean esContratado) {
        this.esContratado = esContratado;
    }

    @Override
    public String toString() {
        return "Contratistas [nombre=" + nombre + ", tarifaPorProyecto=" + tarifaPorProyecto + ", ID=" + ID
                + ", salarioBase=" + salarioBase + ", esContratado=" + esContratado + "]";
    }

    
    
}
