package dos.propuestos;

// 9. Implementa una clase consumo, la cual forma parte de la centralita electrónica de un coche y tiene las siguientes 
// características:
// Atributos:

// kms. Kilómetros recorridos por el coche, 
// litros. Litros de combustible consumido, 
// vmed. Velocidad media, 
// pgas. Precio de la gasolina.
// Métodos:
// getTiempo. Indicará el tiempo empleado en realizar el viaje. 
// consumoMedio. Consumo medio del vehiculo (en litros cada 100 kilómetros). 
// consumoEuros. Consumo medio del vehiculo (en euros cada 100 kilómetros).
// No olvides crear un constructor para la clase que establezca el valor de los atributos. Elige el tipo de datos más 
// apropiado para cada atributo.

public class Consumo {

    private int kilometros;
    private double litros;
    private double velocidadMedia;
    private double precioGasolina;

    //constructor por defecto
    Consumo() {
      
    }

    //constructor con todos los parametros
    public Consumo(int kilometros, double litros, double velocidadMedia, double precioGasolina) {
        // super();
        this.kilometros = kilometros;
        this.litros = litros;
        this.velocidadMedia = velocidadMedia;
        this.precioGasolina = precioGasolina;
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public double getVelocidadMedia() {
        return velocidadMedia;
    }

    public void setVelocidadMedia(double velocidadMedia) {
        this.velocidadMedia = velocidadMedia;
    }

    public double getPrecioGasolina() {
        return precioGasolina;
    }

    public void setPrecioGasolina(double precioGasolina) {
        this.precioGasolina = precioGasolina;
    }

    @Override
    public String toString() {
        return "Consumo [kilometros=" + kilometros + ", litros=" + litros + ", velocidadMedia=" + velocidadMedia
                + ", precioGasolina=" + precioGasolina + "]";
    }

    //metodos porpios
    // Métodos:
    // getTiempo. Indicará el tiempo empleado en realizar el viaje. 
    // consumoMedio. Consumo medio del vehiculo (en litros cada 100 kilómetros). 
    // consumoEuros. Consumo medio del vehiculo (en euros cada 100 kilómetros).

    public double getTiempo() {
        double tiempo = 0;
        tiempo = kilometros / velocidadMedia;
        return tiempo;
    }

    public double consumoMedio() {
        double consumo = 0;
        consumo = (litros / kilometros)*100;
        return consumo;
    }

    public double consumoEuros() {
        double consumoEuros;
        consumoEuros = (precioGasolina / kilometros) * 100;
        return consumoEuros;

    }
    
}
