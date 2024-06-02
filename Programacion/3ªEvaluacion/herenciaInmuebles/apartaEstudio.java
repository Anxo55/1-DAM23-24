package herenciaInmuebles;

public class apartaEstudio extends Apartamento {

	
	public static final int VALOR_AREA=1500;// cada metro cuadrado
	
	
	public apartaEstudio(int id, int area, String direccion, int numeroHabitaciones, int numeroBanos) {
		super(id, area, direccion, numeroHabitaciones, numeroBanos);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "apartaEstudio [numeroHabitaciones=" + numeroHabitaciones + ", numeroBanos=" + numeroBanos + ", id=" + id
				+ ", area=" + area + ", direccion=" + direccion + "]";
	}


	@Override
	public double calcularPrecioVenta() {
		// TODO Auto-generated method stub
		return this.area*VALOR_AREA;
	}




	
}
