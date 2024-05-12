package Propuesto1;

public class LibrosDeTextoUNC extends LibrosDeTexto{
    
    private String facultad;

    public LibrosDeTextoUNC(String titulo, String autor, float precio, String curso, String facultad) {
        super(titulo, autor, precio, curso);
        this.facultad = facultad;
    }

    public LibrosDeTextoUNC(String titulo, String autor, String curso, String facultad) {
        super(titulo, autor, curso);
        this.facultad = facultad;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    @Override
    public String toString() {
        return super.toString() + "LibrosDeTextoUNC [facultad=" + facultad + "]";
    }

    

}
