package cuatro.ejemplos;

public class testStrings {

    public static void main(String[] args) {

        String uno = "Hola Mundo";
        String dos = "Adios Amigos";

        // Compara los dos Strings
        System.out.println(uno.equals(dos));
        System.out.println(uno.equalsIgnoreCase(dos));
        uno = dos;
        System.out.println(uno.hashCode());
        System.out.println(dos.hashCode());
        System.out.println(uno);
        System.out.println(dos);
        
    }
    
}
