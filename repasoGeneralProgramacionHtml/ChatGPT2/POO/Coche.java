package ChatGPT2.POO;

// Crea una clase Coche con atributos de marca, modelo y año. Implementa métodos para arrancar el coche, detenerlo y acelerar.

public class Coche {

    private String marca;
    private String modelo;
    private int anio;

    Coche() {
        this.marca = "Honda";
        this.modelo = "Civic";
        this.anio = 2004;
    }

    Coche(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

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

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    // Implementa métodos para arrancar el coche, detenerlo y acelerar.

    public void arrancar(int velocidad) {
        if (velocidad>0) {
            System.out.println("El coche acaba de arrancar");
        } else {
            System.out.println("El coche esta parado");
        }
    }

    public void detenerse(int velocidad) {
        if (velocidad < 0) {
            System.out.println("El coche acaba de parar");
        } else {
            System.out.println("El coche sigue moviendose");
        }
    }

    public void acelerar(int velocidad) {
        if (velocidad > 50) {
            System.out.println("El coche está acelerando");
        } else if(velocidad > 120){
            System.out.println("Debes bajar la velocidad");
        }

    }

    @Override
    public String toString() {
        return "Coche [marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + "]";
    }
    
}
