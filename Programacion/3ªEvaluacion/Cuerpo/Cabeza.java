package Cuerpo;

public class Cabeza {
    
    protected String nombre;
	protected int numOjos;
	protected boolean peludo=true;
	
	protected double longitudSombrero;
	
	

	public Cabeza() {
		super();
	}

	public Cabeza(String nombre, int numOjos, boolean peludo, double longitudSombrero) {
		super();
		this.nombre = nombre;
		this.numOjos = numOjos;
		this.peludo = peludo;
		this.longitudSombrero = longitudSombrero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumOjos() {
		return numOjos;
	}

	public void setNumOjos(int numOjos) {
		this.numOjos = numOjos;
	}

	public boolean isPeludo() {
		return peludo;
	}

	public void setPeludo(boolean peludo) {
		this.peludo = peludo;
	}

	public double getLongitudSombrero() {
		return longitudSombrero;
	}

	public void setLongitudSombrero(double longitudSombrero) {
		this.longitudSombrero = longitudSombrero;
	}

	@Override
	public String toString() {
		return "Cabeza [nombre=" + nombre + ", numOjos=" + numOjos + ", peludo=" + peludo + ", longitudSombrero="
				+ longitudSombrero + "]";
	}
	
	

}

