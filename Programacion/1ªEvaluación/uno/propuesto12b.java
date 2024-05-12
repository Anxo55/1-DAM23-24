package uno;

import java.util.Scanner;

public class propuesto12b {

    public static void main(String[] args) {

    int billete500=0, billete200=0, billete100=0, billete50=0, billete20=0, billete10=0, billete5=0, moneda2=0, moneda1=0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la cantidad en euros: ");
        double cantidad = scanner.nextDouble();

         while(cantidad>=500){
            billete500++;
            cantidad = cantidad - 500;
            // 1 contar un billete de 500 
            // 2 restar 500
         }

         while (cantidad>=200) {
            billete200++;
            cantidad -= 200;
         }

          while (cantidad>=100) {
            billete100++;
            cantidad -= 100;
         }

          while (cantidad>=50) {
            billete50++;
            cantidad -= 50;
         }

          while (cantidad>=20) {
            billete20++;
            cantidad -= 20;
         }

          while (cantidad>=10) {
            billete10++;
            cantidad -= 10;
         }

          while (cantidad>=5) {
            billete5++;
            cantidad -= 5;
         }

          while (cantidad>=2) {
            moneda2++;
            cantidad -= 2;
         }

          while (cantidad>=1) {
            moneda1++;
            cantidad -= 1;
         }

         System.out.println("De 500: " +billete500);
         System.out.println("De 200: " +billete200);
         System.out.println("De 100: " +billete100);
         System.out.println("De 50: " +billete50);
         System.out.println("De 20: " +billete20);
         System.out.println("De 10: " +billete10);
         System.out.println("De 5: " +billete5);
         System.out.println("De 2: " +moneda2);
         System.out.println("De 1: " +moneda1);
         System.out.println("Cantidad: " +cantidad);


    
    }

}