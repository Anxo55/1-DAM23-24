package variasPracticasJava;

import java.util.Scanner;

public class anioBIsiesto {

    public static boolean esBisiesto(int anio) {

        if ( (anio % 4 == 0 && anio %100 != 0 ) || (anio % 400 == 0)) {
            return true;
        }else{
            return false;
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anio;

        System.out.println("Dame el anio para determinar si es bisiesto: ");
        anio = sc.nextInt();

        if (esBisiesto(anio)) {
            System.out.println("Es anio bisiesto.");
        } else {
            System.out.println("No es anio bisiesto.");
        }
        
    }
    
}
