package Seleccion2;

public abstract class SeleccionFutbol implements IntegranteSeleccionFutbol{
    
    //Atributos
    protected int id;
    protected String nombre;
    protected String apellidos;
    protected int edad;

    //Constructor vacío
    public SeleccionFutbol() {
    }

    //Constructor completo
    public SeleccionFutbol(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    //Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Métodos propios
    public void concentrarse(){
        System.out.println("Concentrarse");
    }

    public void viajar(){
        System.out.println("Viajar");
    }

    public void entrenar(){
        System.out.println("Entrenar");
    }

    public void jugarPartido(){
        System.out.println("Jugar partido");
    }

    //ToString
    @Override
    public String toString() {
        return "SeleccionFutbol [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + "]";
    } 
} //Fin de la clase
