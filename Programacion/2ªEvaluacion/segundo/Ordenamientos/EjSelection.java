package segundo.Ordenamientos;

import java.util.Arrays;

public class EjSelection {

    public static int[] selectionsort(int[] numbers) {

	for (int i = 0; i < numbers.length - 1; i++) {
	        int index = i;
	        for (int j = i + 1; j < numbers.length; j++)
	            if (numbers[j] < numbers[index]) //Finds smallest number
	                index = j;

	        int smallerNumber = numbers[index];  //Swap
	        numbers[index] = numbers[i];
	        numbers[i] = smallerNumber;

	    }
	    return numbers;
	}

    public static void main(String[] args) {

        int[] numeros = new int[200];
        for(int i=0; i<numeros.length; i++) {
            numeros[i] = (int) (Math.random()*100);
        }

        System.out.println("Desordenado");
        System.out.println(Arrays.toString(numeros));

        selectionsort(numeros);
        System.out.println("Ordenado");
        System.out.println(Arrays.toString(numeros));
        
    }
    
}
