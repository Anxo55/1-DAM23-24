package POO;

// Diseña una clase Coche con atributos como marca, modelo y año de fabricación. 
// Crea un método que calcule la antigüedad del coche.

public class Coche {

    private String marca;
    private String modelo;
    private int anioFabricacion;

    Coche() {
        this.marca = "BMW";
        this.modelo = "E46";
        this.anioFabricacion = 2001;
    }

    Coche(String marca, String modelo, int anioFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
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

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    //metodos externos
    public void anioFabriacion() {

        if (anioFabricacion >= 1990 && anioFabricacion <= 2000) {
            System.out.println("El coche es muy antiguo");
        } else if(anioFabricacion > 2000 && anioFabricacion <=2010){
            System.out.println("El coche se fabrico hace unos años");
        }else if(anioFabricacion > 2010){
            System.out.println("El coche se fabrico actualmente");
        }

    }

    @Override
    public String toString() {
        return "Coche [marca=" + marca + ", modelo=" + modelo + ", anioFabricacion=" + anioFabricacion + "]";
    }
    
}
