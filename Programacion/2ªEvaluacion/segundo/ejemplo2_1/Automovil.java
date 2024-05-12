package segundo.ejemplo2_1;

public class Automovil {

    private String marca;
    private int modelo;
    private int motor;
    private int numeroPuertas;
    private int cantidadAsientos;
    private int velocidadMaxima;
    private tipoColor color;
    private int velocidadActual;
    private tipoCombustible combustible;
    private tipoAutomovil automovil;
    private boolean automatico;

    Automovil(String marca, int modelo, int motor, int numeroPuertas, int cantidadAsientos, int velocidadMaxima,
     tipoColor color, int velocidadActual, tipoCombustible combustible, tipoAutomovil automovil, boolean automatico){

        this.marca=marca;
        this.modelo=modelo;
        this.motor=motor;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
        this.velocidadActual = velocidadActual;
        this.combustible = combustible;
        this.automovil = automovil;
        this.automatico = automatico;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public tipoColor getColor() {
        return color;
    }

    public void setColor(tipoColor color) {
        this.color = color;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public tipoCombustible getCombustible() {
        return combustible;
    }

    public void setCombustible(tipoCombustible combustible) {
        this.combustible = combustible;
    }

    public tipoAutomovil getAutomovil() {
        return automovil;
    }

    public void setAutomovil(tipoAutomovil automovil) {
        this.automovil = automovil;
    }

    public boolean isAutomatico() {
        return automatico;
    }


    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }

    
    public void frenar(int cantidad) {
        if (cantidad > 0 && velocidadActual - cantidad >= 0) {
            velocidadActual -= cantidad;
            System.out.println("Frenando. Velocidad actual: " + velocidadActual + " km/h");
        } else {
            System.out.println("No se puede frenar más. El automóvil está detenido.");
        }
    }

    public void acelerar(int cantidad) {
        if (cantidad > 0 && velocidadActual + cantidad <= velocidadMaxima) {
            velocidadActual += cantidad;
            System.out.println("Acelerando. Velocidad actual: " + velocidadActual + " km/h");
        } else {
            System.out.println("No se puede acelerar más. Velocidad máxima alcanzada.");
        }
    }

    public void decelerar(int cantidad) {
        if (cantidad > 0 && velocidadActual - cantidad >= 0) {
            velocidadActual -= cantidad;
            System.out.println("Decelerando. Velocidad actual: " + velocidadActual + " km/h");
        } else {
            System.out.println("No se puede decelerar más. El automóvil está detenido.");
        }
    }

    enum tipoColor{
        BLANCO, NEGRO, ROJO,NARANJA, AMARILLO, VERDE,AZUL,VIOLETA
    }

    enum tipoCombustible{
        GASOLINA, BIOETANOL, DIESEL, BIODIESEL, GAS_NATURAL
    }

    enum tipoAutomovil{
        CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV
    }

    @Override
    public String toString() {
        return "Automovil [marca=" + marca + ", modelo=" + modelo + ", motor=" + motor + ", numeroPuertas="
                + numeroPuertas + ", cantidadAsientos=" + cantidadAsientos + ", velocidadMaxima=" + velocidadMaxima
                + ", color=" + color + ", velocidadActual=" + velocidadActual + ", combustible=" + combustible
                + ", automovil=" + automovil + "]";
    }
    
    
}
