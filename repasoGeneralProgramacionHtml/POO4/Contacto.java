package POO4;

import java.util.Scanner;

// Crea una clase Contacto para representar información de contactos (nombre, teléfono, correo, etc.). 
// Luego, crea una clase Agenda que almacene una lista de contactos y permita agregar, eliminar y buscar contactos.

public class Contacto {
     
    private String nombre;
    private int telefono;
    private String correo;
    private String apellido;

    Contacto() {
        super();
        this.nombre = "Pepe";
        this.telefono = 666555444;
        this.correo = "pepe@cebem.es";
        this.apellido = "Dominguez";
    }

    Contacto(String nombre, int telefono, String correo, String appelido) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.apellido = appelido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // para crear un nuevo contacto debemos ponerlos en orden los parametros como en los constructores.
    public static Contacto agregaContacto() {
        Scanner sc = new Scanner(System.in);
        String nombreContacto, apellidoContacto, correoContacto;
        int telefonoContacto;
        
        System.out.println("Dame el nombre: ");
        nombreContacto = sc.nextLine();

        System.out.println("Dame el apellido: ");
        apellidoContacto = sc.nextLine();

        System.out.println("Dame su correo: ");
        correoContacto = sc.nextLine();

        System.out.println("Dame su telefono: ");
        telefonoContacto = sc.nextInt();
        Contacto contacto = new Contacto(nombreContacto, telefonoContacto , correoContacto, apellidoContacto);
        return contacto;

    }

    @Override
    public String toString() {
        return "Contacto [nombre=" + nombre + ", telefono=" + telefono + ", correo=" + correo + ", apellido=" + apellido
                + "]";
    }

}
