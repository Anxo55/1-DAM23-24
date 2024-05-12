package uno;

import java.util.Scanner;

// 12. (Ejercicio de dificultad alta) Realiza un programa que dado un importe en euros nos indique el mínimo número 
// de billetes y la cantidad sobrante que se pueden utilizar para obtener dicha cantidad.
// Por ejemplo: 
// 232 euros:
// 1 billete de 200.
// 1 billete de 20.
// 1 billete de 10
// Sobran 2 euros.

public class propuesto12 {

   public static void main(String[] args) {

    int billete500=0, billete200=0, billete100=0, billete50=0, billete20=0, billete10=0, billete5=0, moneda2=0, moneda1=0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la cantidad en euros: ");
        double cantidad = scanner.nextDouble();

        System.out.println("Desglose de billetes y monedas:");

        billete500 = (int) (cantidad /500);
        cantidad %= 500;

        billete200 = (int) (cantidad / 200);
        cantidad %= 200;

        billete100 = (int) (cantidad / 100);
        cantidad %= 100;

        billete50 = (int) (cantidad / 50);
        cantidad %= 50;

        billete20 = (int) (cantidad / 20);
        cantidad %= 20;

        billete10 = (int) (cantidad / 10);
        cantidad %= 10;

        billete5 = (int) (cantidad / 5);
        cantidad %= 5;

        moneda2 = (int) (cantidad / 2);
        cantidad %= 2;

        moneda1 = (int) (cantidad / 1);

        if(billete500 > 0) {
            System.out.println(billete500 + " billete de 500 euros");
        }
        if (billete200 > 0) {
            System.out.println(billete200 + " billete de 200 euros");
        }
        if (billete100 > 0) {
            System.out.println(billete100 + " billete de 100 euros");
        }
        if (billete50 > 0) {
            System.out.println(billete50 + " billete de 50 euros");
        }
        if (billete20 > 0) {
            System.out.println(billete20 + " billete de 20 euros");
        }
        if (billete10 > 0) {
            System.out.println(billete10 + " billete de 10 euros");
        }
        if (billete5 > 0) {
            System.out.println(billete5 + " billete de 5 euros");
        }
        if (moneda2 > 0) {
            System.out.println(moneda2 + " moneda de 2 euros");
        }
        if (moneda1 > 0) {
            System.out.println(moneda1 + " moneda de 1 euro");
        }

        if (cantidad > 0) {
            System.out.println("Sobran " + cantidad + " euros");
        }
    }
}
