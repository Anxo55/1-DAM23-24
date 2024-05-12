package segundo.EjerciciosRayas;

public class Ejercicio2 {

    public static void main(String[] args) {

        char[] miarray = new char[10];

        miarray[0] = 'a';
        miarray[1] = 'x';
        miarray[4] = '@';
        miarray[6] = ' ';
        miarray[7] = '+';
        miarray[8] = 'Q';

        // Los valores que no estan inicializados salen vacios dejando un espacio en blanco
        for (char este: miarray) {
            System.out.println(este + ", ");
        }
    }
    
}
