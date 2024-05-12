//package ModeloB22-23;

public class Ejercicio4B {

    private String titulo;
    private String autor;
    private int ejemplaresTotales;
    private int ejemplaresPrestados;

    // Constructores
    public Ejercicio4B() {
        // Constructor por defecto
    }

    public Ejercicio4B(String titulo, String autor, int ejemplaresTotales) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplaresTotales = ejemplaresTotales;
        this.ejemplaresPrestados = 0; // Inicialmente, no hay ejemplares prestados
    }

    // Métodos getters/setters
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

    public int getEjemplaresTotales() {
        return ejemplaresTotales;
    }

    public void setEjemplaresTotales(int ejemplaresTotales) {
        this.ejemplaresTotales = ejemplaresTotales;
    }

    public int getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setEjemplaresPrestados(int ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    // Método toString
    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", autor=" + autor + ", ejemplaresTotales=" + ejemplaresTotales
                + ", ejemplaresPrestados=" + ejemplaresPrestados + "]";
    }

    // Método préstamo
    public boolean prestamo() {
        if (ejemplaresPrestados < ejemplaresTotales) {
            ejemplaresPrestados++;
            System.out.println("Préstamo realizado. Ejemplares prestados: " + ejemplaresPrestados);
            return true;
        } else {
            System.out.println("No hay ejemplares disponibles para préstamo.");
            return false;
        }
    }

    // Método devolución
    public boolean devolucion() {
        if (ejemplaresPrestados > 0) {
            ejemplaresPrestados--;
            System.out.println("Devolución realizada. Ejemplares prestados: " + ejemplaresPrestados);
            return true;
        } else {
            System.out.println("No hay ejemplares prestados para devolver.");
            return false;
        }
    }

    public static void main(String[] args) {
        // Crear libros de prueba
        Ejercicio4B libro1 = new Ejercicio4B("El señor de los anillos", "J.R.R. Tolkien", 5);
        Ejercicio4B libro2 = new Ejercicio4B("Cien años de soledad", "Gabriel García Márquez", 3);
        Ejercicio4B libro3 = new Ejercicio4B("1984", "George Orwell", 2);

        // Mostrar información inicial de los libros
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);

        // Realizar préstamos y devoluciones para probar los métodos
        libro1.prestamo();
        libro1.prestamo();
        libro1.devolucion();

        libro2.prestamo();
        libro2.devolucion();

        libro3.prestamo();
        libro3.prestamo();
        libro3.devolucion();

        // Mostrar información actualizada de los libros
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);
    }
    
}
