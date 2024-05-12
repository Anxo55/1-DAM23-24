package Propuesto2;

public class CasaIndependiente extends CasasUrbanas{

    protected static double valorArea=3000;

    public CasaIndependiente(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion,
            int numeroHabitaciones, int numeroBaños, int numPisos) {
            super(identificadorInmobiliario, areaMetrosCuadrados, direccion, numeroHabitaciones, numeroBaños, numPisos);
        
    }

    @Override
    public String toString() {
        return super.toString() + "CasaIndependiente []";
    }

    
}
