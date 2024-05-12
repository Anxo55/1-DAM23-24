// package Arrays;

import java.util.Scanner;

public class practica3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamanho;
        
        System.out.println("Dame el tamaño del arrayy: ");
        tamanho = sc.nextInt();

        int[] miArray = new int[tamanho];

        for(int i=0; i<miArray.length; i++) {
            System.out.println("Dame el valor "+i);
            miArray[i] = sc.nextInt();
        }

        for (int numero : miArray) {
            System.out.println("Valor: "+numero);          
        }

    }
    
}
