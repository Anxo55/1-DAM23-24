package segundo.ejemplo2_6;

public class Pelicula {

    private String nombre;
	private String director;
	enum tipo {ACCION, COMEDIA, DRAMA, SUSPENSO};
	tipo genero;
	
	private int duracion;
	private int año;
	private double calificacion;
	
	public Pelicula(String nombre, String director, tipo genero, 
			int duracion, int año, double calificacion) {
				this.nombre = nombre;
				this.director = director;
				this.genero = genero;
				this.duracion = duracion;
				this.año = año;
				this.calificacion = calificacion;
	}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public tipo getGenero() {
        return genero;
    }

    public void setGenero(tipo genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Pelicula [nombre=" + nombre + ", director=" + director + ", genero=" + genero + ", duracion=" + duracion
                + ", año=" + año + ", calificacion=" + calificacion + "]";
    }

    boolean esPeliculaEpica() {
        return this.duracion>=180;
    }

    public String calcularValoracion() {
        String val = "";
        if(calificacion<2)
            val = "MUY MALA";
        else if (calificacion>=2 && calificacion<5) 
            val = "MALA";
        else if(calificacion>=5 && calificacion<7) 
            val = "REGULAR";
        else if(calificacion>=7 && calificacion<8) 
            val = "BUENA";
        else
            val = "EXCELENTE";

            return val;
        }

        public boolean esSimilar(Pelicula pelicula) {
            return (this.genero == pelicula.genero) && (this.calcularValoracion() == pelicula.calcularValoracion()); 
                
        }
	
    }
