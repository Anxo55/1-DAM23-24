package ModeloA.Ejercicio4B;

public class Oficina extends local{
	
	public static final int VALOR_AREA=3750;// cada metro cuadrado
	
	
	private boolean esGobierno;


	public Oficina(int id, int area, String direccion, tipo tipolocal, boolean esGobierno) {
		super(id, area, direccion, tipolocal);
		this.esGobierno = esGobierno;
	}


	public boolean isEsGobierno() {
		return esGobierno;
	}


	public void setEsGobierno(boolean esGobierno) {
		this.esGobierno = esGobierno;
	}


	@Override
	public String toString() {
		return "Oficina [esGobierno=" + esGobierno + ", tipolocal=" + tipolocal + ", id=" + id + ", area=" + area
				+ ", direccion=" + direccion + "]";
	}

	@Override
	public double calcularPrecioVenta() {
		// TODO Auto-generated method stub
		return this.area*VALOR_AREA;
	}
	

	
	
	
}
