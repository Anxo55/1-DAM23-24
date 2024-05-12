package Propuesto1;

public class LibrosDeTexto extends Libro{

    private String curso;

    public LibrosDeTexto(String titulo, String autor, float precio, String curso) {
        super(titulo, autor, precio);
        this.curso = curso;
    }

    public LibrosDeTexto(String titulo, String autor, String curso) {
        super(titulo, autor);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString() + "LibrosDeTexto [curso=" + curso + "]";
    }

    
    
}
