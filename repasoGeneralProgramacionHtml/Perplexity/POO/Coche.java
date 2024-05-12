package Perplexity.POO;

public class Coche {

    //atributos o parametros de la clase coche
    private String marca;
    private String modelo;
    private int velocidad;

    //constructor con todos los parametros de la clase coche
    public Coche(String marca, String modelo, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }

    public void acelerar(int cantidad) {
        velocidad = velocidad + cantidad;
    }

    public void frenar(int cantidad) {
        velocidad = velocidad - cantidad;
    }

    //metodos getters y setters.
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    //metodo toString para mostrar los objetos por pantalla
    @Override
    public String toString() {
        return "Coche [marca=" + marca + ", modelo=" + modelo + ", velocidad=" + velocidad + "]";
    }
    
    
}
