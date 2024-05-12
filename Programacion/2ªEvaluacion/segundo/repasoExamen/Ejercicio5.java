package segundo.repasoExamen;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5 {

    public static ArrayList<String> puebLista() {
    ArrayList<String> numeros = new ArrayList<String>();
    numeros.add("uno");
    numeros.add(("dos"));
    numeros.add("tres");
    numeros.add("cuatro");
    numeros.add("seis");
    numeros.add("siete");
    numeros.add("ocho");
    numeros.add("nueve");
    numeros.add("diez");
    

    return numeros;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> array = puebLista();
        System.out.println("Tamaño de la lista "+array.size());

        /* Posicion en la que insertar */
        System.out.println("Introduce indice: (a machacar)");
        int indice = sc.nextInt();
        /* Valor a insertar */
        System.out.println("Introduce nuevo valor: ");
        // String valor = sc.nextLine();
        String valor = sc.next();

        array.set(indice, valor);
        System.out.println(array);
        
    }
    
}
