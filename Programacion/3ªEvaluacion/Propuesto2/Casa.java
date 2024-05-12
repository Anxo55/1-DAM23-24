package Propuesto2;

public class Casa extends Vivienda{

    private int numPisos;

    public Casa(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion, int numeroHabitaciones,
            int numeroBaños, int numPisos) {
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion, numeroHabitaciones, numeroBaños);
        this.numPisos = numPisos;
    }

    @Override
    public String toString() {
        return super.toString() + "Casa [numPisos=" + numPisos + "]";
    }


}
