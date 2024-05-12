package Java.Practica1;

public class EmpeladosTiempoCompleto extends Empleado{

    protected float salarioAnualFIjo;
    protected boolean seguroMedico;
    protected float pagasVacaciones;
    
    public EmpeladosTiempoCompleto(String nombre, int ID, float salarioBase, float salarioAnualFIjo,
            boolean seguroMedico, float pagasVacaciones) {
        super(nombre, ID, salarioBase);
        this.salarioAnualFIjo = salarioAnualFIjo;
        this.seguroMedico = seguroMedico;
        this.pagasVacaciones = pagasVacaciones;
    }

    public float getSalarioAnualFIjo() {
        return salarioAnualFIjo;
    }

    public void setSalarioAnualFIjo(float salarioAnualFIjo) {
        this.salarioAnualFIjo = salarioAnualFIjo;
    }

    public boolean isSeguroMedico() {
        return seguroMedico;
    }

    public void setSeguroMedico(boolean seguroMedico) {
        this.seguroMedico = seguroMedico;
    }

    public float getPagasVacaciones() {
        return pagasVacaciones;
    }

    public void setPagasVacaciones(float pagasVacaciones) {
        this.pagasVacaciones = pagasVacaciones;
    }

    @Override
    public String toString() {
        return "EmpeladosTiempoCompleto [nombre=" + nombre + ", ID=" + ID + ", salarioAnualFIjo=" + salarioAnualFIjo
                + ", salarioBase=" + salarioBase + ", seguroMedico=" + seguroMedico + ", pagasVacaciones="
                + pagasVacaciones + ", isSeguroMedico()=" + isSeguroMedico() + "]";
    }

    
    
}
