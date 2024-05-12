package tres.propuestos;

import java.util.Scanner;

public class Amstrong {

    public static boolean esAmstrong(int numero) {
        int sumaDigitos = sumaDigitos(numero);
        int numeroDigitos = cuentaDigitos(numero);
        return numero == calcularPotenciaDigitos(sumaDigitos, numeroDigitos);
    }

    public static int sumaDigitos(int numero) {
        int suma = 0;
        while (numero > 0) {
            int digito = numero % 10;
            suma += digito;
            numero /= 10;
        }
        return suma;
    }

    public static int calcularPotenciaDigitos(int numero, int digitos) {
        int resultado = 0;
        int originalNumero = numero;
    
        while (originalNumero > 0) {
            int digito = originalNumero % 10;
            resultado += Math.pow(digito, digitos); // Aquí se corrige el cálculo de la potencia
            originalNumero /= 10;
        }
    
        return resultado;
    }

    public static int cuentaDigitos(int numero) {
        int digitos = 0;
        while (numero > 0) {
            numero /= 10;
            digitos++;
        }
        return digitos;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un número: ");
        int numero = sc.nextInt();
        
        int total = sumaDigitos(numero);
        System.out.println("Suma de dígitos: " + total);
        
        int resultadoDigitos = cuentaDigitos(numero);        
        System.out.println("Tiene dígitos: " + resultadoDigitos);
        
        System.out.println("Es Armstrong: " + esAmstrong(numero));
    }
}