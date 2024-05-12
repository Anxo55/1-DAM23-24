package segundo.ejemplo2_4;

public class TtrianguloRectangulo extends Figura{

    enum tipoTriangulo{
        EQUILATERO,ESCALENO, ISOSCELES
    }

    tipoTriangulo nome;

    int base; // Atributo que define la base de un triángulo rectángulo
	int altura; // Atributo que define la altura de un triángulo rectángulo

	TtrianguloRectangulo(String nome, int base, int altura) {
		super(nome);
		this.base = base;
		this.altura = altura;
		setTipoTriangulo();
	}

	

	double calcularArea() {
		return (base * altura / 2);
	}

	double calcularPerimetro() {
		return (base + altura + calculaHipotenusa());
	}

	public double calculaHipotenusa() {
		return Math.sqrt(Math.pow(altura, 2) + Math.pow(base, 2));
	}

	void setTipoTriangulo() {
		if ((base == altura) && (base == calculaHipotenusa()) && (altura == calculaHipotenusa())){
			System.out.println("Es un triángulo equilátero");
            this.nome=tipoTriangulo.EQUILATERO;
    }
		else if ((base != altura) && (base != calculaHipotenusa()) && (altura != calculaHipotenusa())){
			System.out.println("Es un triángulo escaleno");
            this.nome=tipoTriangulo.ESCALENO;
        }else
			System.out.println("Es un triángulo isósceles");
            this.nome=tipoTriangulo.ISOSCELES;
	}

    public tipoTriangulo getNome() {
        return nome;
    }

	@Override
	public String toString() {
		return super.toString()+"TtrianguloRectangulo [nome=" + nome + ", base=" + base + ", altura=" + altura + "]";
	}	

}
