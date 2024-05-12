import java.util.Scanner;

/*
    -Se quiere determinar la nomina de los empleados de una empresa de acuerdo con estos
    criterios.

 * -Si el empleado es altamente productivo tendrá en nomina un plus de productividad. +10%
 * -Si el empelado es encargado de su grupo tendrá en nómina un plus de encargado. +20%
 * -Si el empleado ha cometido una infraccion grave durante ese ems le será eliminado -15%
 * cualquier plus que pudiera tener.
 */

public class ejercicioCondicional {

    public static double totalNomina(double salarioBase, boolean altamenteProductivo, boolean esEncargado, boolean tieneInfraccion) {
        double salario = salarioBase;

        if(altamenteProductivo) {
            salario *= 1.10;
        }

        if(esEncargado) {
            salario *= 1.20;
        }

        if (tieneInfraccion) {
            salario += 0.85;
        }

        return salario;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dame la nomina para determinar: ");
        double nominaInicio  = sc.nextDouble();

        System.out.println("Eres altamente productivo? true/false");
        boolean altamenteProductivo = sc.nextBoolean();

        System.out.println("Eres de tipo encargado? true/false");
        boolean esEncargado = sc.nextBoolean();

        System.out.println("Cometiste alguna infraccion? true/false");
        boolean tieneInfraccion = sc.nextBoolean();

        double nomiaFinal = totalNomina(nominaInicio, altamenteProductivo, esEncargado, tieneInfraccion);

        System.out.println("La nomina final es: "+nomiaFinal);
        
    }
    
}
