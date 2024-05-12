package Perplexity.POO;

public class cuentaBancaria {

    private int saldo;
    private String titular;

    //Constructor con todos los paramtros o atributos.
    public cuentaBancaria(int saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    //Metodos getters y setters
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

    public void depositarDinero(int cantidad) {
       saldo += cantidad; 
    }

    public void retirarDinero(int cantidad) {
        saldo -= cantidad;
    }

    //Metodo toString para mostrar por pantalla los objetos
    @Override
    public String toString() {
        return "cuentaBancaria [saldo=" + saldo + ", titular=" + titular + "]";
    }

    
}
