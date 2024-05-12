package segundo.Ordenamientos;

import java.util.Arrays;

public class EjInsertion {

    public static void insertionsort(int[] numbers) {
        for(int i=0; i<numbers.length; i++) {
            int copiado = numbers[i];
            int j = i;
            while(j > 0 && copiado < numbers[j-1]) {
                numbers[j] = numbers[j-1];
                j--;
            }
            numbers[j] = copiado;
        }
    }

     public static void main(String[] args) {

        int[] numeros = new int[200];
        for(int i=0; i<numeros.length; i++) {
            numeros[i] = (int) (Math.random()*100);
        }

        System.out.println("Desordenado");
        System.out.println(Arrays.toString(numeros));

        insertionsort(numeros);
        System.out.println("Ordenado");
        System.out.println(Arrays.toString(numeros));
        
    }
    
}
