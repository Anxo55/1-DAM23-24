package Propuesto2;

public class ApartaFamiliares extends Apartamento{

    protected static double valorArea=2000;

protected int valorAdministracion;


    public ApartaFamiliares(int idTipo, int area, String direccion, int numHabitaciones, int numBaños, 
            int valorAdministracion) {
        super(idTipo, area, direccion, numHabitaciones, numBaños);
        this.valorAdministracion = valorAdministracion;
        setValorArea(2000);
    }


    @Override
    public String toString() {
        return super.toString()+"Familiar [valorArea=" + valorArea + ", valorAdministracion=" + valorAdministracion + "]";
    }

    
}
