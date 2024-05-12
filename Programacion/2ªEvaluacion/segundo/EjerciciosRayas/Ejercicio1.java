package segundo.EjerciciosRayas;

public class Ejercicio1 {

    public static void main(String[] args) {

        int[] miArray = new int[12];
        // Los que no estan inicializados su valor es 0

        miArray[0] = 39;
        miArray[1] = -2;
        miArray[4] = 0;
        miArray[6] = 14;
        miArray[8] = 5;
        miArray[9] = 120;

        for(Integer elemento : miArray) {
            System.out.println(elemento+" ");
        }
        
    }
    
}
