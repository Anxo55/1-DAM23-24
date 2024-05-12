package practicas2;

import java.util.Scanner;

public class tipoEmpleadoDescuento {

    public static double calculoNomina(double nominaBase, boolean altamenteProductivo, boolean esEncargado, boolean tieneInfraccion) {

        if(altamenteProductivo) {
            nominaBase *= 1.10;
        }

        if (esEncargado) {
            nominaBase *=1.20;
        }

        if (tieneInfraccion) {
            nominaBase += 0.85;
        }

        return nominaBase;

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime la nomina base que vas a pasar: ");
        double nominaBase = sc.nextDouble();

        System.out.println("Eres altamenteProductio? true/false");
        boolean altamenteProductio = sc.nextBoolean();

        System.out.println("Eres de tipo esEncargado? true/false");
        boolean esEncargado = sc.nextBoolean();

        System.out.println("Tuviste alguna infracion? true/false");
        boolean tieneInfraccion = sc.nextBoolean();

        double nominaFinal = calculoNomina(nominaBase, altamenteProductio, esEncargado, tieneInfraccion);

        System.out.println("LA nomia final sería: "+nominaFinal);
        
    }
    
}
