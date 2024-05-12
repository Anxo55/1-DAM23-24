package segundo.ejemplo3_2;

import java.util.Arrays;

public class OrdenarArray {

    public static void main(String[] args) {
        // Crear un array de caracteres y luego ordenarlo alfabeticamento

        char[] caracteres = ("hola me llamo maria victoria y ojala les interese mi historia").toCharArray();

        // Aqui lo miramos desordenado
        System.out.println(Arrays.toString(caracteres));

        // Usando el metodo sort se ordena los caracteres alfabeticamente
        Arrays.sort(caracteres);
        System.out.println(Arrays.toString(caracteres));


    }
    
}
