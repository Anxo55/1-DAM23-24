package ModeloB.Ejercicio4B;

public class Apartamento extends vivienda {

	public Apartamento(int id, int area, String direccion, int numeroHabitaciones, int numeroBanos) {
		super(id, area, direccion, numeroHabitaciones, numeroBanos);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Apartamento [numeroHabitaciones=" + numeroHabitaciones + ", numeroBanos=" + numeroBanos + ", id=" + id
				+ ", area=" + area + ", direccion=" + direccion + ", precioVenta=" + precioVenta + "]";
	}

	
}
