package segundo.repasoExamen;

import java.util.ArrayList;
import java.util.Scanner;

// 6. Código Java para eliminar el tercer elemento de un array list.

public class Ejercicio6 {

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

        ArrayList<String> array = puebLista();/* ArrayList de ejemplo */
        System.out.println("Tamaño de la lista "+array.size());

        /* Posicion en la que insertar */
        System.out.println("Introduce indice: (a eliminar)");
        int indice = sc.nextInt();
        String valor = array.get(indice);
        /* Mostrar valor a eliminar */
        System.out.println("Vas a eliminar "+ valor);


        // array.remove(indice);
        System.out.println(array);
        
        /* Posicion que eliminar */
        array.remove(valor);
        System.out.println(array);
        
    }
    
}
