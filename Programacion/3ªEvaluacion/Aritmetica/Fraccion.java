package Aritmetica;

public class Fraccion extends Numero{

    private Numero numerador;
	private Numero denominador;
	
	public Numero getNumerador() {
		return numerador;
	}

	public void setNumerador(Numero numerador) {
		this.numerador = numerador;
	}

	public Numero getDenominador() {
		return denominador;
	}

	public void setDenominador(Numero denominador) {
		this.denominador = denominador;
	}

	Fraccion(Numero nu, Numero d) {
		
		this.numerador = nu;
		this.denominador = d;
		// TODO Auto-generated constructor stub
	}

	public void sumar(Fraccion otra) {
		Fraccion f = null;
		double num1 = this.getNumerador().getNum();
		double den1 = this.getDenominador().getNum();
		double num2 = otra.getNumerador().getNum();
		double den2 = otra.getNumerador().getNum();
		double aux = den1*den2;
		this.setNumerador(new Numero( (aux/den1)*num1 + (aux/den2)*num2) );
		this.setDenominador(new Numero(aux));
		
	}
	public void restar(Fraccion otra) {
		Fraccion f = null;
		double num1 = this.getNumerador().getNum();
		double den1 = this.getDenominador().getNum();
		double num2 = otra.getNumerador().getNum();
		double den2 = otra.getNumerador().getNum();
		double aux = den1*den2;
		this.setNumerador(new Numero( (aux/den1)*num1 - (aux/den2)*num2) );
		this.setDenominador(new Numero(aux));
		
	}
	
	public void multiplicar(Fraccion otra) {
		double num1 = this.getNumerador().getNum();
		double den1 = this.getDenominador().getNum();
		double num2 = otra.getNumerador().getNum();
		double den2 = otra.getNumerador().getNum();
		double aux = den1*den2;
		this.setDenominador(new Numero(num1*num2));
		this.setDenominador(new Numero(aux));
	}

	@Override
	public String toString() {
		return "Fraccion [numerador=" + numerador + ", denominador=" + denominador + "]";
	}



	
	
	

}
