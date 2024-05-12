package ChatGPT2.POO;

public class testLibro {

    public static void main(String[] args) {

        Libro libro1 = new Libro();
        Libro libro2 = new Libro("Naruto", "Sakura", 1998);

        System.out.println(libro1.toString());
        System.out.println(libro2.toString());

        System.out.println("");
        //metodo imprime libro;
        
        libro1.imprimrLibro();
        libro2.imprimrLibro();
        
    }
    
    
}
