package POO;

// Desarrolla una clase Libro con atributos como título, autor y número de páginas. 
// Crea un método que permita mostrar la información del libro.

public class Libro {

    private String titulo;
    private String autor;
    private int numeroPaginas;

    Libro() {
        this.titulo = "Deadth note";
        this.autor = "Willy";
        this.numeroPaginas = 300;
    }

    Libro(String titulo,  String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "El libro " + titulo + " cuyo autor es " + autor + " hizo un total de " + numeroPaginas + " paginas en el libro";
    }

    
    
}
