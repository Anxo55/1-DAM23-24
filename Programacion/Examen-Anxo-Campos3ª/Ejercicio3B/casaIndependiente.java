package Ejercicio3B;

public class casaIndependiente extends casaUrbana implements Comision{

	public static final int VALOR_AREA=3300;// cada metro cuadrado
	
	public casaIndependiente(int id, int area, String direccion, int numeroHabitaciones, int numeroBanos,
			int numeroPisos) {
		super(id, area, direccion, numeroHabitaciones, numeroBanos, numeroPisos);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String toString() {
		return "casaIndependiente [numeroPisos=" + numeroPisos + ", numeroHabitaciones=" + numeroHabitaciones
				+ ", numeroBanos=" + numeroBanos + ", id=" + id + ", area=" + area + ", direccion=" + direccion + "]";
	}


	@Override
	public double calcularPrecioVenta() {
		// TODO Auto-generated method stub
		return this.area*VALOR_AREA;
	}


	@Override
    public double calcularComision() {
        double comisionBase = 0.07 * calcularPrecioVenta();
        comisionBase += 200 * numeroHabitaciones + 100 * numeroBanos;
        comisionBase += 5 * area;
        return comisionBase;
    }

	
	
	
}
