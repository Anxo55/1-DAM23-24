package tres.resueltos;

import java.util.Scanner;

// 4. Realiza un método que, dado un número de tres cifras, averigüe si es un número Armstrong. Un número es 
// Armstrong cuando la suma de cada uno de los números que lo componen elevado al número de dígitos de dicho 
// número da como resultado el propio número. Como esta definición es algo compleja, con la siguiente imagen se verá 
// más claro qué es un número Armstrong:

public class resuelto4b {

    //en el metodo meustra unicamente los numeros que sons primos.

    public static void esAmostrong(int numero) {

        int cifra1, cifra2, cifra3;
        cifra1 = numero/100;
        // System.out.println("Cifra1: "+cifra1);
        cifra2 = (numero - 100*cifra1)/10;
        // System.out.println("Cifra2: "+cifra2);
        cifra3 = numero - 100*cifra1 - 10*cifra2;
        // System.out.println("Cifra3: "+cifra3);

        int suma = (int )(Math.pow(cifra1,3)+Math.pow(cifra2, 3)+Math.pow(cifra3, 3));
        
        if(numero == suma) {
            System.out.println("El numero "+numero+ " es Amstrong");
        }/*else{
            System.out.println("El numero "+numero+" no es Amstrong");
        }*/
    }

    

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int numero;

        // System.out.println("Dame un numero de tres cifras para saber si es Amstrong: ");
        // numero = sc.nextInt();

        // esAmostrong(numero);

        for(int i=100; i<1000; i++) {
            esAmostrong(i);
        }
        
    }
}
    

