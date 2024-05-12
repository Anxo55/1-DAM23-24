import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio4B {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese un texto de al menos 6 palabras
        System.out.println("Ingrese un texto de al menos 6 palabras:");
        String texto = scanner.nextLine();
        
        // Eliminar los espacios en blanco y convertir el texto a minúsculas
        texto = texto.replaceAll("\\s+", "").toLowerCase();
        
        // Crear un conjunto para almacenar todas las letras del alfabeto
        HashSet<Character> alfabeto = new HashSet<>();
        for (char c = 'a'; c <= 'z'; c++) {
            alfabeto.add(c);
        }
        
        // Eliminar del conjunto las letras que aparecen en el texto
        for (char letra : texto.toCharArray()) {
            alfabeto.remove(letra);
        }
        
        // Mostrar las letras que no han aparecido en el texto
        System.out.println("Letras que no han aparecido en el texto:");
        if (alfabeto.isEmpty()) {
            System.out.println("Todas las letras del alfabeto han aparecido en el texto.");
        } else {
            for (char letra : alfabeto) {
                System.out.print(letra + " ");
            }
        }
    }
}