package herenciaInmuebles;

public class casaRural extends Casa {
	
	
	public static final int VALOR_AREA=1500;// cada metro cuadrado
	
	protected int distanciaCabecera;
	protected int altura;
	
	
	public casaRural(int id, int area, String direccion, int numeroHabitaciones, int numeroBanos, int numeroPisos,
			int distanciaCabecera, int altitud) {
		super(id, area, direccion, numeroHabitaciones, numeroBanos, numeroPisos);
		this.distanciaCabecera = distanciaCabecera;
		this.altura = altura;
	}


	public int getDistanciaCabecera() {
		return distanciaCabecera;
	}


	public int getAltura() {
		return altura;
	}


	public void setDistanciaCabecera(int distanciaCabecera) {
		this.distanciaCabecera = distanciaCabecera;
	}


	public void setAltitud(int altitud) {
		this.altura = altura;
	}


	@Override
	public String toString() {
		return "casaRural [distanciaCabecera=" + distanciaCabecera + ", altura=" + altura + ", numeroPisos="
				+ numeroPisos + ", numeroHabitaciones=" + numeroHabitaciones + ", numeroBanos=" + numeroBanos + ", id="
				+ id + ", area=" + area + ", direccion=" + direccion + "]";
	}


	@Override
	public double calcularPrecioVenta() {
		// TODO Auto-generated method stub
		return this.area*VALOR_AREA;
	}
	
	
	
}
