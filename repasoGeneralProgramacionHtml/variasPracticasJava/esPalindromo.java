package variasPracticasJava;

public class esPalindromo {

    public static boolean esPalindromo(String cadena) {
        // Eliminar espacios en blanco y convertir a minúsculas
        cadena = cadena.replaceAll("s", "").toLowerCase();
        // Invertir la cadena
        String cadenaInvertida = new StringBuilder(cadena).reverse().toString();
        // Comparar la cadena original con la cadena invertida
        if (cadena.equals(cadenaInvertida)) {
            return true;
        } else {
            return false;
        }
    
    }

    public static void main(String[] args) {
        String cadena1 = "anita lava la tina";
    String cadena2 = "hola mundo";
    System.out.println(esPalindromo(cadena1)); // true
    System.out.println(esPalindromo(cadena2)); // false
    }
}
