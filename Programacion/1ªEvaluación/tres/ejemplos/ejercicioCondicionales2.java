package tres.ejemplos;

import java.util.Scanner;

/*
    -Se quiere determinar la nomina de los empleados de una empresa de acuerdo con estos
    criterios.

 * -Si el empleado es altamente productivo tendrá en nomina un plus de productividad. +10%
 * -Si el empelado es encargado de su grupo tendrá en nómina un plus de encargado. +20%
 * -Si el empleado ha cometido una infraccion grave durante ese ems le será eliminado -15%
 * cualquier plus que pudiera tener.
 */

public class ejercicioCondicionales2 {
    
    public static double calcularNomina(double salarioBase, boolean altamenteProductivo, boolean esEncargado, boolean infraccionGrave) {
        double salario = salarioBase;

        if (altamenteProductivo) {
            salario *= 1.10;
        }

        if (esEncargado) {
            salario *= 1.20;
        }

        if (infraccionGrave) {
            salario *= 0.85;
        }

        return salario;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el salario base del empleado: ");
        double salarioBase = sc.nextDouble();

        System.out.print("¿Es el empleado altamente productivo? (true/false): ");
        boolean altamenteProductivo = sc.nextBoolean();

        System.out.print("¿Es el empleado un encargado? (true/false): ");
        boolean esEncargado = sc.nextBoolean();

        System.out.print("¿El empleado cometió una infracción grave este mes? (true/false): ");
        boolean infraccionGrave = sc.nextBoolean();

        double nomina = calcularNomina(salarioBase, altamenteProductivo, esEncargado, infraccionGrave);

        System.out.println("La nómina calculada es: " + nomina);
    }
}