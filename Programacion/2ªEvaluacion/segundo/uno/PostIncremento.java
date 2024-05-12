package segundo.uno;

import java.util.Scanner;

public class PostIncremento {

    public static void main(String[] args) {
        int suma = 0; 
        int numero = 0;
        int i = 1;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un entero: ");
        numero = sc.nextInt();

        do {
            suma = suma + i;
            System.out.println(suma);
            i++;
            System.out.println(i);
        } while (i <= numero);
            System.out.println("La suma prein da: "+suma);
            i=1;
            suma = 0;
            do {
            suma = suma + i;
            System.out.println(suma);
            ++i;
            System.out.println(i);
        } while (i <= numero);
            System.out.println("La suma postin da: "+suma);
        
    }
}
