package Propuesto1;

public class Libro {

    private String titulo;
    private String autor;
    private float precio;

    Libro(String titulo, String autor, float precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = 0;
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

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + "]";
    }

   
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Libro other = (Libro) obj;
        if (titulo == null) {
            if (other.titulo != null)
                return false;
        } else if (!titulo.equals(other.titulo))
            return false;
        if (autor == null) {
            if (other.autor != null)
                return false;
        } else if (!autor.equals(other.autor))
            return false;
        if (Float.floatToIntBits(precio) != Float.floatToIntBits(other.precio))
            return false;
        return true;
    }

    

    // metodos que faltan por añadir
    
}
