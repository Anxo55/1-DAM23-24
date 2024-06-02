package ModeloA.Ejercicio4B;

public class casaUrbana extends Casa {

	public casaUrbana(int id, int area, String direccion, int numeroHabitaciones, int numeroBanos, int numeroPisos) {
		super(id, area, direccion, numeroHabitaciones, numeroBanos, numeroPisos);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "casaUrbana [numeroPisos=" + numeroPisos + ", numeroHabitaciones=" + numeroHabitaciones
				+ ", numeroBanos=" + numeroBanos + ", id=" + id + ", area=" + area + ", direccion=" + direccion + "]";
	}
	
	

}
