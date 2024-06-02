package ModeloB.Ejercicio4B;

public class vivienda extends Inmuebles {

	// ----ATRIBUTOS NUEVOS----
	protected int numeroHabitaciones;
	protected int numeroBanos;
	
	
	///-------CONSTRUCTOR----
	public vivienda(int id, int area, String direccion, int numeroHabitaciones, int numeroBanos) {
		super(id, area, direccion);
		this.numeroHabitaciones = numeroHabitaciones;
		this.numeroBanos = numeroBanos;
	}

	
	//GETTER AND SETTER---
	public int getNumeroHabitaciones() {
		return numeroHabitaciones;
	}

	public int getNumeroBanos() {
		return numeroBanos;
	}

	public void setNumeroHabitaciones(int numeroHabitaciones) {
		this.numeroHabitaciones = numeroHabitaciones;
	}

	public void setNumeroBanos(int numeroBanos) {
		this.numeroBanos = numeroBanos;
	}

	
	//----TOSTRING---
	@Override
	public String toString() {
		return "vivienda [numeroHabitaciones=" + numeroHabitaciones + ", numeroBanos=" + numeroBanos + "]";
	}
	
	
}
