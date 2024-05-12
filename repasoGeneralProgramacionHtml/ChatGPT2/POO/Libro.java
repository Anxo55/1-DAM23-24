package ChatGPT2.POO;

// Crea una clase Libro con atributos de título, autor y año de publicación. 
// Implementa un método que imprima la información del libro en un formato legible.

public class Libro {

    private String titulo;
    private String autor;
    private int anioPublicacion;

    //Construcot por defecto
    Libro() {
        this.titulo = "Inazuma eleven";
        this.autor = "Akiro";
        this.anioPublicacion = 1999;
    }

    //Constructor con todos los parametros o atributos de la clase libro
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
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

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    // Implementa un método que imprima la información del libro en un formato legible.

  public void imprimrLibro() {
        System.out.println("El titulo es "+titulo+ " que fue creado por "+autor+" en el año "+anioPublicacion);
    }

    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", autor=" + autor + ", anioPublicacion=" + anioPublicacion + "]";
    }
    
}
