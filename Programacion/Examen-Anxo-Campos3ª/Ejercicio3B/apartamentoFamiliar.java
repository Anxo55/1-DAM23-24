package Ejercicio3B;

public class apartamentoFamiliar extends Apartamento implements Comision{
	
	public static final int VALOR_AREA=2450;// cada metro cuadrado
	
	 protected int valorAdministracion;

	public apartamentoFamiliar(int id, int area, String direccion, int numeroHabitaciones, int numeroBanos,
			int valorAdministracion) {
		super(id, area, direccion, numeroHabitaciones, numeroBanos);
		this.valorAdministracion = valorAdministracion;
	}

	public int getValorAdministracion() {
		return valorAdministracion;
	}

	public void setValorAdministracion(int valorAdministracion) {
		this.valorAdministracion = valorAdministracion;
	}

	@Override
	public String toString() {
		return "apartamentoFamiliar [valorAdministracion=" + valorAdministracion + ", numeroHabitaciones="
				+ numeroHabitaciones + ", numeroBanos=" + numeroBanos + ", id=" + id + ", area=" + area + ", direccion="
				+ direccion + "]";
	}

	@Override
	public double calcularPrecioVenta() {
		// TODO Auto-generated method stub
		return this.area*VALOR_AREA;
	}
	 

	@Override
    public double calcularComision() {
        double comisionBase = 0.05 * calcularPrecioVenta();
        comisionBase += 300 * numeroHabitaciones + 200 * numeroBanos;
        comisionBase += 2 * area;
        return comisionBase;
    }
	
	 

}
