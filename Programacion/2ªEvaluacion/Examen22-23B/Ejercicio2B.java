import java.util.Arrays;

// Genera un array de 60 posiciones enteras que tomarán valores entre 0 y 100. 
// Recorriendo dicho array separe en dos arrays distintos los valores (no las posiciones) pares e impares. 
// Ordene ambos arrays por el método Quicksort. Considere el cero par.
// Muestre ambos arrays obtenidos por pantalla


public class Ejercicio2B {
    
    public static void main(String[] args) {
        // Generar un array de 60 posiciones enteras con valores entre 0 y 100
        int[] array = new int[60];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101); // Valores aleatorios entre 0 y 100
        }
        
        // Separar los valores pares e impares en dos arrays distintos
        int[] pares = new int[array.length];
        int[] impares = new int[array.length];
        int paresCount = 0;
        int imparesCount = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                pares[paresCount++] = num;
            } else {
                impares[imparesCount++] = num;
            }
        }
        
        // Redimensionar los arrays para eliminar los espacios no utilizados
        pares = Arrays.copyOf(pares, paresCount);
        impares = Arrays.copyOf(impares, imparesCount);
        
        // Ordenar ambos arrays por el método Quicksort
        quicksort(pares, 0, pares.length - 1);
        quicksort(impares, 0, impares.length - 1);
        
        // Mostrar ambos arrays por pantalla
        System.out.println("Array de valores pares ordenado:");
        System.out.println(Arrays.toString(pares));
        
        System.out.println("Array de valores impares ordenado:");
        System.out.println(Arrays.toString(impares));
    }
    
    // Implementación del algoritmo Quicksort para ordenar el array
    public static void quicksort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quicksort(array, low, pivotIndex - 1);
            quicksort(array, pivotIndex + 1, high);
        }
    }
    
    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }
}
