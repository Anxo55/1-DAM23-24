package Java.Practica1;

public class Empleado {

    protected String nombre;
    protected int ID;
    protected float salarioBase;

    public Empleado(String nombre, int ID, float salarioBase) {

        this.nombre = nombre;
        this.ID = ID;
        this.salarioBase = salarioBase;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + ", ID=" + ID + ", salarioBase=" + salarioBase + "]";
    }
    
}
