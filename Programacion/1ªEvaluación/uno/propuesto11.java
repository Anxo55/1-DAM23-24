package uno;

import java.util.Scanner;

// Realiza un programa con una variable entera t la cual contiene un tiempo en segundos y queremos conocer este 
// tiempo pero expresado en dias, horas, minutos y segundos.

public class propuesto11 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int t;// contiene el tiempo en segundos

        int dias;
        int horas;
        int minutos;
        int segundos;

        System.out.println("Dame el tiempo en segudnos: ");
        t=sc.nextInt();

        // 1 minuto --> 60 segundos
        // X        --> 1000 segundos

        // 1 hora --> 60 minutos
        // X      --> minutos de antes 

        dias = t / (24 * 3600);
        horas = (t % (24 * 3600)) / 3600;
        minutos = ((t % (24 * 3600)) % 3600) / 60;
        segundos = ((t % (24 * 3600)) % 3600) % 60;

        System.out.println("Los dias son: "+dias+ " dias");
        System.out.println("Las horas son: "+horas+ " horas");
        System.out.println("Los minutos son: "+minutos+ " minutos");
        System.out.println("Los segundos son: "+segundos+ " segundos");
        
    }
    
}
