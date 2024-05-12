import java.util.Scanner;

public class Ejercicio3B {

//Crea un programa que reciba una cadena de caracteres y la devuelva invertida con efecto espejo, 
// esto es, se concatena a la palabra original su inversa, compartiendo la última letra,
//  que hará de espejo, por lo que la palabra obtenida se lee igual hacia adelante que hacia atrás. 
// Por ejemplo, al introducir “teclado” devolverá “tecladodalcet” y al introducir “goma” devolverá 
// “gomamog”

 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que introduzca una cadena de caracteres
        System.out.print("Introduce una palabra: ");
        String palabra = scanner.nextLine();
        
        // Obtener la palabra invertida
        String palabraInvertida = invertirPalabra(palabra);
        
        // Concatenar la palabra original con su inversa, compartiendo la última letra
        String resultado = palabra + palabraInvertida.substring(1);
        
        // Mostrar el resultado por pantalla
        System.out.println("Palabra con efecto espejo: " + resultado);
    }
    
    // Método para invertir una palabra
    public static String invertirPalabra(String palabra) {
        StringBuilder sb = new StringBuilder();
        for (int i = palabra.length() - 1; i >= 0; i--) {
            sb.append(palabra.charAt(i));
        }
        return sb.toString();
    }
}

    

