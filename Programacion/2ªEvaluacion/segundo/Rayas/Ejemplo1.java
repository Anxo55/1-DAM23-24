package segundo.Rayas;

public class Ejemplo1 {

    public static void main(String[] args) {
        int[] n; //define n como un array de enteros
        n = new int[4]; //reserva espacio para 4 enteros

        n[0] = 26;
        n[1] = -30;
        n[2] = 0;
        n[3] = 100;

        System.out.println("Los valores del array n son los siguientes: ");
        System.out.println("[ "+n[0] + ", " + n[1] + ", " + n[2] + ", " + n[3]+ " ]");

        int suma = n[0] + n[3];
        System.out.println("El primer elemento del array mas el ultimo suman " + suma);
        
    }
    
}
