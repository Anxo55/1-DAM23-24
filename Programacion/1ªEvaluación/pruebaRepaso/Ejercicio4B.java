package pruebaRepaso;

import java.util.Scanner;

//Pasar un numero de sistema decimal a Binario  mediante el siguiente metodo:
//dividiendo sucesivamente entre dos y quedandose con el cociente, hasta la ultima division
//donde el resto ya solo sera cero o uno. El numero convertido se construye desde ese ultimo
//resto anhadiendo despues de los cocientes que hemos ido obteniendo.

public class Ejercicio4B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Dame el valor del numero entero: ");
        numero = sc.nextInt();

       System.out.println("El numero decimal " + numero + " en binario es: " + decimalToBinario(numero));
       System.out.println("El numero decimal " + numero + " en binario es: " + decimalToBinarioRecursivo(numero));
    }

    public static String decimalToBinario(int numero) {
        
        if (numero == 0) {
            return "0";
        }

        String binario = "";
        while (numero > 0) {
            int residuo = numero % 2;
            binario = residuo + binario;
            numero /= 2;
        }

        return binario;
    }

    public static String decimalToBinarioRecursivo(int numero) {
        if (numero == 0) {
            return "0";
        }
    
        return construirBinarioRecursivo(numero, "");
    }
    
    private static String construirBinarioRecursivo(int numero, String binario) {
        if (numero == 0) {
            return binario;
        }
    
        int residuo = numero % 2;
        binario = residuo + binario;
    
        return construirBinarioRecursivo(numero / 2, binario);
    }

}