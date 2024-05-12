//package ModeloB22-23;

import java.util.Scanner;

public class Ejercicio3B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ejemplo de uso del primer método (kg a stones y libras)
        System.out.print("Ingrese el peso en kilogramos: ");
        double pesoKg = scanner.nextDouble();
        convertirKgAStonesLibras(pesoKg);

        // Ejemplo de uso del segundo método (stones y libras a kg)
        System.out.print("Ingrese el peso en stones: ");
        double stones = scanner.nextDouble();
        System.out.print("Ingrese el peso en libras: ");
        double libras = scanner.nextDouble();
        double pesoKgConvertido = convertirStonesLibrasAKg(stones, libras);

        System.out.println("El peso equivalente en kilogramos es: " + pesoKgConvertido + " kg");

        scanner.close();
    }

    // Método para convertir de kilogramos a stones y libras
    public static void convertirKgAStonesLibras(double pesoKg) {
        double conversionStones = pesoKg / 6.35; // 1 stone = 6.35 kg
        int stones = (int) conversionStones;
        double libras = (conversionStones - stones) * 14; // 1 stone = 14 lb

        System.out.println("El peso equivalente es: " + stones + " stones y " + libras + " libras");
    }

    // Método para convertir de stones y libras a kilogramos
    public static double convertirStonesLibrasAKg(double stones, double libras) {
        double pesoKg = (stones * 6.35) + (libras * 0.453); // 1 stone = 6.35 kg, 1 lb = 0.453 kg
        return pesoKg;
    }
}
    

