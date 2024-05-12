package tres.propuestos;

import java.util.Scanner;

public class propuesto4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dame el total de lineas que quieres mostrar de asteriscos: ");
        int filas = sc.nextInt();
        System.out.println("Total de filas: "+filas);
        
        //parte superior
        for(int i=0; i<filas; i++) {
            for(int k=0; k<filas-i; k++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j=1; j<2*i; j++) {
                System.out.print(" ");
            }
            if(i!=0)
            System.out.print("*");
            System.out.println();

        }

        //parte inferior
         for(int i=filas-2; i>=0; i--) {
             for(int k=0; k<filas-i; k++) {
                 System.out.print(" ");
             }
             System.out.print("*");
             for(int j=1; j<2*i; j++) {
                 System.out.print(" ");
             }
             if(i!=0)
             System.out.print("*");
             System.out.println();

         }
         sc.close();
    }
    
}
