// La política de cobro de una compañía telefónica es:
// Cuando se realiza una llamada, el cobro es por el tiempo que está dura, 
// de tal forma que los primeros cinco minutos cuestan 1 euro, los siguientes tres, 
// 80 céntimos, los siguientes dos minutos a 70 céntimos y a partir del décimo minuto, 50 céntimos.
// Además, se carga un impuesto de 3% cuando es domingo, y si es otro día, en turno de mañana 15% 
// y en turno de tarde 10%.
// Realiza un programa para determinar cuánto debe pagar por cada concepto una persona que realiza una 
// llamada.


// COMENTARIO!!
// En la siguiente clase, cree un metodo donde obteniendo la condicion de cada variable, le devolvia un precio al precioInicial, con cada booleano
// voy preguntando si estuvo un tiempo en llamada y que lo vaya acumulando, por ultimo también metí los turnos de mañana y tarde, donde tambien
// aumento el precio de la llamada dependiendo de en que situacion o momento haya llamado.

// No es maravilloso, se podrá hacer mucho mejor, pero creo que es una posible solucion.

import java.util.Scanner;

public class Ejercicio4B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double precioInicial=0;
        System.out.println("El precio inicial es: "+precioInicial);
        
        System.out.println("Duró 5 minutos? true/false");
        boolean cincoMinutos = sc.nextBoolean();

        System.out.println("Duró 3 minutos mas? true/false");
        boolean tresMinutos = sc.nextBoolean();

        System.out.println("Duró 2 minutos mas? true/false");
        boolean dosMinutos = sc.nextBoolean();

        System.out.println("Estuviste unos segundos a mayores? true/false: ");
        boolean centimos = sc.nextBoolean();

        System.out.println("Llamaste el domingo? true/false");
        boolean domingo = sc.nextBoolean();

        System.out.println("Llamaste por la mañana? true/false");
        boolean turnoManhana = sc.nextBoolean();

        System.out.println("Llamaste por la tarde? true/false");
        boolean turnoTarde = sc.nextBoolean();

        double precioFinal = tiempoLlamada(precioInicial, cincoMinutos, tresMinutos, dosMinutos, centimos, domingo, turnoManhana, turnoTarde);

        System.out.println("El precio de la llamada son "+precioFinal+" euros");

    }

    public static double tiempoLlamada(double precioInicial, boolean cincoMinutos, boolean tresMinutos, boolean dosMinutos, boolean centimos, boolean domingo, boolean turnoManhana, boolean turnoTarde) {

        if(cincoMinutos){
            precioInicial+=1.00;
        }

        if(tresMinutos) {
            precioInicial+=0.80;
        }

        if(dosMinutos) {
            precioInicial+=0.70;
        }

        if(centimos) {
            precioInicial+=0.50;
        }

        if(domingo) {
            precioInicial+=1.03;
        }

        if(turnoManhana) {
            precioInicial+=1.15;
        }

        if(turnoTarde) {
            precioInicial+=1.10;
        }

        return precioInicial;


    }
   
}
