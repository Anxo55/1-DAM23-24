package Propuesto2;

public class Vivienda extends Inmueble{

    private int numeroHabitaciones;
    private int numeroBaños;
    
    public Vivienda(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion, int numeroHabitaciones,
            int numeroBaños) {
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion);
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBaños = numeroBaños;
    }

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public int getNumeroBaños() {
        return numeroBaños;
    }

    public void setNumeroBaños(int numeroBaños) {
        this.numeroBaños = numeroBaños;
    }

    @Override
    public String toString() {
        return super.toString() + "Vivienda [numeroHabitaciones=" + numeroHabitaciones + ", numeroBaños=" + numeroBaños + "]";
    }

    
    
}
