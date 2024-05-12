package segundo.DinamicosArraysList;

import java.io.Serializable;

public class Disco implements Comparable, Serializable{

    private String codigo
    ;
    private String autor;
    private String titulo;
    private String genero;
    private int duracion; // duración total en minutos

    public Disco() { }

    public Disco(String codigo, String autor, String titulo, String genero, int duracion) {
      this.codigo = codigo;
      this.autor = autor;
      this.titulo = titulo;
      this.genero = genero;
      this.duracion = duracion;
    }

    public String getCodigo() {
      return codigo;
    }

    public void setCodigo(String codigo) {
      this.codigo = codigo;
    }

    public String getAutor() {
      return autor;
    }

    public void setAutor(String autor) {
      this.autor = autor;
    }

    public String getGenero() {
      return genero;
    }

    public void setGenero(String genero) {
      this.genero = genero;
    }

    public String getTitulo() {
      return titulo;
    }

    public void setTitulo(String titulo) {
      this.titulo = titulo;
    }

    public int getDuracion() {
      return duracion;
    }

    public void setDuracion(int duracion) {
      this.duracion = duracion;
    }

    public String toString() {
      String cadena = "";
      cadena += "\nCódigo: " + this.codigo;
      cadena += "\nAutor: " + this.autor;
      cadena += "\nTítulo: " + this.titulo;
      cadena += "\nGénero: " + this.genero;
      cadena += "\nDuración: " + this.duracion;
      cadena += "\n------------------------------------------";

      return cadena;
    }

  
  
  @Override
  public int compareTo(Object obj) {
      // TODO Auto-generated method stub
      Disco other= (Disco)obj;
      return (this.codigo).compareTo(other.getCodigo());
  }
  }
