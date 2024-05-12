package practicaJavaVarios;

import java.util.Scanner;

public class contadorNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;

        for(int i=0; i<=100; i++) {
            int numero = i;
            numero = (int) (Math.random()*100);
            System.out.println("Numero "+i+" : "+numero);

            if(numero ==4) {
                contador++;
            }
        }
        System.out.println("El número 4 apareció "+contador+" veces.");
       
    }
    
}
