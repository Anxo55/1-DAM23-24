package POO;

// Crea una clase CuentaBancaria con atributos de saldo y titular de la cuenta. 
// Implementa métodos para depositar, retirar y consultar el saldo.

public class CuentaBancaria {

    private int saldo;
    private String titular;

    CuentaBancaria() {
        this.saldo = 4000;
        this.titular = "Antonio";
    }

    CuentaBancaria(int saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
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

    // Implementa métodos para depositar, retirar y consultar el saldo.

    public double ingresaDinero(int ingresa) {
        saldo= saldo +ingresa;
        return ingresa;
    }
    public double retirarDinero(int retirar) {
        saldo = saldo - retirar;
        return retirar;
    }
    public void consultaSaldo() {
        System.out.println("El saldo alctual de "+titular+" es de "+saldo+" euros");
    }

    @Override
    public String toString() {
        return "CuentaBancaria [saldo=" + saldo + ", titular=" + titular + "]";
    }
    
}
