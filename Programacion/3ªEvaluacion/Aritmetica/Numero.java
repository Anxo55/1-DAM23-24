package Aritmetica;

import java.util.Objects;

public class Numero {

    protected double num;
	
	
	public double getNum() {
		return num;
	}
	public void setNum(double num) {
		this.num = num;
	}
	public Numero(double n){
		this.num = n;
	}
	public Numero() {
		this.num = 0;
	}


	@Override
	public String toString() {
		return "numero [num=" + num + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(num);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Numero other = (Numero) obj;
		return Double.doubleToLongBits(num) == Double.doubleToLongBits(other.num);
	}
	
	
	
	public void sumar(Numero num) {
		this.setNum(this.getNum() + num.getNum());
		
	}
	
	public void restar(Numero num) {
		this.setNum(this.getNum()-num.getNum());
	}
	
	public void dividir(Numero num) {
		if(num.getNum()!=0)
		this.setNum(this.getNum() / num.getNum());
		else {
			System.out.println("Operacion no valida");
		}
	}
	
	public void multiplicar(Numero num) {
		this.setNum(this.getNum()*num.getNum());
		
	}


	
	}

	







