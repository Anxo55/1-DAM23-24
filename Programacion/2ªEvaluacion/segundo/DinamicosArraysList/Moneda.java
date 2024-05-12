package segundo.DinamicosArraysList;

public class Moneda {
    
    String valor;
	static final String[] facial = { "1 centimo", "2 centimos", "5 centimos", "10 centimos", "20 centimos", "50 centimos",
			"1 euro", "2 euros" };
	String lado;
	static final String[] side = { "cara", "cruz" };

	// atributos

	Moneda() {
		this.valor = facial[(int) (Math.random() * 8)];
		this.lado = side[(int) (Math.random()*2)];
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getLado() {
		return lado;
	}

	public void setLado(String lado) {
		this.lado = lado;
	}

	public Moneda(String valor, String lado) {
		super();
		this.valor = valor;
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "Moneda [valor=" + valor + ", lado=" + lado + "]";
	}
	
}