package Ejercicio3B;

public class casaUrbana extends Casa implements Comision{

	public casaUrbana(int id, int area, String direccion, int numeroHabitaciones, int numeroBanos, int numeroPisos) {
		super(id, area, direccion, numeroHabitaciones, numeroBanos, numeroPisos);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "casaUrbana [numeroPisos=" + numeroPisos + ", numeroHabitaciones=" + numeroHabitaciones
				+ ", numeroBanos=" + numeroBanos + ", id=" + id + ", area=" + area + ", direccion=" + direccion + "]";
	}
	
	@Override
    public double calcularComision() {
        double comisionBase = 0.07 * calcularPrecioVenta();
        comisionBase += 200 * numeroHabitaciones + 100 * numeroBanos;
        comisionBase += 5 * area;
        return comisionBase;
    }

}
