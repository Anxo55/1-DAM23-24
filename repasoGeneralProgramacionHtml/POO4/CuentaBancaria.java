package POO4;

// Crea una clase CuentaBancaria con atributos como saldo y métodos para depositar, retirar y consultar saldo. 
// Asegúrate de manejar adecuadamente los saldos negativos.

public class CuentaBancaria {

    private int saldo;
    private String titular;
    private String banco;

    CuentaBancaria() {
        this.saldo = 2500;
        this.titular = "Adolfo";
        this.banco = "BBVA";    
    }

    CuentaBancaria(int saldo, String titular, String banco) {
        this.saldo = saldo;
        this.titular = titular;
        this.banco = banco;
    }

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

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public int ingresoDinero(int ingreso) {
       saldo = saldo + ingreso;
       return saldo;
    }

    public int retiraDinero(int retiro) {
        saldo  = saldo - retiro;
        return saldo;
    }

    @Override
    public String toString() {
        return "CuentaBancaria [saldo=" + saldo + ", titular=" + titular + ", banco=" + banco + "]";
    }
    
}
