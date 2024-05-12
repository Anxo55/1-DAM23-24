package tres.propuestos;

// Ejercicio de dificultad alta) Se desea conocer el lucky number (número de la suerte) de cualquier persona. El 
// número de la suerte se consigue reduciendo la fecha de nacimiento a un número de un solo dígito. Por ejemplo, 
// la fecha de nacimiento de Emma es la siguiente: 16-08-1973 —► 16+8+1973 = 1997 —► 1+9+9+7=26 —► 2+6 =8. El 
// número de la suerte de Emma será el 8.

import java.util.Scanner;

public class propuesto5b {

    public static int sumaDigitos(int numero) {
        int cifra1, cifra2, cifra3, cifra4;
        cifra1 = numero/1000;
        cifra2 = (numero-1000*cifra1)/100;
        cifra3 = (numero -1000*cifra1 - 100*cifra2)/10;
        cifra4 = numero -1000 * cifra1 - 100*cifra2- 10*cifra3;

        int suma = cifra1+cifra2+cifra3+cifra4;

        return suma;
    }

    //Esto tiene muchas mejoras.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dame tu dia");
        int dia  = sc.nextInt();
        System.out.println("Dime tu mes: ");
        int mes = sc.nextInt();
        System.out.println("Dime tu año: ");
        int año = sc.nextInt();

        int suma = dia+mes+año;
        int lucky = sumaDigitos(suma);

        while (lucky > 9) {
            lucky = sumaDigitos(lucky);
        }

        System.out.println("Lucky es: "+lucky);

        // if (lucky< 10) {
        //      System.out.println("lucky es: "+lucky);
        // }else{
        //     lucky = sumaDigitos(lucky);
        //     System.out.println("lucky es: "+lucky);
        // }
        
    }
    
}
