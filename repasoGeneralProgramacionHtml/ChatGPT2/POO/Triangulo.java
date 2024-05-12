package ChatGPT2.POO;

// Crea una clase Triangulo con atributos de longitud de sus lados. 
// Implementa métodos para determinar si es un triángulo equilátero, isósceles o escaleno.

// Si los tres lados son iguales, el triángulo es equilátero.
// Si dos lados son iguales y uno diferente, el triángulo es isósceles.
// Si los tres lados son diferentes, el triángulo es escaleno.

public class Triangulo {

    private int lado1;
    private int lado2;
    private int lado3;

    Triangulo() {
        this.lado1 = 60;
        this.lado2 = 60;
        this.lado3 = 60;
    }

    Triangulo(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

    // Si los tres lados son iguales, el triángulo es equilátero.
    // Si dos lados son iguales y uno diferente, el triángulo es isósceles.
    // Si los tres lados son diferentes, el triángulo es escaleno.

    
    public boolean esEquilatero() {
        return lado1 == lado2 && lado2 == lado3;
    }

    public boolean esIsosceles() {
        return lado1 == lado2 || lado2 ==3 || lado3 == lado1;
    }

    public boolean esEscaleno() {
        return ! esEquilatero() && ! esIsosceles();
    }


    @Override
    public String toString() {
        return "Triangulo [lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + "]";
    }
    
}
