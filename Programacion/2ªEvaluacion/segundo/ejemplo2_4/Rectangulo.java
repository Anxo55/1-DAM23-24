package segundo.ejemplo2_4;

public class Rectangulo extends Figura{

    int base; // Atributo que define la base de un rectángulo
	int altura; // Atributo que define la altura de un rectángulo
	
	Rectangulo(String nombre, int base, int altura) {
    super(nombre);
	this.base = base;
	this.altura = altura;
	}
	
	double calcularArea() {
	return base * altura;
	}
	
	double calcularPerimetro() {
	return (2 * base) + (2 * altura);
	}

    @Override
    public String toString() {
        return super.toString()+"Rectangulo [base=" + base + ", altura=" + altura + "]";
    }

}
