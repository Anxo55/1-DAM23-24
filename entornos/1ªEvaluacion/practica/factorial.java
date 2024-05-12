import java.util.Scanner;

// programa que nos haga el factorial de un numero.

public class factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número para calcular su factorial: ");
        int numero = sc.nextInt();
        
        int factorial = calcularFactorial(numero);
        
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
    
    public static int calcularFactorial(int numero) {
        
        if (numero < 0) {
            System.out.println("EL numero no debe ser negativo");
        }
        
        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }
}

