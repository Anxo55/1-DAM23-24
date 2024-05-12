package tres.propuestos;

import java.util.Scanner;

public class propuesto5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de Número de la Suerte");
        System.out.print("Ingresa tu fecha de nacimiento (en formato DDMMYYYY): ");
        String fechaNacimiento = scanner.nextLine();

        int luckyNumber = calcularLuckyNumber(fechaNacimiento);
        System.out.println("Tu número de la suerte es: " + luckyNumber);
    }

    public static int calcularLuckyNumber(String fechaNacimiento) {
        int sumatoria = 0;

        for (int i = 0; i < fechaNacimiento.length(); i++) {
            char caracter = fechaNacimiento.charAt(i);
            if (Character.isDigit(caracter)) {
                int digito = Character.getNumericValue(caracter);
                sumatoria += digito;
            }
        }

        // Puedes agregar reglas adicionales para calcular el número de la suerte
        // Aquí simplemente sumamos todos los dígitos de la fecha de nacimiento.

        return sumatoria;
    }
}
