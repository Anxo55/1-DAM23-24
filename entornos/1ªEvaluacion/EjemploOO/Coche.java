package EjemploOO;

public class Coche {

    private String marca;
    private String modelo;
    private int matricula;
    private String conductor;
    private char color;

    //constructor con todos los parametros de la clase coche
    public Coche(String marca, String modelo, int matricula, String conductor, char color) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.conductor = conductor;
        this.color = color;
    }

    //Constructor por defecto, pero al cual le pasamos unos paramtros directamente desde el propio constructor
    public Coche() {
        this.marca="Honda";
        this.modelo="Civic";
        this.matricula=1348;
        this.conductor="Antonio";
        this.color='n';
    }

    //Constructor con dos parametros
    public Coche(String conductor, int matricula) {
        this.conductor=conductor;
        this.matricula=matricula;
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

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getConductor() {
        return conductor;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Coche [marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + ", conductor=" + conductor
                + ", color=" + color + "]";
    }

    
}
