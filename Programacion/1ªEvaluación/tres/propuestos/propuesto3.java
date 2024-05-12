package tres.propuestos;

import java.util.Scanner;

public class propuesto3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dame el total de lineas que quieres mostrar de asteriscos: ");
        int filas = sc.nextInt();
        System.out.println("Total de filas: "+filas);
        
        for(int i=0; i<filas; i++) {
            for(int k=0; k<filas-i; k++) {
                System.out.print(" ");
            }

            for(int j=1; j<=2*i+1; j++) {
                System.out.print("*");
            }

            System.out.println();

        }

        for(int i=filas-2; i>=0; i--) {
            for(int k=0; k<filas-i; k++) {
                System.out.print(" ");
            }

            for(int j=1; j<=2*i+1; j++) {
                System.out.print("*");
            }

            System.out.println();

        }
        sc.close();
    }
    
}
