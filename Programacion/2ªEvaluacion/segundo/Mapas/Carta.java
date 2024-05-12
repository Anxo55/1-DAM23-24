package segundo.Mapas;

public class Carta implements Comparable {

	String valor;
	String palo;

	static final String[] valores = { "as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo", "rey"};
	static final String[] palos = { "oros", "copas", "espadas", "bastos" };

	public static int dimeIndice(String s) {
		int vuelta = -1;

		for(int i=0; i<palos.length; i++) {
			if(palos[i].equals(s))
			vuelta=i;
		}
		return vuelta;

	}

	public String generaPalo() {
		int ind = (int) (Math.random() * 4);
		return palos[ind];
	}

	public String generaValor() {
		int ind = (int) (Math.random() * 10);
		return valores[ind];

	}

	Carta() {
		this.valor = generaValor();
		this.palo = generaPalo();
	}

	public String getValor() {
		return valor;
	}

	public String getPalo() {
		return palo;
	}

	@Override
	public String toString() {
		return "Carta [valor=" + valor + ", palo=" + palo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((palo == null) ? 0 : palo.hashCode());
		result = prime * result + ((valor == null) ? 0 : valor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carta other = (Carta) obj;
		if (palo == null) {
			if (other.palo != null)
				return false;
		} else if (!palo.equals(other.palo))
			return false;
		if (valor == null) {
			if (other.valor != null)
				return false;
		} else if (!valor.equals(other.valor))
			return false;
		// son iguales si tienen el mismo palo y el mismo valor
		return true;
	}

	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		// primero por palo
		Carta car = (Carta) obj;

		//si son palos distintos ordena por palo
		if (!this.getPalo().equals(car.getPalo()))
			return dimeIndice(this.getValor()) - dimeIndice(car.getValor());
		//si son del mismo palo ordena por valor
		else
			return this.getValor().compareTo(car.getValor());

	}

}
