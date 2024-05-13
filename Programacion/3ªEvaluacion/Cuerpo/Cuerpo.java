package Cuerpo;

public class Cuerpo {
    
    protected Brazo brazoDerecho;
	protected Brazo brazoIzquierdo;
	protected Pierna piernaDerecha;
	protected Pierna piernaIzquierda;
	protected Tronco tronco;
	protected Cabeza cabeza;
	
	//este constr si o no? no es composicion
	/*
	public Cuerpo(Brazo brazoDerecho, Brazo brazoIzquierdo, Pierna piernaDerecha, Pierna piernaIzquierda, Tronco tronco,
			Cabeza cabeza) {
		super();
		this.brazoDerecho = brazoDerecho;
		this.brazoIzquierdo = brazoIzquierdo;
		this.piernaDerecha = piernaDerecha;
		this.piernaIzquierda = piernaIzquierda;
		this.tronco = tronco;
		this.cabeza = cabeza;
	}*/
	
	public Cuerpo() {
		super();
		System.out.println("Creando un cuerpo:");
		this.cabeza=new Cabeza();
		this.brazoDerecho=new Brazo();
		this.brazoIzquierdo=new Brazo();
		this.piernaDerecha=new Pierna();
		this.piernaIzquierda=new Pierna();
		this.tronco=new Tronco();
	}
	
	
	
	@Override
	public String toString() {
		return "Cuerpo [brazoDerecho=" + brazoDerecho + ",\n brazoIzquierdo=" + brazoIzquierdo + ",\n piernaDerecha="
				+ piernaDerecha + ",\n piernaIzquierda=" + piernaIzquierda + ",\\n tronco=" + tronco + ",\\n cabeza=" + cabeza
				+ "]";
	}

	
	
	

}

