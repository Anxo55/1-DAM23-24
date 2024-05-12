package tres.propuestos;

import java.util.Scanner;

public class propuesto9 {
    
 public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Introduce un número: ");
            int numero = sc.nextInt();
    
            if (esPrimo(numero)) {
                System.out.println(numero + " es un número primo.");
            } else {
                System.out.println(numero + " no es un número primo.");
            }

            System.out.println("El numero invertido es: "+invierteNumero(numero));

            if (esOmirp(numero)) {
                System.out.println(numero+" es primo al derecho e invetido");
            }else{
                System.out.println(numero+" no es Omirp");
            }
        }
    
        public static int invierteNumero(int numero) {
            int invertido = 0;
            while (numero > 0) {
                int digito = numero % 10;
                invertido = invertido * 10 + digito;
                numero /= 10;
            }
            return invertido;
        }

        public static boolean esOmirp(int numero) {
            // 1 comprobamos si es primo
            // 2 invertimos
            // comprobamos si tambien es primo
            // devuelvo true si 1 y 3 son true.

            if (esPrimo(numero) && esPrimo(invierteNumero(numero))) {
                return true;
            }else{
                return false;
            }
        }
    
    
        public static boolean esPrimo(int numero) {
            
            if (numero <= 1) {
                return false;  // Los números menores o iguales a 1 no son primos
            }
            if (numero <= 3) {
                return true;   // 2 y 3 son primos
            }
            if (numero % 2 == 0 || numero % 3 == 0) {
                return false;  // Los múltiplos de 2 o 3 no son primos
            }
    
            for (int i = 5; i * i <= numero; i += 6) {
                if (numero % i == 0 || numero % (i + 2) == 0) {
                    return false;  // Si es divisible por i o i + 2, no es primo
                }
            }
    
            return true;
        
        }
    }
