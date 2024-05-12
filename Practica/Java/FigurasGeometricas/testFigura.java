package Java.FigurasGeometricas;

import java.util.ArrayList;

public class testFigura {

    public static void main(String[] args) {

        ArrayList<Figura> figuras = new ArrayList<Figura>();

        Circulo circulo = new Circulo("Rojo", 2.5);
        figuras.add(circulo);
        System.out.println(circulo.toString());
        System.out.println("El area del circulo es: "+circulo.calcularArea());

        Cuadrado cuadrado = new Cuadrado("Amarillo", 5);
        figuras.add(cuadrado);
        System.out.println(cuadrado.toString());
        System.out.println("El area del cuadrado es: "+cuadrado.calcularArea());

        Triangulo triangulo = new Triangulo("Azul", 10, 30);
        figuras.add(triangulo);
        System.out.println(triangulo.toString());
        System.out.println("El area del triangulo es: "+triangulo.calcularArea());

        
        
        

    }
    
}
