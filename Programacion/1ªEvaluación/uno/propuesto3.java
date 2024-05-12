package uno;

import java.util.Scanner;

public class propuesto3 {  
    public static void main(String [] args) {

int numero;

Scanner sc = new Scanner(System.in);

System.out.println("Numero entero: ");
numero = sc.nextInt();
int cuadrado=(int) Math.pow(numero, 2);
System.out.println("EL CUADRADO DE "+numero+" ES: " + cuadrado);

    }
}
