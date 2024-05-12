// package Examen22-23A;

public class Ejercicio2B {

// Genera un array de 50 posiciones enteras que tomarán valores entre -100 y 100. 
// Recorriendo dicho array separe en dos arrays distintos los valores positivos de los negativos. 
// Ordene ambos arrays por el método de la Burbuja. Considere el cero positivo. 
// Mostrar por teclado ambos arrays obtenidos y ordenados.


    public static void main(String[] args) {
        
        int[] array = new int[50];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 201) - 100;
        }

        
        int[] positivos = new int[array.length];
        int[] negativos = new int[array.length];
        int contadorPositivos = 0;
        int contadorNegativos = 0;

        
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                positivos[contadorPositivos++] = array[i];
            } else {
                negativos[contadorNegativos++] = array[i];
            }
        }

        
        ordenarPorBurbuja(positivos, contadorPositivos);
        ordenarPorBurbuja(negativos, contadorNegativos);

        // Mostrar por teclado ambos arrays obtenidos y ordenados
        System.out.println("Valores positivos ordenados:");
        for (int i = 0; i < contadorPositivos; i++) {
            System.out.print(positivos[i] + " ");
        }
        System.out.println();

        System.out.println("Valores negativos ordenados:");
        for (int i = 0; i < contadorNegativos; i++) {
            System.out.print(negativos[i] + " ");
        }
    }

    
    public static void ordenarPorBurbuja(int[] array, int longitud) {
        for (int i = 0; i < longitud - 1; i++) {
            for (int j = 0; j < longitud - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
    

