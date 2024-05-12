package tres.boletin2;

import java.util.Scanner;

// 14. Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de 1000€.

public class ejercicio14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int contador = 0;

        for(int i=0; i<10; i++) {
            System.out.println("Dame salario: ");
            int salario = sc.nextInt();
            suma+=salario;
            if(salario>1000) {
                contador++;
            }
            }

            System.out.println("La suma de los salarios es: "+suma);
            System.out.println("El total de salarios superior a 1000 son: "+contador);

            
    }
    
}
