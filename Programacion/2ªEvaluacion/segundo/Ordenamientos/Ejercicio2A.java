package segundo.Ordenamientos;

import java.util.Arrays;

// Genera un array de 50 posiciones enteras que tomaran valores entre -100 y 100.
// Recorriendo dicho array separe en dos arrays distintos los valores positivos de los negativos.
// Ordena ambos por el metodo de la burbuja. Considere el cero positivo.
// Mostrar por teclado ambos arrays contenidos y ordenados.

public class Ejercicio2A {

    public static void main(String[] args) {
        
        int[] array = new int[50];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 201) - 100; 
        }
        
       
        int[] positivos = new int[array.length];
        int[] negativos = new int[array.length];
        int posIndex = 0;
        int negIndex = 0;
        
        for (int num : array) {
            if (num >= 0) {
                positivos[posIndex++] = num;
            } else {
                negativos[negIndex++] = num;
            }
        }
        
        MetodosOrdenamientos.burbuja(positivos);
        MetodosOrdenamientos.burbuja(negativos);
        
        
        System.out.println("Array de positivos ordenado:");
        System.out.println(Arrays.toString(Arrays.copyOf(positivos, posIndex)));
        System.out.println();
        System.out.println("Array de negativos ordenado:");
        System.out.println(Arrays.toString(Arrays.copyOf(negativos, negIndex)));
    }
    
    
    public static void burbuja(int[] array) {
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}

