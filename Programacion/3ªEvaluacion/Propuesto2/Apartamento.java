package Propuesto2;

public class Apartamento extends Vivienda{


 public Apartamento(int idTipo, int area, String direccion, int numHabitaciones, int numBaños) {
        super(idTipo, area, direccion, numHabitaciones, numBaños);

    }


    @Override
    public String toString() {
        return super.toString()+ "Apartamento []";
    }

}