package Swing.Practica3;

public class Cono extends FiguraGeometrica {
    private double radio;
    private double altura;

    public Cono(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
        this.setVolumen(calcularVolumen()); // Calcula el volumen y establece su atributo
        this.setSuperficie(calcularSuperficie()); // Calcula la superficie y establece su atributo
    }

    /**
     * Método para calcular el volumen de un cono
     *
     * @return El volumen de un cono
     */
    public double calcularVolumen() {
        return (Math.PI * Math.pow(radio, 2) * altura) / 3;
    }

    /**
     * Método para calcular la superficie de un cono
     *
     * @return La superficie de un cono
     */
    public double calcularSuperficie() {
        double generatriz = Math.sqrt(Math.pow(radio, 2) + Math.pow(altura, 2));
        double areaLateral = Math.PI * radio * generatriz;
        double areaBase = Math.PI * Math.pow(radio, 2);
        return areaLateral + areaBase;
    }
}
