// Se desea llevar un control del estado de una cuenta corriente; la cuenta corriente está 
// caracterizada por su saldo y el nombre de su titular y sobre ella se pueden realizar tres tipos de 
// operaciones:
// · Saldo: devuelve el saldo de la cuenta (puede ser negativo).
// · Depósito (cantidad): ingresa en la cuenta una cantidad de dinero.
// · Retiro (cantidad): saca de la cuenta una determinada cantidad de dinero.
// Suponga que la cuenta inicialmente tiene un saldo igual a cero.
// Además, necesitamos un contador de todas las cuentas bancarias existentes.
// Prepare dos Constructores apropiados para la clase. Implemente métodos setters/getters y toString.
// Escriba una clase Cuenta Corriente que implemente las funcionalidades descritas.
// Crea una clase apropiada de testeo comprobando todos los métodos.


public class Ejercicio3B {

    private int saldo;
    private String titular;
    private static int contadorCuentas = 0;

    Ejercicio3B(int saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
        contadorCuentas++;
    }

    Ejercicio3B() {
        this.saldo = 0;
        this.titular = "Sin titular";
        contadorCuentas++;
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

    public static int getContadorCuentas() {
        return contadorCuentas;
    }

    public static void setContadorCuentas(int contadorCuentas) {
        Ejercicio3B.contadorCuentas = contadorCuentas;
    }

    public void deposito(double cantidad) {
        saldo += cantidad;
        System.out.println("Depósito de $" + cantidad + " realizado. Nuevo saldo: $" + saldo);
    }

    public void retiro(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro de $" + cantidad + " realizado. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar el retiro.");
        }
    }

    @Override
    public String toString() {
        return "Ejercicio3B [saldo=" + saldo + ", titular=" + titular + "]";
    }

    
}
