package Arrays;

import java.util.Scanner;

public class intento2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] miArray = new int[5];
        int suma = 0;

        for(int i=0; i<miArray.length; i++) {
            System.out.println("Dame los valores del array "+i+": ");
            miArray[i] = sc.nextInt();
            suma += miArray[i];
        }

        System.out.println("La suma de los valores es: "+suma);

    }

    
}
