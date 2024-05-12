package Propuesto2;

public class CasasUrbanas extends Casa{

    public CasasUrbanas(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion,
            int numeroHabitaciones, int numeroBaños, int numPisos) {
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion, numeroHabitaciones, numeroBaños, numPisos);
        
    }

    @Override
    public String toString() {
        return super.toString() + "CasasUrbanas []";
    }
 
}
