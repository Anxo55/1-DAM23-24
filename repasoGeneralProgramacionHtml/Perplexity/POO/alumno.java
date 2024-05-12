package Perplexity.POO;

public class alumno {

    private int notas;
    private String alumno;

    //Constructor con todos los atributos o parametros
    public alumno(int notas, String alumno) {
        this.notas = notas;
        this.alumno = alumno;
    }

    public int getNotas() {
        return notas;
    }

    public void setNotas(int notas) {
        this.notas = notas;
    }

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    @Override
    public String toString() {
        return "alumno [notas=" + notas + ", alumno=" + alumno + "]";
    }

}
