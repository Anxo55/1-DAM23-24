package cosasVarias;

import java.util.Scanner;

public class CalcularDNIDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce los primeros 8 dígitos del DNI: ");
        int dni = scanner.nextInt();
        
        int resto = dni % 23;
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        
        char letraDNI = letras[resto];
        
        System.out.println("El dígito de control del DNI es: " + letraDNI);
        
        scanner.close();
    }
}
