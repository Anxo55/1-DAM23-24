package segundo.Ordenamientos;

import java.util.Arrays;

public class EjCocktail {

    public static int[] cocktailSort(int[] numbers) {

          boolean swapped = true;
          int i = 0;
          int j = numbers.length - 1;
          while(i < j && swapped) 
          {
             swapped = false;
             for(int k = i; k < j; k++) 
             {
                if(numbers[k] > numbers[k + 1]) 
                {
                   int temp = numbers[k];
                   numbers[k] = numbers[k + 1];
                   numbers[k + 1] = temp;
                   swapped = true;
                }
             }
             j--;

             if(swapped) {
                swapped = false;
                for(int k = j; k > i; k--) {

                   if(numbers[k] < numbers[k - 1]) {
                      int temp = numbers[k];
                      numbers[k] = numbers[k - 1];
                      numbers[k - 1] = temp;
                      swapped = true;
                   }
                }
             }
             i++;
          }
          return numbers;    
    }

    public static void main(String[] args) {

        int[] numeros = new int[2000];

        for(int i=0; i<numeros.length; i++) {
            numeros[i] = (int) (Math.random()*1000);
        }

        System.out.println("Desordenado");
        System.out.println(Arrays.toString(numeros));

        cocktailSort(numeros);
        System.out.println("Ordenado");
        System.out.println(Arrays.toString(numeros));
        
    }

}