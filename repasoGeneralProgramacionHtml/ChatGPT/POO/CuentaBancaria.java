package ChatGPT.POO;

// Diseña una clase CuentaBancaria que tenga atributos como saldo 
// y titular. Crea métodos para depositar y retirar dinero, 
// y para consultar el saldo actual.

public class CuentaBancaria {

    //metodo que ingresa dinero.
    public void depositaDinero(int cantidad) {
        saldo += cantidad;
    }
    
    //metodo que retira dinero
    public void retirarDinero(int cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            System.out.println("No hay suficiente saldo para retirar esa cantidad.");
        }
    }

    //Atributos o parametros de la calse cuentaBancaria.
    private int saldo;
    private String titular;

    //Constructor con todos los paramtros de la clase
    public CuentaBancaria(int saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    //metodos getters y setters
    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    //metodo toString para mostrar lops objetos que construimos por la consola
    @Override
    public String toString() {
        return "CuentaBancaria [saldo=" + saldo + ", titular=" + titular + "]";
    }

}
