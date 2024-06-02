package ModeloA.Ejercicio4B;

public class LocalComercial extends local {

	public static final int VALOR_AREA=3350;// cada metro cuadrado
	
	protected String centroComercial;

	public LocalComercial(int id, int area, String direccion, tipo tipolocal, String centroComercial) {
		super(id, area, direccion, tipolocal);
		this.centroComercial = centroComercial;
	}

	public String getCentroComercial() {
		return centroComercial;
	}

	public void setCentroComercial(String centroComercial) {
		this.centroComercial = centroComercial;
	}

	@Override
	public String toString() {
		return "LocalComercial [centroComercial=" + centroComercial + ", tipolocal=" + tipolocal + ", id=" + id
				+ ", area=" + area + ", direccion=" + direccion + "]";
	}

	@Override
	public double calcularPrecioVenta() {
		// TODO Auto-generated method stub
		return this.area*VALOR_AREA;
	}
	
	
	
	
	
	

}
