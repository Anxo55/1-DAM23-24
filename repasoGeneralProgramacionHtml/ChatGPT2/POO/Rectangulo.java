package ChatGPT2.POO;

import java.util.Scanner;

// Crea una clase Rectangulo que tenga atributos de ancho y alto.
// Implementa métodos para calcular el área y el perímetro del rectángulo.

public class Rectangulo {

    static Scanner sc;

    private int ancho;
    private int alto;

    //Constructor por defecto
    Rectangulo() {
        this.ancho = 20;
        this.alto = 15;
    }

    //Constructor con todos los parametros de la clase
    public Rectangulo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public void arearRectangulo(int lado1, int lado2) {
        double area;
        area = lado1*lado2;
        System.out.println("El area del rectangulo es: "+area);
    }

    public void perimetroRectangulo(int lado1, int lado2) {
        double perimetro;
        perimetro = 2 *(lado1 + lado2);
        System.out.println("El perimetro del rectangulo es: "+perimetro);

    }

    // double perimetro = 2 * (lado1 + lado2);
    //     double area = lado1 * lado2;

    @Override
    public String toString() {
        return "Rectangulo [ancho=" + ancho + ", alto=" + alto + "]";
    }
    
}
