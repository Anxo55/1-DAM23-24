package tres.propuestos;

import java.util.Scanner;

public class propuesto8b {

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número (entre 1 y 3999): ");
        int numeroDecimal = scanner.nextInt();

        if (numeroDecimal <= 0 || numeroDecimal > 3999) {
            System.out.println("El número debe estar en el rango de 1 a 3999");
        } else {
            String numeroRomano = decimalToRomano(numeroDecimal);
            System.out.println(numeroDecimal + " en formato romano es: " + numeroRomano);
        }

        scanner.close();
    }

    public static String decimalToRomano(int numero) {
        String resultado = "";

        while (numero > 0) {
            if (numero >= 1000) {
                resultado += "M";
                numero -= 1000;
            } else if (numero >= 900) {
                resultado += "CM";
                numero -= 900;
            } else if (numero >= 500) {
                resultado += "D";
                numero -= 500;
            } else if (numero >= 400) {
                resultado += "CD";
                numero -= 400;
            } else if (numero >= 100) {
                resultado += "C";
                numero -= 100;
            } else if (numero >= 90) {
                resultado += "XC";
                numero -= 90;
            } else if (numero >= 50) {
                resultado += "L";
                numero -= 50;
            } else if (numero >= 40) {
                resultado += "XL";
                numero -= 40;
            } else if (numero >= 10) {
                resultado += "X";
                numero -= 10;
            } else if (numero >= 9) {
                resultado += "IX";
                numero -= 9;
            } else if (numero >= 5) {
                resultado += "V";
                numero -= 5;
            } else if (numero >= 4) {
                resultado += "IV";
                numero -= 4;
            } else {
                resultado += "I";
                numero -= 1;
            }
        }

        return resultado;
    }
}
