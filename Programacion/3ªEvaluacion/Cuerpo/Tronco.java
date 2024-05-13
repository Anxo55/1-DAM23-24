package Cuerpo;

public class Tronco {
    
    protected String nombre;
	protected double largo;
	protected double ancho;
	protected boolean ombligo=true;
	
	
	public Tronco() {
		super();
	}
	public Tronco(String nombre, double largo, double ancho, boolean ombligo) {
		super();
		this.nombre = nombre;
		this.largo = largo;
		this.ancho = ancho;
		this.ombligo = ombligo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getLargo() {
		return largo;
	}
	public void setLargo(double largo) {
		this.largo = largo;
	}
	public double getAncho() {
		return ancho;
	}
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	public boolean isOmbligo() {
		return ombligo;
	}
	public void setOmbligo(boolean ombligo) {
		this.ombligo = ombligo;
	}
	@Override
	public String toString() {
		return "Tronco [nombre=" + nombre + ", largo=" + largo + ", ancho=" + ancho + ", ombligo=" + ombligo + "]";
	}
	
	
	
	
	

}

