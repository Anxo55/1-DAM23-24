package POO;

public class testLibro {

    public static void main(String[] args) {

        Libro libro1 = new Libro();
        Libro libro2 = new Libro("Historia sin final ", "Pepe", 380);

        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        
    }
    
}
