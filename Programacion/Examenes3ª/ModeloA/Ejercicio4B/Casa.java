package ModeloA.Ejercicio4B;

public class Casa extends vivienda {
	
	protected int numeroPisos;

	public Casa(int id, int area, String direccion, int numeroHabitaciones, int numeroBanos, int numeroPisos) {
		super(id, area, direccion, numeroHabitaciones, numeroBanos);
		this.numeroPisos = numeroPisos;
	}

	public int getNumeroPisos() {
		return numeroPisos;
	}

	public void setNumeroPisos(int numeroPisos) {
		this.numeroPisos = numeroPisos;
	}

	@Override
	public String toString() {
		return "Casa [numeroPisos=" + numeroPisos + ", numeroHabitaciones=" + numeroHabitaciones + ", numeroBanos="
				+ numeroBanos + ", id=" + id + ", area=" + area + ", direccion=" + direccion + "]";
	}
	

}
