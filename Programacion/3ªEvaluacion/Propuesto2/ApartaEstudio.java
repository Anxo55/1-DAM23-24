package Propuesto2;

public class ApartaEstudio extends Apartamento{

    protected static double valorArea=1500;

    public ApartaEstudio(int idTipo, int area, String direccion, int numHabitaciones, int numBaños) {
        super(idTipo, area, direccion, 1,2);
        setValorArea(1500);
    }

    @Override
    public String toString() {
        return super.toString()+ "Estudio []";
    }

    
}
    

