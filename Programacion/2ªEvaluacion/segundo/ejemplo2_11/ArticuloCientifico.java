package segundo.ejemplo2_11;

import java.util.Arrays;

public class ArticuloCientifico {

    private String titulo;
    private String autor;
    private String[] palabrasClaves = new String[3];
    private String publicacion;
    private int anho;
    private String resumen;

    ArticuloCientifico(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    ArticuloCientifico(String titulo, String autor, String[] palabrasClaves, String publicacion, int anho) {
        this(titulo,autor);
        this.palabrasClaves = palabrasClaves;
        this.publicacion = publicacion;
        this.anho = anho;
    }

    ArticuloCientifico(String titulo, String autor, String[] palabrasClaves, String publicacion, int anho, String resumen) {
        this.titulo = titulo;
        this.autor = autor;
        this.palabrasClaves = palabrasClaves;
        this.publicacion = publicacion;
        this.anho = anho;
        this.resumen = resumen;
    }

    // Constructor de copia
    ArticuloCientifico (ArticuloCientifico ac) {
        this.titulo = ac.titulo;
        this.autor = ac.autor;
        this.palabrasClaves = ac.palabrasClaves;
        this.publicacion = ac.publicacion;
        this.anho = ac.anho;
        this.resumen = ac.resumen;
    }

    @Override
    public String toString() {
        return "ArticuloCientifico [titulo=" + titulo + ", autor=" + autor + ", palabrasClaves="
                + Arrays.toString(palabrasClaves) + ", publicacion=" + publicacion + ", anho=" + anho + ", resumen="
                + resumen + "]";
    }

    
}
