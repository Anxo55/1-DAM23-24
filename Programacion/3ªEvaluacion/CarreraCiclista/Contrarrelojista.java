package CarreraCiclista;

public class Contrarrelojista extends Ciclista{
	
	private double velocidadMaxima;
	

	public Contrarrelojista(int identificador, String nombre, double velocidadMax) {
		super(identificador, nombre);
		// TODO Auto-generated constructor stub
		this.velocidadMaxima = velocidadMax;
	}


	@Override
	String imprimirTipo() {
		// TODO Auto-generated method stub
		return "Es un contrarrelojista";
	}
	
	protected void imprimir() {
		super.imprimir();
		System.out.println("Velocidad Maxima" + velocidadMaxima);
	}

}
