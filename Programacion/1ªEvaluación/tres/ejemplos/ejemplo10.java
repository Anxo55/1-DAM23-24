package tres.ejemplos;

import java.util.Scanner;

public class ejemplo10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //mostrar todas las tablas desde la del 1 hasta la del 10 una detras de la otra
        //maximo 5 lineas de codigo

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i*j));
            }

            System.out.println("");
            
    }
    
    }
}
