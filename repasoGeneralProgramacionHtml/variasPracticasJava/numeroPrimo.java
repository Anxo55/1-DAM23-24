package variasPracticasJava;

import java.util.Scanner;

public class numeroPrimo {

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Introduce un número: ");
            int numero = sc.nextInt();
    
            if (esPrimo(numero)) {
                System.out.println(numero + " es un número primo.");
            } else {
                System.out.println(numero + " no es un número primo.");
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


    

