package segundo.ejemplo2_4;

public class Circulo extends Figura{

    int radio; // Atributo que define el radio de un círculo
	
	Circulo(String nombre, int radio) {
        super(nombre);
	this.radio = radio;
	}
	
	double calcularArea() {
	return Math.PI*Math.pow(radio,2);
	}
	
	double calcularPerimetro() {
	return 2*Math.PI*radio;
	}

    @Override
    public String toString() {
        return super.toString()+"Circulo [radio=" + radio + "]";
    }

}