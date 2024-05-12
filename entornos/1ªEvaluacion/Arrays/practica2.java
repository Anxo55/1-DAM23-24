// package Arrays;

import java.util.Scanner;

public class practica2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] miArray = new int[5];
        int suma = 0;

        System.out.println("Dame los valores del array: ");
        
        for(int i=0; i<miArray.length; i++) {
            miArray[i] = sc.nextInt();
            // hay que poner en el syso el miarray con la i sino te meustra el espacio de memoria
            System.out.println("Valor " +i+": "+miArray[i]);
            suma+=miArray[i];
        }
        
        System.out.println("La suma de los valores del array es: "+suma);

    }
    
}
