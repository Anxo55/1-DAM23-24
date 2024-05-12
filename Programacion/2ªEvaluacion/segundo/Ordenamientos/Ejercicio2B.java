package segundo.Ordenamientos;

import java.util.Arrays;

// Genera un array de 60 posiciones enteras que tomaran valores entre 0 y 100

// Recorriendo dicho array separe en dos arrays los valores (no las posiciones pares e impares).

// Ordene ambos arrays por el metodo Quicksort. Considere el cero par.

// Muestre ambos arrays obtenidos por pantalla.

public class Ejercicio2B {

    public static void main(String[] args) {
        int[] array = new int[60];

        for(int i=0; i<array.length; i++) {
            array[i] = (int) (Math.random()*100);
        }
        
        int[] pares = new int[array.length];
        int[] impares = new int[array.length];
        
        int idxPares = 0;
        int idxImpares = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                pares[idxPares++] = array[i];
            } else {
                impares[idxImpares++] = array[i];
            }
        }
        
        pares = Arrays.copyOf(pares, idxPares);
        impares = Arrays.copyOf(impares, idxImpares);
        
        quicksort(pares, 0, pares.length - 1);
        quicksort(impares, 0, impares.length - 1);
        
        System.out.println("Array de pares ordenado: " + Arrays.toString(pares));
        System.out.println("Array de impares ordenado: " + Arrays.toString(impares));
    }
    
    public static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quicksort(arr, low, pi - 1);
            quicksort(arr, pi + 1, high);
        }
    }
    
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}
