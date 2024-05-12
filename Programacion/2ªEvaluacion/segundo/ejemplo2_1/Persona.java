package segundo.ejemplo2_1;

public class Persona {

    private String nombre;
    private String apellido;
    private String dni;
    private int anhoNacimiento;
    private String paisNacimiento;
    //modificador nombre del Enum nombre del atributo
    private genero gen;
    private diasSemana day;

    Persona(String nombre, String apellido, String dni, int anhoNacimiento, String paisNacimiento, genero gen) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.anhoNacimiento = anhoNacimiento;
        this.paisNacimiento = paisNacimiento;
        this.gen = gen;
    }

    public enum genero{
        H,M,D
    }

    public enum diasSemana{
        LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", anhoNacimiento="
                + anhoNacimiento + ", paisNacimiento=" + paisNacimiento + ", genero=" + gen + "]";
    }


    
}
