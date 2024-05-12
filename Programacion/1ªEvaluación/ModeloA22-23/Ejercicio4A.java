public class Ejercicio4A {

     private double saldo;
    private String titular;
    private String numeroCuenta;
    private static int contadorCuentas = 0;

    // Constructores
    public Ejercicio4A() {
        this.saldo = 0.0;
        this.titular = "Sin titular";
        this.numeroCuenta = generarNumeroCuenta();
        contadorCuentas++;
    }

    public Ejercicio4A(double saldoInicial, String titular, String numeroCuenta) {
        this.saldo = saldoInicial;
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        contadorCuentas++;
    }

    // Métodos
    public double getSaldo() {
        return saldo;
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

    public void interes(double porcentaje) {
        double aumento = saldo * (porcentaje / 100);
        saldo += aumento;
        System.out.println("Interés del " + porcentaje + "% aplicado. Nuevo saldo: $" + saldo);
    }

    public static int getContadorCuentas() {
        return contadorCuentas;
    }

    private String generarNumeroCuenta() {
        // Implementación para generar un número de cuenta único
        // Puedes utilizar, por ejemplo, un contador incremental
        return "CC" + contadorCuentas;
    }

    @Override
    public String toString() {
        return "CuentaCorriente [titular=" + titular + ", numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + "]";
    }
}
