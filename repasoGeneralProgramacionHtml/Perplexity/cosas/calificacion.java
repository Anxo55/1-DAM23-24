package Perplexity.cosas;

import java.util.Scanner;

public class calificacion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Declaramos los atributos de las clase calificacion.
        int calificacion;
        boolean seguir = true;

        do {

        System.out.println("Dame una calificacion: ");
        calificacion = sc.nextInt();

        switch (calificacion) {
            case 0,1,2,3,4:
                System.out.println("Tu resultado " +calificacion+ " es insuficiente");
                break;
             
            case 5:
                System.out.println("Tu resultado " +calificacion+ " es suficiente");    
                break;

            case 6: 
                System.out.println("Tu resultado " +calificacion+ " está bien");
                break;
                
            case 7,8 :
                System.out.println("Tu resultado " +calificacion+ " es notable");
                break;

            case 9,10:
                System.out.println("Tu resultado " +calificacion+ " es sobresaliente");  
                break;  
            default:
            seguir = false;
                System.out.println("Opcion incorrecta, cerrando el programa...");
                break;
        }
        
        } while (seguir);

    }
}
