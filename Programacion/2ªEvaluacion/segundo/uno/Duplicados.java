package segundo.uno;

public class Duplicados {

    public static void main(String[] args) {
        // doble bucle
        // externo de 1 a n
        // interno j>i

        int[] arr = {1,2,3,3,4,4,5,2};
        int n = arr.length;
        System.out.println("Elementos del array");

        for(int i=0; i<n;i++) {
            System.out.println("Elemento ["+ i+ " ] = " + arr[i]);
        }

        for(int i=0; i<n; i++) {

            for(int j=i+1; j<n; j++ ) {

                if(arr[i]==arr[j]) {
                    System.out.println("El elemento de valor "+arr[i]+ " de la posicion "+i+" se repite en la posicion "+j);
                }

            }

        }
        
    }
    
}
